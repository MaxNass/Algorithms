package New_In_Java_8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapReduceOptionalsMain {

    public static void main (String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> list = Arrays.asList(list1, list2, list3);

        list.stream().map(l -> l.size()).forEach(System.out::println);

        // Or we can write
        Function<List<?>, Integer> size = List::size;
        list.stream().map(size).forEach(System.out::println);

        // Using flatMap
        // We created a list of stream -> when we flatmap we create a stream of each value of these lists
        System.out.println("FlatMapping elements : ");
        Function<List<Integer>, Stream<Integer>> flatMapper = l -> l.stream();
        list.stream().flatMap(flatMapper).forEach(System.out::println);


        // Reduce method will use Binary Operation
        // The sum of a empty Stream is the identity element
        // The sum of a Stream with only one element is equal the element
        // Reductions are terminal operations
        final BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2;
        final BinaryOperator<Integer> betterSum = Integer::sum;
        final Integer id = 0;
        // final Stream<Integer> streamInteger = Stream.of(1,2,3,4,5); We are not going to use this anymore cause a new stream must be created for a new operation
        // A stream when it has been used to process a set of data, it cannot be used again to process another set
        final List<Integer> integers = Arrays.asList(1,2,3,4,5);
        final int red = integers.stream().reduce(id, betterSum);
        System.out.println("The sum of streamInteger = " + red);

        // Optional = there might be no result
        Optional<Integer> max = integers.stream().max(Comparator.naturalOrder());
        if(max.isPresent()) System.out.println(max.get());


        final List<SimpleOffer> simpleOffersFilteredBySiteId = new ArrayList<>();
        SimpleOffer simpleOffer1 = new SimpleOffer(1, "site1");
        SimpleOffer simpleOffer2 = new SimpleOffer(2, "site1");
        SimpleOffer simpleOffer3 = new SimpleOffer(3, "site2");
        SimpleOffer simpleOffer4 = new SimpleOffer(4, "site2");
        simpleOffersFilteredBySiteId.add(simpleOffer1);
        simpleOffersFilteredBySiteId.add(simpleOffer2);
        simpleOffersFilteredBySiteId.add(simpleOffer3);
        simpleOffersFilteredBySiteId.add(simpleOffer4);

        final Optional<Integer> min = simpleOffersFilteredBySiteId
                .stream()
                .map(simpleOffer -> simpleOffer.getId())
                .filter(ii -> ii > 2)
                .min(Comparator.naturalOrder());


        final Map<Integer, List<SimpleOffer>> mapGroupedById =
                simpleOffersFilteredBySiteId
                        .stream()
                        .collect(Collectors.groupingBy(SimpleOffer::getId));
        System.out.println(mapGroupedById);

        final Map<Integer, Long> mapGroupedByNumberOfElements =
                simpleOffersFilteredBySiteId
                        .stream()
                        .collect(Collectors.groupingBy(SimpleOffer::getId,  Collectors.counting()));
        System.out.println(mapGroupedByNumberOfElements);

        final Map<Integer, List<String>> mapGroupedBySiteOfElements =
                simpleOffersFilteredBySiteId
                        .stream()
                        .collect(Collectors.groupingBy(SimpleOffer::getId,  Collectors.mapping(SimpleOffer::getSite, Collectors.toList())));
        System.out.println(mapGroupedBySiteOfElements);


    }
}

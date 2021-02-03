package new_In_Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicates {

    public static void main (String[] args) {

        Stream<String> stream = Stream.of("one", "Two", "Three", "Four", "Five");

        //stream.forEach(s -> System.out.println(s));

        Predicate<String> predicate = s -> s.length() >3;

        Predicate<String> predicate2 = Predicate.isEqual("Two");

        Predicate<String> predicate3 = Predicate.isEqual("Three");

        //stream.filter(predicate2.or(predicate3)).forEach(s -> System.out.println(s));

        // The stream can not hold any data
        // The call to filter method is a lazy call, it's only a declaration, no processing any data
        // All the methods of stream  are all lazy calls

        // Peek method return a stream (peek is an intermediate operation, forEach is a final operation)
        // Only a final operation will trigger the processing of data the stream is connected to
        // Two final operations cannot be applied on a stream (a new stream must be created for the second operation)
        List<String> list = new ArrayList<>();
        stream.peek(System.out::println).filter(predicate2.or(predicate3)).peek(list::add); // display nothing because peek is an intermediate operation
        stream.peek(System.out::println).filter(predicate2.or(predicate3)).forEach(list::add);
        System.out.println("size of List = " + list.size());

    }

}

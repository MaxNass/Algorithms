package New_In_Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args) {

        final List<SimpleOffer> simpleOffersFilteredBySiteId = new ArrayList<>();
        SimpleOffer simpleOffer1 = new SimpleOffer(1, "site");
        simpleOffersFilteredBySiteId.add(simpleOffer1);

        System.out.println(simpleOffersFilteredBySiteId.size());

        List<SimpleOffer> result = simpleOffersFilteredBySiteId
                .stream()
                .filter(simpleOffer -> !"site1".equals(simpleOffer.getSite()))
                .collect(Collectors.toList());

        System.out.println(result.size());



    }
}

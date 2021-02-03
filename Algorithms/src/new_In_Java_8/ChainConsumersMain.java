package new_In_Java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumersMain {

    public static void main (String[] args) {


        List<String> strings = Arrays.asList("one", "Two", "Three", "four", "five");

        List<String> result = new ArrayList<>();

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = result::add;

        strings.forEach(c1.andThen(c2));
        System.out.println("Size of results = " + result.size());

    }
}

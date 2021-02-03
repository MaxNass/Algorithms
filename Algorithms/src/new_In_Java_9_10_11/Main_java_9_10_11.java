package new_In_Java_9_10_11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main_java_9_10_11 {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("http://www.google.com/get"))
                .GET()
                .build();

        HttpResponse<String> httpResponse = HttpClient
                .newHttpClient()
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());


        Stream.of("a", "b", "c", "d").takeWhile(s -> !s.equals("c")).forEach(System.out::println); // display "ab"

        Stream.of("a", "b", "c", "d").dropWhile(s -> !s.equals("c")).forEach(System.out::println); // display "cd"

        Stream.ofNullable(null); // return an empty stream, without NullPointerException obviously

        IntStream.iterate(1, i -> i < 10, i -> i + 1); // equivalent to a loop "for" from 0 to 9

        // A new method appears
        List<String> list = List.of("AWS", "ReactJs", "Java");

        // In java 10 var has been introduced
        // sometimes var will be confusing so the best practice is to have a well understandable variable noun
        var otherList = List.of("AWS", "ReactJs", "Java");
        otherList.add("International_finance");

        // In Java 10 -> method copyOf appears
        var original = new ArrayList<>(List.of("AWS", "ReactJs", "Java"));
        var copy = List.copyOf(original);
        original.set(2, "Scala");
        System.out.println(copy.get(2)); // display Java

        // In Java 11 we can now use the var parameter as a parameter in lambda expression
        var original_bis = List.of("AWS", "ReactJs", "Java");
        original.stream().filter((var s) -> s.contains("X")).forEach(System.out::println);
    }

}

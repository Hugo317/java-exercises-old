import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        String message = "I'll send an SOS to the garbage world, " +
                "I hope that someone garbage gets my message in a garbage bottle.";

        System.out.println((Stream.of(message.split(" "))
                .filter(string -> !string.equals("garbage"))
                .map(word -> word.toUpperCase())
                .reduce((acc, word) -> acc + word + " ")));

      

        Stream<String> words = Stream.of(message.split(" "));
        Stream<String> filtredWords = words.filter(word -> !word.equals("garbage"));
        Stream<String> loudWords = filtredWords.map(word -> word.toUpperCase());
        String solvedString = loudWords.reduce("",(acc,word)-> acc + word +  " ");
        System.out.println(solvedString);
    }

}

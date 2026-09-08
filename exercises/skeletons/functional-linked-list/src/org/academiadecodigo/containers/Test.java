package org.academiadecodigo.containers;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {

        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        Predicate<Integer> isOdd = num -> num % 2 != 0;
        numbersList.anyMatch(isOdd);
        numbersList.allMatch(isOdd);
        LinkedList<Integer> filteredNums = numbersList.filter(isOdd);

        Function<String, Integer> wordLength = word -> word.length();
        int length = wordLength.apply("Christina");

        LinkedList<String> transformed = numbersList.map(num -> "The number is " + num);
        int sum = numbersList.reduce((num, accumulator) -> num + accumulator, 0);


    }
}

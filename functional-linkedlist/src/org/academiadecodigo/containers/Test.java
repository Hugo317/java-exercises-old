package org.academiadecodigo.containers;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        Predicate<Integer> isOdd = num -> num % 2 !=  0;
        System.out.println(numbersList.anyMatch(isOdd));
        System.out.println(numbersList.allMatch(isOdd));


        LinkedList<Integer> filteredNums = numbersList.filter(isOdd);
        System.out.println(filteredNums.get(0));
        System.out.println(filteredNums.get(1));
        System.out.println(filteredNums.get(2));

        Function<String, Integer> wordLength = word -> word.length();
        int lenght = wordLength.apply("Hugo");
        System.out.println(lenght);

        LinkedList<String> strings = numbersList.map(num -> "The number is " + num);
        System.out.println(strings.get(0));
        System.out.println(strings.get(2));
        System.out.println(strings.get(1));
        int sum = numbersList.reduce((num, accumolator) -> num + accumolator, 0);
        System.out.println(sum);
    }
}

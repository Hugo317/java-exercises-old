package org.academiadecodigo.bootcamp;

import java.util.Optional;
import java.util.stream.IntStream;


public class PerfectNumbers {


    public static void main(String[] args) {

        PerfectNumbers perfectNumbers = new PerfectNumbers();
        long start = System.currentTimeMillis();
        perfectNumbers.checkPerfectBetter();
        long end = (System.currentTimeMillis() - start) / 1000;
        System.out.println(end);

    }

    public void checkPerfect(int max){
        IntStream.rangeClosed(1, max)
                .filter(num -> sumDivisors(num) == num)
                .forEach(System.out::println);

    }

    public int sumDivisors(int num){
        return IntStream.range(1, num)
                .filter(n -> num % n == 0)
                .sum();
    }



    public int sumDivisorsBetter(int num){

        int root = (int)Math.sqrt(num);

        int sum = IntStream.rangeClosed(2, root)
                .filter(n -> num % n == 0)
                .parallel()
                .map(n -> n + num / n)
                .sum();

        if(num == root * root){
            sum -= root;
        }
        return sum + 1;
    }

    public void checkPerfectBetter(){
        IntStream.iterate(1, num -> num + 1)
                .filter(num -> sumDivisorsBetter(num) == num)
                .parallel()
                .limit(5)
                .forEach(System.out::println);
    }




}

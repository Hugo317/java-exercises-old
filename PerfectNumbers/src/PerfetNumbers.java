import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerfetNumbers {
    public static void main(String[] args) {
    PerfetNumbers perfectNumbers = new PerfetNumbers();
    long start = System.currentTimeMillis();
    int result = perfectNumbers.sumDivisors(6);
    //int soma = perfectNumbers.sumDivisorBetter(10);
   //     System.out.println("soma " + soma);
    //perfectNumbers.checkPerfect(100000);

        perfectNumbers.checkPerfectBetter();
        System.out.println("time elapse: " +((System.currentTimeMillis()-start)/1000));
    }
       public int sumDivisors (int num){
        return IntStream.range(1,num)
                .filter(n -> num %n == 0)
                .sum();
    }

        public void checkPerfect (int max){
        IntStream.rangeClosed(1,max)
                .filter((num -> sumDivisors(num) == num))
                .forEach(System.out::println);
        }
        public int sumDivisorBetter(int num){
        int root = (int)Math.sqrt(num);
        int sum = IntStream.rangeClosed(2,root)
                .filter(n -> num % n == 0)
                .parallel()
                .map(n -> n + num / n)
                .sum();
        if(num == root *root){
        sum -= root;
        }
        return sum + 1;
        }

        public void checkPerfectBetter(){
            IntStream.iterate(1,num -> num +1)
                    .filter( num -> sumDivisorBetter(num) == num)
                    .parallel().limit(5)
                    .forEach(System.out::println);
        }
}

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("era uma vez batatas 1 2 2 5 88");

        WordHistogram wh = new WordHistogram(sb);
        wh.createHistogram();


    }

}

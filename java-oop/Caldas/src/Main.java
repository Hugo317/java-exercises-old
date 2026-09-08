public class Main {
    public static void main(String[] args) {
        System.out.println("PATRAO: toca a trabalhar");
        System.out.println("PATRAO: Parece que o meu trabalhota feito");
        Thread thread = new Thread(new TrabalhadorDasCaldas());
        thread.start();
        try{
            thread.join();
        } catch ( InterruptedException e ){
            System.out.println(e.getMessage());
        }





        System.out.println("PATRAO: Acabou o dia vou trancar a fabrica");



    }



}

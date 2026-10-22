public class Main2 {
    public static void main(String[] args) {

        try {
            System.out.println("Iniciando...");

            Thread.sleep(3000);

            System.out.println("Finalizado!");

        } catch (InterruptedException e) {
            System.out.println("Ocorreu um erro!");
        }
    }
}
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Digite um número:");

        //Criar um objeto para controlar entrada

        Scanner input = new Scanner(System.in);

        //Lendo um inteiro do teclado e armazenando
        num1 = input.nextInt();

        System.out.println("Digite outro número:");

        num2 = input.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é " + soma);
        input.close();
    }
}

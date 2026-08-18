import java.util.Scanner;

public class par_ou_impar {
    public static void main(String[] args) {
        int num1;
        System.out.println("Digite um número: ");

        Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        if(num1 % 2==0)
        {
            System.out.println("O numero é par");
        }
        else
        {
            System.out.println("O número é impar");
        }
    }
}

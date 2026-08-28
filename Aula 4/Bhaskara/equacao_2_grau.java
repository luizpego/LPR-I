import java.util.Scanner;

public class equacao_2_grau {
    private int a;
    private int b;
    private int c;
    private int delta;
    private double bhaskara1;
    private double bhaskara2;

    public void inserir() {
        System.out.println("Digite o valor de a");
        Scanner input = new Scanner(System.in);
        this.a = input.nextInt();
        System.out.println("Digite o valor de b");
        this.b = input.nextInt();
        System.out.println("Digite o valor de c");
        this.c = input.nextInt();
        input.close();
    }

    public void delta() {
        this.delta = (this.b * this.b) - 4 * this.a * this.c;
    }

    public void bhaskara() {
        if (delta < 0) {
            System.out.println("O valor de delta é:"+this.delta+"\n Portanto é menor que 0 e não há raízes");
        } else if (delta == 0) {
            System.out.println("Há apenas uma raiz");
            this.bhaskara1 = (-1 * b + (Math.sqrt(this.delta))) / (2 * this.a);
             System.out.println(this.bhaskara1);
        } else {
            this.bhaskara1 = (-1 * b + (Math.sqrt(this.delta))) / (2 * this.a);
            this.bhaskara2 = (-1 * b - (Math.sqrt(this.delta))) / (2 * this.a);
             System.out.println("Raiz 1:"+this.bhaskara1);
            System.out.println("Raiz 2:"+this.bhaskara2);
        }
    }

    public static void main(String[] args) {
        equacao_2_grau a = new equacao_2_grau();
        a.inserir();
        a.delta();
        a.bhaskara();
    }
}
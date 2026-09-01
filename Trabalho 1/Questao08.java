import java.util.Scanner;

public class Questao08 {
    private double x;
    private double y;

    public void def_values() {
        System.out.println("Digite o valor de x\n");
        Scanner input = new Scanner(System.in);
        this.x = input.nextDouble();
        System.out.println("Digite o valor de y\n");
        this.y = input.nextDouble();
        
    }

    public void show() {
        System.out.println("O valor de x é:" + this.x);
        System.out.println("O valor de y é:" + this.y);
    }
    public double getter_x()
    {
        return this.x;
    }
    public double getter_y()
    {
        return this.y;
    }
    public void calcular(double x, double y) {
        double d;
        d = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        System.out.println("A distância entre os dois valores é:" + d);
    }

    public static void main(String[] args) {
        double x, y;
        Questao08 Ponto1 = new Questao08();
        Questao08 Ponto2 = new Questao08();
        Ponto1.def_values();
        Ponto2.def_values();
        System.out.println("O valor das cordenadas do ponto 1 é:");
        Ponto1.show();
        System.out.println("O valor das cordenadas do ponto 2 é:");
        Ponto2.show();
        x = Ponto2.getter_x();
        y = Ponto2.getter_y();
        Ponto1.calcular(x,y);
}
}

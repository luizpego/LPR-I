package Ponto;

public class Ponto {
    private double x;
    private double y;

    public void set_y(double y)
    {
        this.y = y;
    }
    public void set_x(double x)
    {
        this.x = x;
    }
    public double get_x()
    {
        return this.x;
    }
    public double get_y() {
        return this.y;
    }

    public Ponto() {
        System.out.println("Construtor sem parâmetros\n");
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double B, double A) {
        System.out.println("Construtor com parâmetros\n");
        this.x = A;
        this.y = B;
    }

    public void soma(double x, double y)
    {

    }
}

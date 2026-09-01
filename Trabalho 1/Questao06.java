import java.util.Scanner;

public class Questao06 {
    private String nome;
    private double preco;

    public void setNome(String name) {
        this.nome = name;
    }

    public void setPreco(double x) {
        this.preco = x;
    }
    public void getvalues()
    {
        System.out.println("O nome é:"+this.nome);
        System.out.println("O valor armazenado é:"+this.preco);
    }

    public static void main(String[] args) {
        String nome;
        double x;
        Questao06 Q = new Questao06();
        System.out.println("Digite seu nome\n");
        Scanner input = new Scanner(System.in);
        nome = input.nextLine();
        Q.setNome(nome);
        System.out.println("Digite qual valor você deseja inserir");
        x = input.nextDouble();
        Q.setPreco(x);
        input.close();
        Q.getvalues();
    }
}
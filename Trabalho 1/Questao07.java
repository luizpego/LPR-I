import java.util.Scanner;

public class Questao07 {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public void get_nota() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        this.nome = input.nextLine();
        System.out.println("Digite os valores para as três notas");
        this.nota1 = input.nextDouble();
        this.nota2 = input.nextDouble();
        this.nota3 = input.nextDouble();
        input.close();
    }

    public double media() {
        int soma = 0;
        soma += nota1;
        soma += nota2;
        soma += nota3;
        double media = soma / 3;
        System.out.println("O valor da media é:"+media);
        return media;
    }

    public void aprovar() {
        if (this.media() >= 60)
            System.out.println("Aprovado");
        else
            System.out.println("Reprovado");
    }

    public static void main(String[] args) {
        Questao07 Aluno = new Questao07();
        Aluno.get_nota();
        Aluno.media();
        Aluno.aprovar();

    }
}

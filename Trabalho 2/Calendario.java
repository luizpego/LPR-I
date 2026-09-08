import java.util.Scanner;

public class Calendario {
    /**
     * Função que recebe como parâmetro o dia, mês e o ano;
     * e retorna o dia da semana equivalente a esta data:
     * 0 -> Domingo
     * 1 -> Segunda-feira
     * 2 -> Terça-feira
     * ...
     * 6 -> Sábado
     */
    public int diaSemana(int dia, int mes, int ano) {
        int f;
        f = ano + dia + 3 * (mes - 1) - 1;
        if (mes < 3) {
            ano = ano - 1;
        }
        if (mes >= 3) {
            f = f - (int) (0.4 * mes + 2.3);
        }
        f = f + (ano / 4) - (int) ((ano / 100 + 1) * 0.75);
        f = f % 7;
        return f;
    }

    /**
     * Função que recebe como parâmetro o ano e retorna um valor lógico
     * indicando se o ano é bissexto (true) ou não (false).
     */
    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    /**
     * Função que recebe como parâmetro o mês e o ano e retorna a
     * quantidade de dias do mês.
     */
    public int diasNoMes(int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return -1; // Mês inválido
        }
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            default:
                return 31;
        }
    }

    public void imprimeMes() {
        System.out.println("Qual mês você deseja imprimir?");
        Scanner input = new Scanner(System.in);
        int mes = input.nextInt();
        System.out.println("Qual ano você deseja imprimir?");
        int ano = input.nextInt();
        input.close();
       if (diasNoMes(mes, ano) == 30) {
    this.diaSemana(1, mes, ano);

    System.out.println("Dom\tSeg\tTer\tQua\tQui\tSex\tSab");

    for (int i = 1; i <= 30; i++) {
        System.out.print(i + "\t");

        if (i % 7 == 0) {
            System.out.println();
        }
    }
}
    }
    public static void main(String[] args) {
        Calendario calendario = new Calendario();
        calendario.imprimeMes();
    }
}
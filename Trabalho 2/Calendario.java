import java.util.Scanner;

public class Calendario {

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

    public boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int diasNoMes(int mes, int ano) {

        if (mes < 1 || mes > 12) {
            return -1;
        }

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if (ehBissexto(ano)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return 31;
        }
    }

    public void imprimeMes(int mes, int ano) {

        int quantidadeDias = diasNoMes(mes, ano);
        int primeiroDia = diaSemana(1, mes, ano);

        System.out.println();
        System.out.println("Mes " + mes + " - " + ano);
        System.out.println("Dom\tSeg\tTer\tQua\tQui\tSex\tSab");

        for (int i = 0; i < primeiroDia; i++) {
            System.out.print("\t");
        }

        for (int dia = 1; dia <= quantidadeDias; dia++) {

            System.out.print(dia + "\t");

            if ((dia + primeiroDia) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public void imprimeCalendario(int ano) {

        for (int mes = 1; mes <= 12; mes++) {
            imprimeMes(mes, ano);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calendario calendario = new Calendario();

        System.out.println("Digite um mes:");
        int mes = input.nextInt();

        System.out.println("Digite um ano:");
        int ano = input.nextInt();

        calendario.imprimeMes(mes, ano);
        calendario.imprimeCalendario(ano);

        input.close();
    }
}
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        // Exercicio 1

        Stack copia = new Stack(pilha, pilha.size());
        // Objeto original
        pilha.show();
        // Remove um elemento da pilha e prova que são independentes pois não vai
        // auterar a do objeto copia=
        pilha.pop();
        // Objeto copiado
        copia.show();

        // Exercicio 2
        Scanner input = new Scanner(System.in);

        int valor = 0;
        System.out.println("Digite um valor\n");
        valor = input.nextInt();

        Stack exercicio_2 = new Stack(valor);
        System.out.println("Valores originais exercicio 2:");
        exercicio_2.show();

        System.out.println("Valores removidos um a um");
        for (int i = 0; i < valor; i++) {
            exercicio_2.pop();
            exercicio_2.show();
        }

        //Exercicío 3

        Stack aux1 = new Stack(20);
        Stack aux2 = new Stack(20);

        Stack Original_A = new Stack();
        Stack Original_B = new Stack();

        Stack main = new Stack();

        if(main.equal(aux1,aux2, Original_A, Original_B))
        {
            System.out.println("Pilhas iguais");
        }
        else
        {
            System.out.println("Pilhas diferentes");
        }
        System.out.println("Pilha original A");
        Original_A.show();

        System.out.println("Pilha Original B");
        Original_B.show();
    }
}
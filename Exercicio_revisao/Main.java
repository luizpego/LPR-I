import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);


        Stack copia = new Stack(pilha, pilha.size());
        //Objeto original
        pilha.show();
        //Remove um elemento da pilha e prova que são independentes pois não vai auterar a do objeto copia=
        pilha.pop();
        //Objeto copiado
        copia.show();
    }
}
import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        pilha.push(10);

        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.show();
        try {
            for (int i = 0; i < 6; i++) {
                pilha.pop();
                pilha.show();
            }
        } catch (EmptyStackException erro) {
            System.out.println("Erro Pilha Vazia !! \n");
        }
    }
}
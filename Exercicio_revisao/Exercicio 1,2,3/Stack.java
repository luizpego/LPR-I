import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int n;

    public Stack() {
        this.top = null;
        this.n = 0;
    }

    // Construtor exercicio 2
    public Stack(int n) {
        for (int i = 1; i < n + 1; i++) {
            this.push(i); // Empilha os valores de 1 ate n
        }
    }

    // Construtor copia-exercicio 1
    public Stack(Stack outra, int quantidade) {
        Node nn = outra.top;
        int i = 0;
        int[] valores = new int[quantidade];

        while (nn != null) {
            valores[i] = nn.getItem();

            if (nn.getNext() == null) {
                break;
            }
            i++;
            nn = nn.getNext();
        }
        for (i = quantidade; i != 0; i--) {
            this.push(valores[i - 1]);
        }
    }

    // Exercicio 3
    public static boolean equal(Stack a, Stack b, Stack Original_A, Stack Original_B) {
        int aux = 0;
        int aux2 = a.size();
        if (a.size() != b.size()) {
            return false;
        } else // A duas pilhas tem o mesmo tamanho
        {
            for (Node t = a.top; t != null; t = t.getNext()) {
                if (a.getTop() == b.getTop()) {
                    aux++;
                }
                Original_A.push(a.getTop());
                Original_B.push(b.getTop());
                a.pop();
                b.pop();
            }

            if (aux == aux2) {
                return true;
            }

            return false;
        }
    }

    public void push(int item) {
        Node novo = new Node();
        novo.setItem(item);
        novo.setNext(this.top);
        this.top = novo;
        this.n++;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int valor = this.top.getItem();
        this.top = this.top.getNext();
        this.n--;
        return valor;
    }

    public int getTop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.top.getItem();
    }

    public boolean isEmpty() {
        return this.n == 0;
    }

    public int size() {
        return this.n;
    }

    public void clear() {
        this.top = null;
        this.n = 0;
    }

    public void show() {
        Node novo = this.top;
        while (novo != null) {
            System.out.print(novo.getItem() + " ");
            novo = novo.getNext();
        }
        System.out.println();
    }
}
import java.util.EmptyStackException;

public class Stack {
    private Node top;
    private int n;

    public Stack() {
        this.top = null;
        this.n = 0;
    }

    // Construtor copia
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
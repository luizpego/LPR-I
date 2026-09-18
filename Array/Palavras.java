public class Palavras {
    private final int MAX = 50;
    private String[] palavras;
    private int n;

    public Palavras() { // Construtor
        // Cria um conjunto vazio
        this.palavras = new String[MAX];
        this.n = 0;
    }

    public void inserirPalavra(String p) {
        if (this.n >= MAX) {
            System.out.println("Erro: o array está cheio\n");
            return;
        }

        this.palavras[this.n] = p;
        this.n++;
    }

    public void exibir() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.palavras[i]);
        }
    }

    public String getPalavra(int idx) {
        if (idx >= n || idx < 0) {
            System.out.println("Erro: índice inválido\n");
            return "Erro";
        }

        return this.palavras[idx];
    }
    public static void main(String[] args) {
        
        Palavras p = new Palavras();

        p.inserirPalavra("Uva");
        p.inserirPalavra("Maca");
        p.inserirPalavra("Laranaja");
        p.inserirPalavra("Melancia");
        p.exibir();
        String f = p.getPalavra(2);
        System.out.println(f);
    }
}
import java.util.ArrayList;
public class Palavras_2{
    private int n;
    private ArrayList<String> palavras = new ArrayList<>();
    public Palavras_2() { // Construtor
        this.n = 0;
    }

    public void inserirPalavra(String p) {
        this.palavras.add(n, p);
        this.n++;
    }

    public void exibir() {
        for (int i = 0; i < this.n; i++) {
            System.out.println(this.palavras.get(i));
        }
    }

    public String getPalavra(int idx) {
        if (idx >= n || idx < 0) {
            System.out.println("Erro: índice inválido\n");
            return "Erro";
        }

        return this.palavras.get(idx);
    }
}
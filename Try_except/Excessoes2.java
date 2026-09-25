import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excessoes2 {
    // Esse metodo tem uma grande chance de disparar uma excessao
    // Quero delegar o tratamento de erro dessa excessao para quem
    // For usar esse metodo. Quem for usar o metodo deve OBRIGATORIAMENTE
    // Tratar o erro.
    public static void lerArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
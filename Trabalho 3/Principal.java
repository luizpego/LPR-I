public class Principal {
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

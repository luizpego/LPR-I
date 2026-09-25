public class Principal_2 {
    public static void main(String[] args) {
        
        Palavras_2 p = new Palavras_2();

        p.inserirPalavra("Uva");
        p.inserirPalavra("Maca");
        p.inserirPalavra("Laranja");
        p.inserirPalavra("Melancia");
        p.exibir();
        String f = p.getPalavra(2);
        System.out.println(f);
        
    }
}

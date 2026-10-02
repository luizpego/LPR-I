public class ExemplosUnchecked {
    public static int dividir(int a, int b) throws DefaultUncheckedException
    {
        if(b == 0)
            throw new DefaultUncheckedException("Erro");
        return a/b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(dividir(a,b));
    }
}

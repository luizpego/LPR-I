public class Exercicio_7 {

    public void divisao(int a, int b)
    {
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Erro ao dividir por zero");
        }
    }
}

public class Principal {

    //A função main é a função principal que pode ser executada.
    //Classes sem essa função não podem ser executadas.
public static void main(String[] args) {
    //Criando um objeto do tipo aluno
    Aluno a = new Aluno();

    a.inicializa("Fernando", "12345");
    a.aprensentacao();
}

}

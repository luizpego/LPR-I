package Static;

public class Aluno {

    private static int qtd = 0; //Pertence a classe não ao objeto.
    
    private int codigo; //Atributos de instância portanto pertencem ao objeto.
    private String nome;
    public static void getqtd()
    {
        System.out.println("A quantidade de alunos é:"+Aluno.qtd);
    }
    public Aluno (int codigo, String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
        
        Aluno.qtd++;
    }
    public void mostraAluno(){
        System.out.println("Código:" + this.codigo);
        System.out.println("Nome:" + this.nome);
    }

    

}

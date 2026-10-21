public class Alunos {

    private String nome;
    private int matricula;
    private String curso;
    private int idade;

    public Alunos()
    {
        this.nome = null;
        this.matricula = 0;
        this.curso = null;
        this.idade = 0;
    }

    //Exercicio 5
    public Alunos(String nome, int matricula)
    {
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    public Alunos(String nome, int matricula, String Curso, int idade)
    {
        this.setNome(nome);
        this.setIdade(idade);
        this.setMatricula(matricula);
        this.setNome(nome);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }
}

public class Exibir {
    public static void Exibir(Alunos a) {
        if (a.getNome() != null) {
            System.out.println("Nome do aluno:" + a.getNome());
        }
        else
        {
            System.out.println("O nome do aluno esta não foi definido");
        }
        if(a.getCurso() !=null)
        {
            System.out.println("Curso do aluno:" + a.getCurso());
        }
        else
        {
            System.out.println("O curso do aluno não foi definido");
        }
        if(a.getIdade() !=0)
        {
            System.out.println("Idade do aluno:" + a.getIdade());
        }
        else
        {
            System.out.println("A idade do aluno não foi definida");
        }
        if(a.getMatricula() !=0)
        {
            System.out.println("Matricula do aluno:" + a.getMatricula());
        }
        else
        {
            System.out.println("A matricula do aluno não foi definida");
        }
    }
}

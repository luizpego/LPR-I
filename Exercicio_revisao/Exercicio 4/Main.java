public class Main {
   public static void main(String[] args) {
      //Exercicio 4

      Exibir aux = new Exibir();
      Alunos a1 = new Alunos(); // Objeto 1
      Alunos a2 = new Alunos(); // Objeto 2
      Alunos a3 = new Alunos(); // Objeto 3

      a1.setCurso("Sistemas de informação");
      a2.setCurso("Ciências da computação");
      a3.setCurso("Engenharia de software");

      a1.setIdade(19);
      a2.setIdade(20);
      a3.setIdade(21);

      a1.setMatricula(1234);
      a2.setMatricula(4321);
      a3.setMatricula(3124);

      a1.setNome("Luiz");
      a2.setNome("Pedro");
      a3.setNome("João");

      System.out.println("Aluno 1");
      aux.Exibir(a1);
      System.out.println("Aluno 2");
      aux.Exibir(a2);
      System.out.println("Aluno 3");
      aux.Exibir(a3);

      //Exercicio 5

      Alunos a4 = new Alunos("Luiz", 1234);
      Alunos a5 = new Alunos("João", 3214,"Sistemas de informação", 20);
      System.out.println("------------");
      System.out.println("Exercicio 5");
      System.out.println("-------------");
      System.out.println("Aluno construtor nome, idade:");
      aux.Exibir(a4);
      System.out.println("Aluno construtor nome,idade,matricula e curso:");
      aux.Exibir(a5);
      
   }
}

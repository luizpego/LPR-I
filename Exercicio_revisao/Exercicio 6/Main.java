public class Main {
    public static void main(String[] args) {
        Universidade.setNome("IFMG");

        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno c = new Aluno();

        a.setNome("Luiz");
        b.setNome("Ana");
        c.setNome("Pedro");

        Aluno[] alunos = {a, b, c};

        System.out.println("Antes da alteração:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + Universidade.getNome());
        }

        Universidade.auterar_nome("IFMG-SJE");

        System.out.println("\nDepois da alteração:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + Universidade.getNome());
        }
    }
}
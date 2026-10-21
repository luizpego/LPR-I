public class Universidade {
    private static String nome;
    private int alunos_quantidade;
    private String cidade;
    private int ano_fundaocao;

    public static void  auterar_nome(String nome)
    {
        Universidade.nome = nome;
    }

    public void setAlunos_quantidade(int alunos_quantidade) {
        this.alunos_quantidade = alunos_quantidade;
    }

    public void setAno_fundaocao(int ano_fundaocao) {
        this.ano_fundaocao = ano_fundaocao;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public static void setNome(String nome) {
        Universidade.nome = nome;
    }

    public int getAlunos_quantidade() {
        return alunos_quantidade;
    }

    public int getAno_fundaocao() {
        return ano_fundaocao;
    }

    public String getCidade() {
        return cidade;
    }

    public static String getNome() {
        return nome;
    }

}
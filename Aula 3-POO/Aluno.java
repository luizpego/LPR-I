public class Aluno {

    //Atributos
    private String nome;
    private String RA;
    private String nasc;
    
    //Métodos
    public void inicializa(String name, String RA){
        this.nome = name;
        this.RA = RA;
    }
    public void aprensentacao(){
        System.out.println("Olá! Eu sou:"+this.nome+" Meu RA é:"+this.RA);
    }
}
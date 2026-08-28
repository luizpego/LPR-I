public class Soma{ //Classe
    private int a;//Atributos privados
    private int b;
    private int r;
    public void init(int a, int b)  //Métodos públicos
    {
        this.a=a;
        this.b=b;
    }
    public void FazOperacao()   
    {
        this.r = this.a+this.b;
    }
    public int getRes()
    {   
    return this.r;
    }
}
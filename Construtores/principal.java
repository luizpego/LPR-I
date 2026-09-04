package Ponto;

public class principal {
    
    public static void main(String[] args) {
        Ponto p1 = new Ponto(10,15);

        Ponto p2 = new Ponto(10,15);
        Ponto p3 = new Ponto();
        
        p3.set_x(p1.get_x() + p2.get_x());
        p3.set_y(p1.get_y() + p2.get_y());
        System.out.println("X:"+p3.get_x()+" Y:"+p3.get_y());
    }
}

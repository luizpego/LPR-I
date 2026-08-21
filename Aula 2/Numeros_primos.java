public class Numeros_primos {
    public static void main(String[] args) {
        int aux = 0, flag = 0;
        for(int i = 1; i < 1000000; i++)
        {
            aux = 0;
            if(flag == 100)
            {
                break;
            }
            for(int j = 1; j < i; j ++)
            {
                if(i%j==0)
                {
                    aux++;
                }
            }
            if(aux == 1)
            {
                System.out.println("" + i);
                flag++;
            }
        }
    }
}

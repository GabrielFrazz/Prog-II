package application;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int calculaSequencia(int n, int aux){
        int F;

        if(n == 1){
            F = 1;
            return F;
        }
        if(n == 2){
            F = 2;
            return F;
        }
        else{
            aux = n - 1;
            return 0;
        }
       
    }
}

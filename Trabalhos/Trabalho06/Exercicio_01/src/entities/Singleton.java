package entities;

public class Singleton {

    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if(singleton == null){
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

    public void print(){
        System.out.println("**!faz alguma coisa!**  ");
    }
}

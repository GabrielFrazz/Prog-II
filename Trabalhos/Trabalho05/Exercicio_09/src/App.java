
public class App {
    public static void main(String[] args) throws Exception {
       
        try{
            someMethod();
        }catch(IllegalAccessError e){
            System.out.println("erro");
            e.printStackTrace();
        }
    }

    public static void someMethod(){
        try{
            someMethod2();
        }catch(AbstractMethodError e){
            System.out.println("teste2"); // não deve ser executado
        }
    }

    public static void someMethod2(){
        try{
            throw new IllegalAccessError();
        }catch(BootstrapMethodError e){
            System.out.println("teste1"); //não deve ser executado
        }
    }
}

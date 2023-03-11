public class App {
    public static void main(String[] args) throws Exception {
        try{
        metodo();
        }catch(IllegalAccessError e){
            System.out.println("erro");
            e.printStackTrace();
        }
    }
    
    public static void metodo(){
        
        try{
            throw new IllegalAccessError();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("teste"); //não deve ser impresso
            System.out.println(e.getMessage());
        }
    }
}

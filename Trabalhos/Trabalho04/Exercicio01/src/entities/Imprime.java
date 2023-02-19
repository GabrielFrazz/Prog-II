package entities;

public class Imprime extends Out{

    @Override
    public void flush(Form[] forms) {
        int i = 1;
        for(Form f : forms){
            System.out.println("-----formulario #" + i + "-----");
            System.out.println(f);
            i++;
            System.out.println();
        }
    }
    
}
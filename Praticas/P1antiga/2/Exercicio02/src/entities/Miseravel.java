package entities;

public class Miseravel extends Pessoa{
    
    public Miseravel(String nome, Integer idade){
        super(nome, idade);
    }

    public void mendiga(){
        System.out.println("da um dinherim pro pai :(");
    }
}
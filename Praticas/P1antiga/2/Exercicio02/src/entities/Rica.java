package entities;

public class Rica extends Pessoa{
    
    private Double dinheiro;

    public Rica(Double dinheiro, String nome, Integer idade){
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public Double getDinheiro(){
        return dinheiro;
    }

    public void fazCompras(Double preco){
        dinheiro = dinheiro - preco;
        System.out.println("this is elon musk");
    }
}
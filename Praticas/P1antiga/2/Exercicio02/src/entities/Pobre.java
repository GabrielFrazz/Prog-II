package entities;

public class Pobre extends Pessoa{

    public Pobre(String nome, Integer idade){
        super(nome, idade);
    }

    public void trabalha(){
        System.out.println("trabalhar né? dinheiro não cai do céu");
    }
}
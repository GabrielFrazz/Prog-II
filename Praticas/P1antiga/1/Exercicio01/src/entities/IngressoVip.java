package entities;

public class IngressoVip extends Ingresso{

    public static final Double VALORADICIONAL = 100.00;

    public IngressoVip(Double valor ) {
        super(valor+VALORADICIONAL);
        //TODO Auto-generated constructor stub
    }
    
    public void imprimeValor(){
        System.out.println("valor = " + String.format("%.2f", super.getValor()));
    }
}
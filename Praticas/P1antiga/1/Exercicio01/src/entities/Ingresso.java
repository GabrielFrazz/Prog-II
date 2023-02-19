package entities;

public class Ingresso {
    
    private Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public void imprimeValor(){
        System.out.println("valor = " + String.format("%.2f", valor));
    }

}
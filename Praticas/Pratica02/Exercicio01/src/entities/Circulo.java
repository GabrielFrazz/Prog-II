package entities;

public class Circulo extends FormaBidimencional{
    
    protected static final double pi = 3.14;
    private Double raio;


    public Circulo(Double i) {
        this.raio = i;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea(){
        return pi*(raio*raio);
    }

    @Override
    public double calculaPerimetro(){
        return 2*pi*raio;
    }

   
}
package entities;

public class Circulo implements FormaGeometrica{
    
    public static final Double PI = 3.141592653;
    private Double raio;

    public Circulo (Double raio){
        this.raio = raio;
    }

    @Override
    public Double area(){
        return PI * (raio*raio);
    }

    @Override
    public Double comprimento(){
        return 2*(PI*raio);
    }
}
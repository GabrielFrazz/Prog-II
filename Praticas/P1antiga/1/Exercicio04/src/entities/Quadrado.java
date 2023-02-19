package entities;

public class Quadrado implements FormaGeometrica{
    
    private Double lado;

    public Quadrado(Double lado){
        this.lado = lado;
    }

    @Override
    public Double area() {
        return lado * lado;
    }

    @Override
    public Double comprimento() {
        return 4*lado;
    }
    
}
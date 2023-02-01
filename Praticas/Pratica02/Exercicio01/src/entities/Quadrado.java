package entities;

public class Quadrado extends FormaBidimencional{
    
    private Double lado;
    
    public Quadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea(){
        return Math.pow(lado, 2);
    }

    @Override
    public double calculaPerimetro(){
        return 4*lado;
    }
}
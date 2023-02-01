package entities;

public class Triangulo extends FormaBidimencional{
    
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea(){
        return (base*altura)/2;
    }

    @Override
    public double calculaPerimetro(){
        return 0;
    }
}
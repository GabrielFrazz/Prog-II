package entities;

public class Calculator {
    
    public double div(double d1, double d2) throws InvalidOperationException{
        if(d2 == 0){
            throw new InvalidOperationException("não pode dividir por 0");
        }
        return d1/d2;
    } 

    public double log10(double d) throws InvalidOperationException{
        if(d<0){
            throw new InvalidOperationException("n/e log10 para numeros negativos");
        }
        return Math.log10(d);
    } 
}
package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.FormaBidimencional;
import entities.Quadrado;
import entities.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {

        List<FormaBidimencional> forma = new ArrayList<>();

        Circulo c = new Circulo(2.0);
        Quadrado q = new Quadrado(2.0);
        Triangulo t = new Triangulo(2.0, 3.0);

        forma.add(c);
        forma.add(q);
        forma.add(t);

        for(int i = 0; i<forma.size();i++){
            FormaBidimencional corrente = forma.get(i);
            System.out.println("tipo: " + corrente.getClass().getSimpleName());
            System.out.println("Area: " + corrente.calculaArea());
            System.out.println("Perimetro: " + corrente.calculaPerimetro());
        }


    }
}

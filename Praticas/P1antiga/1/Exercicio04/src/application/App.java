package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circulo;
import entities.FormaGeometrica;
import entities.Quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<FormaGeometrica> formas = new ArrayList<>();

        formas.add(new Circulo(36.7));
        formas.add(new Quadrado(76.3));

        for(FormaGeometrica l : formas){
            System.out.println("-------" + l.getClass().getSimpleName() + "-------");
            System.out.println("Area: " + String.format("%.2f", l.area()));
            System.out.println("Comprimento: " + String.format("%.2f", l.comprimento()));
            System.out.println();
        }
    }
}

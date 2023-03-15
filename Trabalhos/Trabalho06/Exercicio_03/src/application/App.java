package application;

import entities.FormasGeoFactory;
import entities.FormasGeometricas;

public class App {
    public static void main(String[] args) throws Exception {

        FormasGeometricas f1 = FormasGeoFactory.criaForma("Quadrado");
        f1.desenhar();

        FormasGeometricas f2 = FormasGeoFactory.criaForma("circulo");
        f2.desenhar();

        FormasGeometricas f3 = FormasGeoFactory.criaForma("triangulo");
        f3.desenhar();
    }
}

package application;

import entities.FormasGeoFactory;
import entities.FormasGeometricas;

public class App {
    public static void main(String[] args) throws Exception {

        FormasGeometricas f1 = FormasGeoFactory.getForma("Quadrado");
        f1.desenhar();

        FormasGeometricas f2 = FormasGeoFactory.getForma("circulo");
        f2.desenhar();

        FormasGeometricas f3 = FormasGeoFactory.getForma("triangulo");
        f3.desenhar();
    }
}

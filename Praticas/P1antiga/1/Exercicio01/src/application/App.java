package application;

import entities.Ingresso;
import entities.IngressoVip;

public class App {
    public static void main(String[] args) throws Exception {
        Ingresso i = new Ingresso(500.00);
        IngressoVip iv = new IngressoVip(500.00);

        i.imprimeValor();
        System.out.println();
        iv.imprimeValor();

        
    }
}

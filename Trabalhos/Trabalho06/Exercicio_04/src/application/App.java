package application;

import entities.Lanchonete;

public class App {
    public static void main(String[] args) throws Exception {

        Lanchonete l = Lanchonete.getInstancia("CG");
        l.lanche();

        l = Lanchonete.getInstancia("JP");
        l.lanche();

        l = Lanchonete.getInstancia("RT");
        l.lanche();
    }
}

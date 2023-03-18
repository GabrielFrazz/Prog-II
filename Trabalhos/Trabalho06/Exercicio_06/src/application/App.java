package application;

import entities.Lanchonete;

public class App {
    public static void main(String[] args) throws Exception {

        Lanchonete l = Lanchonete.getInstancia("cg");
        System.out.println(l.toString());

        System.out.println("----------------------------");
        l = Lanchonete.getInstancia("jp");
        System.out.println(l.toString());

        System.out.println("----------------------------");
        l = Lanchonete.getInstancia("rt");
        System.out.println(l.toString());
    }
    
}

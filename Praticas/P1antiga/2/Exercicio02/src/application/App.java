package application;

import entities.Miseravel;
import entities.Pessoa;
import entities.Pobre;
import entities.Rica;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Rica(2000.0, "angeliuda", 27);
        System.out.println(p.getClass()); 

        Rica r = (Rica) p;
        System.out.println(r.getDinheiro());

        r.fazCompras(50.0);
        System.out.println(r.getDinheiro());

        Pessoa p2 = new Pobre("rogenilson", 35);
        System.out.println(p2.getNome());
        Pobre fudido = (Pobre)p2;
        fudido.trabalha();


        Pessoa p3 = new Miseravel("elivelison", 58);
        System.out.println(p3.getNome());
        Miseravel vagabundo = (Miseravel)p3;
        vagabundo.mendiga();

    }
}

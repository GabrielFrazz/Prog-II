package application;

import entities.AdapterSomador;
import entities.Cliente;
import entities.SomadorExistente;

public class App {
    public static void main(String[] args) throws Exception {

        SomadorExistente somadorExistente = new AdapterSomador();
        Cliente c = Cliente.getInstancia((AdapterSomador) somadorExistente);
        c.executar();
    }
}

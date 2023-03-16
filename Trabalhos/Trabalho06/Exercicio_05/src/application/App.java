package application;

import entities.CarroSedan;
import entities.Cliente;
import entities.FabricaDeCarro;

public class App {
    public static void main(String[] args) throws Exception {

        FabricaDeCarro fabricasedan = Cliente.getFactory("fiat");

        CarroSedan sedan1 = fabricasedan.criarCarroSedan("Siena");
        sedan1.exibirInfoSedan();
    }
}

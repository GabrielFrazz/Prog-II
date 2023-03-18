package application;

import entities.CarroPopular;
import entities.CarroSedan;
import entities.Cliente;
import entities.FabricaDeCarro;

public class App {
    public static void main(String[] args) throws Exception {

        FabricaDeCarro fabricaSedan = Cliente.getFactory("fiat");

        CarroSedan sedan1 = fabricaSedan.criarCarroSedan("Siena");
        sedan1.exibirInfoSedan();

        CarroSedan sedan2 = fabricaSedan.criarCarroSedan("fiestasedan");
        sedan2.exibirInfoSedan();

        System.out.println("--------------------");

        FabricaDeCarro fabricaPopular = Cliente.getFactory("ford");

        CarroPopular popular1 = fabricaPopular.criarCarroPopular("fiesta");
        popular1.exibirInfoPopular();

        CarroPopular popular2 = fabricaPopular.criarCarroPopular("palio");
        popular2.exibirInfoPopular();
}
}

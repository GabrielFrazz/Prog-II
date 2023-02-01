package application;

import entities.Oficina;
import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Oficina o = new Oficina();
        Veiculo v;
        for (int i = 0; i < 4; ++i) {
            v = o.proximo();
            o.manutencao(v);
            System.out.println();
        }

    }
}

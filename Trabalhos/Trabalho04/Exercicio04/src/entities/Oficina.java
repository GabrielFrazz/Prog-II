package entities;

import java.util.Random;

public class Oficina {



    public Veiculo proximo(){
        Random rand = new Random();

        int tst = rand.nextInt(0, 2);

        if(tst == 0){
            return new Automovel();
        }
        else if(tst == 1){
            return new Bicicleta();
        }

        else return null;
    }

    public void manutencao(Veiculo v){

        System.out.println("--------" + v.getClass().getSimpleName() + "-------");
        System.out.println("Manutenção: ");
        v.listarVerificacoes();
        v.limpar();
        v.ajustar();
        if(v instanceof Automovel){
            Automovel a = new Automovel();
            a.mudarOleo();
        }
    }
}
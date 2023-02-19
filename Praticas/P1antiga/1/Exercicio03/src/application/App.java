package application;

import entities.Voo;

public class App {
    public static void main(String[] args) throws Exception {
        Voo voo01 = new Voo(001, "25/10/1964");

        // numero do voo
        System.out.println("Voo: " + voo01.getVoo());

        // proximo assento disponivel
        System.out.println("proximo assento disponivel: " + voo01.proximoLivre());

        // checa numero de cadeiras disponiveis
        System.out.println("assentos disponiveis: " + voo01.vagas());

        // testa se a cadeira 1 esta disponivel
        System.out.println("Cadeira 1 esta disponivel? ");
        System.out.println(voo01.verifica(1));

        // ocupa cadeira 1
        boolean teste = voo01.ocupa(1);
        System.out.println("A operação de ocupar assento foi bem sucedida? ");
        System.out.println(teste);

        // testa se a cadeira 1 esta disponivel
        System.out.println("Cadeira 1 esta disponivel? ");
        System.out.println(voo01.verifica(1));

        // proximo assento disponivel
        System.out.println("proximo assento disponivel: " + voo01.proximoLivre());

        //clona voo01
        Voo voo02 = (Voo)voo01.clone();

        //repete os testes para voo02

        // numero do voo
        System.out.println("Voo: " + voo02.getVoo());

        // proximo assento disponivel
        System.out.println("proximo assento disponivel: " + voo02.proximoLivre());

        // checa numero de cadeiras disponiveis
        System.out.println("assentos disponiveis: " + voo02.vagas());

        // testa se a cadeira 1 esta disponivel
        System.out.println("Cadeira 1 esta disponivel? ");
        System.out.println(voo02.verifica(1));

        // ocupa cadeira 1
        teste = voo02.ocupa(1);
        System.out.println("A operação de ocupar assento foi bem sucedida? ");
        System.out.println(teste);

        // testa se a cadeira 1 esta disponivel
        System.out.println("Cadeira 1 esta disponivel? ");
        System.out.println(voo02.verifica(1));

        // proximo assento disponivel
        System.out.println("proximo assento disponivel: " + voo02.proximoLivre());
    }
}

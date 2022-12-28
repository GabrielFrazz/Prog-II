package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cachorro;
import entities.Peixe;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Peixe p = new Peixe();
        System.out.println("Digite as informações do peixe: ");

        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.println("Deseja registrar o peso?\ny-sim|n-não");
        char tst = sc.next().charAt(0);


        Double peso = 0.0;

        if (tst == 'y') {
            System.out.print("peso: ");
            peso = sc.nextDouble();
        }

        System.out.print("Habitat: ");
        sc.nextLine();
        String tipoHabitat = sc.nextLine();

        p = new Peixe(nome, tipoHabitat);

        if(tst == 'y'){
            p.setPeso(peso);
        }

        System.out.println();

        Cachorro c = new Cachorro();
        System.out.println("Digite as informações do Cachorro: ");

        System.out.print("nome: ");
        nome = sc.nextLine();
        System.out.println("Deseja registrar o peso?\ny-sim|n-não");
        tst = sc.next().charAt(0);

        peso = 0.0;

        if (tst == 'y') {
            System.out.print("peso: ");
            peso = sc.nextDouble();
        }

        System.out.print("Raça: ");
        sc.nextLine();

        String raca = sc.nextLine();

        c = new Cachorro(nome, raca);
        if(tst == 'y'){
            c.setPeso(peso);
        }

        System.out.println();

        System.out.println("informações do peixe: ");
        System.out.println(p);

        System.out.println();

        System.out.println("informações do Cachorro: ");
        System.out.println(c);

        sc.close();
    }
}

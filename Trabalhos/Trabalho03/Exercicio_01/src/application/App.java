package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cachorro;
import entities.Peixe;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite as informações do peixe: ");

        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("peso: ");
        Double peso = sc.nextDouble();
        System.out.print("Habitat: ");
        sc.nextLine();
        String tipoHabitat = sc.nextLine();

        Peixe p = new Peixe(nome, peso, tipoHabitat);

        System.out.println();

        System.out.println("Digite as informações do Cachorro: ");

        System.out.print("nome: ");
        nome = sc.nextLine();
        System.out.print("peso: ");
        peso = sc.nextDouble();
        System.out.print("Raça: ");
        sc.nextLine();
        String raca = sc.nextLine();

        Cachorro c = new Cachorro(nome, peso, raca);

        System.out.println();

        System.out.println("informações do peixe: ");
        System.out.println(p);

        System.out.println();

        System.out.println("informações do Cachorro: ");
        System.out.println(c);

        sc.close();
    }
}

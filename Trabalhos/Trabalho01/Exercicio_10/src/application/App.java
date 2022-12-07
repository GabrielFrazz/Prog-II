package application;

import java.util.Scanner;

import entities.Primos;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("--Decomposição em fatores primos--");
        System.out.println();

        System.out.print("digite um número: ");
        int num = sc.nextInt();

        Primos primos = new Primos();
        primos.setNum(num);

        System.out.println();
        System.out.print("fatores primos de " + num + ": ");

        int tam = primos.contaFatores();
        int[] vect = new int[tam];

        vect = primos.arrayFatoresPrimos();

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        sc.close();
    }
}

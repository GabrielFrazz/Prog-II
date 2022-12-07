package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Escreva uma funcão recursiva que calcule a sequencia dada por:
         * F(1) = 1 (1)
         * F(2) = 2 (2)
         * F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2) (3)
         */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("digite um numero: ");
        num = sc.nextInt();

        System.out.println();

        System.out.println("F(" + num + ") = " + calculaSequencia(num, num, num));

        sc.close();
    }

    public static int calculaSequencia(int num, int num1, int num2) {

        int F;

        if (num == 1) {
            F = 1;
            return F;
        }

        if ((num1 - 1) == 1 || (num1 - 1) == 2 && (num2 - 2) == 1 || (num2 - 2) == 2) {
            num1 = num1 - 1;
            num2 = num2 - 2;
            F = 2 * num1 + 3 * num2;
            return F;

        }

        else {
            num1 = num1 - 1;
            num2 = num2 - 2;
            F = calculaSequencia(num, num1, num2);
            return F;
        }

    }

}

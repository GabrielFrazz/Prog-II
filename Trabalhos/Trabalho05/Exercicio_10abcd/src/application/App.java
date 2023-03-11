package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Calculator;
import entities.InvalidOperationException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        double x = 0, y = 0;
        int choice = 0;
        do {

            System.out.println("Escolha a operação");
            System.out.println("1-divisçao");
            System.out.println("2-Log10");
            System.out.println("3-finalizar o programa");
            choice = sc.nextInt();
            System.out.println();

            if(choice == 1){
                System.out.println("--------------------------------------");
                System.out.println("Você escolheu divisão!");
                System.out.println("--------------------------------------");
            }
            else{
                System.out.println("--------------------------------------");
                System.out.println("Você escolheu log10!");
                System.out.println("--------------------------------------");
            }
            boolean test = false;
            while (!test) {
                System.out.print("Informe o primeiro valor: ");
                try {
                    x = sc.nextInt();
                    test = true;
                } catch (InputMismatchException e) {
                    System.out.println();
                    System.out.println("-----------------------------------------");
                    System.out.println("você digitou algo que não é um numero!");
                    System.out.println("tente denovo.");
                    System.out.println("-----------------------------------------");
                    System.out.println();
                    sc.next();
                }

            }

            if (choice == 1) {
                test = false;
                while (!test) {
                    System.out.print("Informe o segundo valor: ");
                    try {
                        y = sc.nextInt();
                        test = true;
                    } catch (InputMismatchException e) {
                        System.out.println();
                        System.out.println("-----------------------------------------");
                        System.out.println("você digitou algo que não é um numero!");
                        System.out.println("tente denovo.");
                        System.out.println("-----------------------------------------");
                        System.out.println();
                        sc.next();
                    }

                }
            }

            if (choice == 1) {
                try {
                    System.out.println();
                    System.out.println(x + "/" + y + " = " + c.div(x, y));
                    System.out.println("--------------------------------------");
                    System.out.println();
                } catch (InvalidOperationException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                    System.out.println();
                    sc.reset();
                }
            }
            if (choice == 2) {
                try {
                    System.out.println();
                    System.out.println("log10(" + x + ") = " + c.log10(x));
                    System.out.println("--------------------------------------");
                    System.out.println();
                } catch (InvalidOperationException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                    System.out.println();
                    sc.reset();
                }
            }

        } while (choice != 3);
        sc.close();
    }

}

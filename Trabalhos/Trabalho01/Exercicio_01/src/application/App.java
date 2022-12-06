package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Manicure;
import entities.Salario;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de calculo de salário do salão Sempre Bela");

        Manicure[] manicure = new Manicure[5];

        System.out.println();

        System.out.println("digite o valor das mãos e dos pés desse mês ");

        System.out.print("mãos: ");
        double valMaos = sc.nextDouble();
        System.out.print("pés: ");
        double valPes = sc.nextDouble();

        Salario salario = new Salario(valMaos, valPes);

        System.out.println();

        System.out.println("digite as informações das manicures ");
        System.out.println();

        for (int i = 0; i < 5; i++) {

            System.out.println("------manicure #" + (i+1) + "------");
            System.out.println();

            System.out.print("nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("n de mãos: ");
            int qtdMaos = sc.nextInt();
            System.out.print("n de pés: ");
            int qtdPes = sc.nextInt();

            manicure[i] = new Manicure(name, qtdMaos, qtdPes, salario);
            System.out.println();

        }

        for(Manicure m : manicure){
            System.out.println(m.toString());
        }

        sc.close();
    }
}

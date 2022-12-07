package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Vendas;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com os valores referentes às vendas do ano: ");
        System.out.println();

        double[][] matVendas = new double[12][4];

        for(int i = 0; i < 12; i++){
            System.out.println("-------Mês #" + (i+1) + "-------");
            for(int j = 0; j < 4; j++){
                System.out.print("semana 0" + (j+1) + ": ");
                matVendas[i][j] = sc.nextDouble();
            }
        }

        Vendas vendas = new Vendas(matVendas);

        double[] totalMes = new double[12];
        totalMes = vendas.totalMes();

        System.out.println();
        System.out.println("total em cada mês: ");

        for(int i = 0; i < totalMes.length; i++){
            System.out.println();
            System.out.print("mês 0" + (i+1) + ": R$" + String.format("%.2f", totalMes[i]));
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("total em cada semana: ");

        for(int i = 0; i < 12; i++){
            System.out.println("-------Mês #" + (i+1) + "-------");
            System.out.println();
            for(int j = 0; j < 4; j++){
                System.out.print("semana 0" + (j+1) + ": R$" + String.format("%.2f",matVendas[i][j]));
                System.out.println();
            }
        }

        System.out.println();
        System.out.print("total vendido no ano: R$" + String.format("%.2f", vendas.totalAno()));

        sc.close();
    }
}

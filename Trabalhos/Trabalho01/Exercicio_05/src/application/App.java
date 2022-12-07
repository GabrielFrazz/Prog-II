package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Matriz;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];

        System.out.println("preencha a matriz 3x3: ");
        System.out.println();

        for(int i = 0; i < 3; i++){
            System.out.println("-----linha #" + (i+1) + "-----");
            for(int j = 0; j < 3; j++){
                System.out.print("--> ");
                mat[i][j] = sc.nextInt();
                System.out.println();
            }
        }

        Matriz matriz = new Matriz(mat);

        System.out.println("A matriz digitada foi: ");
        System.out.println();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("matriz girada em 90 graus: ");
        System.out.println();

        int[][] matGirada = new int[3][3];
        matGirada = matriz.giraMatriz();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matGirada[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

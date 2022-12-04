package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Plantas;

public class App {
    public static void main(String[] args) throws Exception {
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         System.out.print("Entre com a quantidade de plantas à serem registradas: ");
         int tam = sc.nextInt();

         Plantas[] vect = new Plantas[tam];

         System.out.println();
         System.out.println("Entre com as informações das plantas: ");

         for(int i = 0; i < vect.length;i++){

            System.out.println("Planta "+ (i+1));
            System.out.print("entre com o nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("entre com a quantidade: ");
            int qtd = sc.nextInt();
            System.out.print("entre com a quantidade ideal: ");
            int qtd_id = sc.nextInt();

            vect[i] = new Plantas(name, qtd, qtd_id);
         }

         System.out.println();

         for(Plantas p : vect){
            if(p.faltando()>0){
            System.out.println(p.toString());
            }
            else{
                System.out.println(p.getName() + ": ");
                System.out.println("já possui quantidade ideal");
            }
            System.out.println();
         }

         sc.close();
    }
}

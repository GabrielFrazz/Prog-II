package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Set<Product> set = new HashSet<>();
        
        menu(set);
    }

    public static Scanner sc = new Scanner(System.in);

    public static void menu(Set<Product> s){

        System.out.println("Escolha uma opção:");
        System.out.println("1 - adicionar produto");
        System.out.println("2 - exibir uma lista com todos os produtos");
        System.out.println("3 - encerrar programa");
        System.out.print("-->");

        int choice = sc.nextInt();
        if(choice == 1){
            addProduct(s);
        }else if(choice == 2){
            printProducts(s);
        }else{
            sc.close();
            return;
        }
    }

    public static void addProduct(Set<Product> s){

        sc.nextLine();
        System.out.println("---------------------------------");
        System.out.println("entre com as informações do produto:");
        System.out.print("id: ");
        int id = sc.nextInt();
        System.out.print("nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("preço: ");
        double price = sc.nextDouble();

        Product p = new Product(id, name, price);

        if(!s.contains(p)){
            s.add(p);
        }
        else{
            System.out.println("id do produto já registrado!");
        }

        System.out.println("---------------------------------");
        System.out.println();

        menu(s);

    }

    public static void printProducts(Set<Product> s){
        
        System.out.println();
        System.out.println("---------------------------------");
        for(Product p : s){
            System.out.println();
            System.out.println(p);
            System.out.println();
        }
        if(s.isEmpty()){
            System.out.println("nenhum produto registrado!");
        }
        System.out.println("---------------------------------");
        System.out.println();
        menu(s);
    }
}

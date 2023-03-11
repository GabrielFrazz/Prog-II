package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Set<String> names = new HashSet<>();
        menu(names);

    }

    public static Scanner sc = new Scanner(System.in);

    public static void menu(Set<String> names) {
        System.out.println();
        System.out.println("escolha uma opção");
        System.out.println("1 - adicionar um nome");
        System.out.println("2 - remover um nome");
        System.out.println("3 - verificar se um nome ja existe");
        System.out.println("4 - remover todos os nomes");
        System.out.println("5 - gerar uma lista com os nomes");
        System.out.println("6 - encerrar programa");
        System.out.print("-->");

        switch (sc.nextInt()) {

            case 1:
                addName(names);
                break;
            case 2:
                removeName(names);
                break;
            case 3:
                nameExists(names);
                break;
            case 4:
                removeAll(names);
                break;
            case 5:
                printNames(names);
                break;
            case 6:
                sc.close();
                return;                

        }
    }

    public static void addName(Set<String> n) {

        sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("digite o nome: ");
        String name = sc.nextLine();

        if (n.contains(name)) {
        } else {
            n.add(name);
        }

        System.out.println("-------------------------------------");
        menu(n);
    }

    public static void removeName(Set<String> n) {

        sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("digite o nome: ");
        String name = sc.nextLine();

        if (n.contains(name)) {
            n.remove(name);
        } else {
            System.out.println("nome não existe no set");
        }
        System.out.println("-------------------------------------");
        menu(n);
    }

    public static void nameExists(Set<String> n){

        sc.nextLine();
        System.out.println("-------------------------------------");
        System.out.print("digite o nome: ");
        String name = sc.nextLine();

        if(n.contains(name)){
            System.out.println("sim, contém");
        }
        else{
            System.out.println("não contém");
        }
        System.out.println("-------------------------------------");
        menu(n);
    }

    public static void removeAll(Set<String> n) {
        
        Set<String> n2 = new HashSet<>(n);
        n.removeAll(n2);
        
        menu(n);
    }

    public static void printNames(Set<String> n) {
        System.out.println("-------------------------------------");
        for (String s : n) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        menu(n);
    }
}

package application;

import java.util.Locale;
import java.util.Scanner;

import enterprise.Client;
import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Client c = clientInfo(sc);

        System.out.println(c);

        sc.close();

    }

    public static Client clientInfo(Scanner sc) {

        System.out.println("Enter with the client info: ");
        Person p = personInfo(sc);
        System.out.print("debt: ");
        Double debtAmount = sc.nextDouble();
        System.out.print("yearOfBirth: ");
        Integer yearOfBirth = sc.nextInt();

        Client c = new Client(p.getName(), p.getAge(), p.getSex(), debtAmount, yearOfBirth);

        return c;

    }

    public static Person personInfo(Scanner sc) {

            System.out.print("name: ");
            String name = sc.nextLine();

            System.out.print("age: ");
            Integer age = sc.nextInt();

            System.out.print("Sex: ");
            sc.nextLine();
            String sex = sc.nextLine();

            Person p = new Person(name, age, sex);

            return p;

    }
}

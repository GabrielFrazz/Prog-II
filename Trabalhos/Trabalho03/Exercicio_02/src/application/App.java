package application;

import java.util.Locale;
import java.util.Scanner;

import enterprise.Client;
import enterprise.Employee;
import enterprise.Manager;
import enterprise.Seller;
import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tst = 1;
        do {

            System.out.println();

            System.out.println("chose a class: \n1 -- Client \n2 -- Manager \n3 -- Seller");
            System.out.print("--> ");
            tst = sc.nextInt();

            System.out.println();

            if (tst == 1) {
                Client c = clientInfo(sc);
                System.out.println();
                System.out.println(c);
            } else if (tst == 2) {
                Manager m = managerInfo(sc);
                System.out.println();
                System.out.println(m);
            } else if (tst == 3) {
                Seller s = sellerInfo(sc);
                System.out.println();
                System.out.println(s);
            }

            System.out.println();

            System.out.println("Try another class? \n1 -- yes \n0 -- no");
            System.out.print("--> ");

            tst = sc.nextInt();
        } while (tst != 0);

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

    public static Manager managerInfo(Scanner sc) {

        System.out.println("Enter with the manager info: ");
        Employee e = employeeInfo(sc);
        System.out.print("management name: ");
        String managerName = sc.nextLine();

        Manager m = new Manager(e.getName(), e.getAge(), e.getSex(), e.getIncome(), e.getRegistration(), managerName);

        return m;

    }

    public static Seller sellerInfo(Scanner sc) {

        System.out.println("Enter with the seller info: ");
        Employee e = employeeInfo(sc);
        System.out.print("sales value: ");
        Double salesValue = sc.nextDouble();
        System.out.print("sales amount: ");
        Integer salesAmount = sc.nextInt();

        Seller s = new Seller(e.getName(), e.getAge(), e.getSex(), e.getIncome(), e.getRegistration(), salesValue,
                salesAmount);

        return s;

    }

    public static Person personInfo(Scanner sc) {

        System.out.print("name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("age: ");
        Integer age = sc.nextInt();

        System.out.print("Sex: ");
        sc.nextLine();
        String sex = sc.nextLine();

        Person p = new Person(name, age, sex);

        return p;

    }

    public static Employee employeeInfo(Scanner sc) {


        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Age: ");
        Integer age = sc.nextInt();

        System.out.print("Sex: ");
        sc.nextLine();
        String sex = sc.nextLine();

        System.out.print("Income: ");
        Double income = sc.nextDouble();

        System.out.print("Registration: ");
        sc.nextLine();
        String registration = sc.nextLine();

        Employee e = new Employee(name, age, sex, income, registration);

        return e;
    }
}

package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee(1234, "Steve Jobs", 3000.00, "25/03/1997");
        Employee emp2 = new Employee(1235, "Scott McNealy", 45000.00, "17/04/2004");
        Employee emp3 = new Employee(1236,"Jeff Bezos", 10000000.00, "10/07/1995");
        Employee emp4 = new Employee(1237,"Larry Ellison", 64000.00, "16/09/2008");
        Employee emp5 = new Employee(1238,"Bill Gates", 4000000.00, "01/08/1984");

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("Lista de Funcionários");
        System.out.println();
        System.out.println("-----------------------------");
        for(Employee e : employees){
            System.out.println(e);
            System.out.println("-----------------------------");
        }
        System.out.print("-pressione qualquer tecla-");
        sc.nextLine();


        System.out.println();
        sortEmployeesByWage(employees);
        System.out.println("Lista de Funcionários ordenados por salário");
        System.out.println();
        System.out.println("-----------------------------");
        for(Employee e : employees){
            System.out.println(e);
            System.out.println("-----------------------------");
        }
        System.out.print("-pressione qualquer tecla-");
        sc.nextLine();
        System.out.println();

        sortEmployeesByName(employees);
        System.out.println("Lista de Funcionários em ordem alfabética");
        System.out.println();
        System.out.println("-----------------------------");
        for(Employee e : employees){
            System.out.println(e);
            System.out.println("-----------------------------");
        }
        System.out.print("-pressione qualquer tecla-");
        sc.nextLine();
        System.out.println();

        wagesExtremes(employees);
        System.out.print("-pressione qualquer tecla-");
        sc.nextLine();
        System.out.println();

        hiringDatesExtremes(employees);

        sc.close();
    }

    public static void sortEmployeesByWage(List<Employee> e){
        Collections.sort(e);
    }

    public static void sortEmployeesByName(List<Employee> e){
        Collections.sort(e, (s1, s2) -> { return s1.getName().compareTo(s2.getName());});
    }

    public static void sortEmployeesByHiringDate(List<Employee> e){
        Collections.sort(e, (s1, s2) -> { return s1.getHiringDate().compareTo(s2.getHiringDate());});
    }

    public static void wagesExtremes(List<Employee> e){
        sortEmployeesByWage(e);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("menor salário:");
        System.out.println(e.get(0));
        System.out.println();
        System.out.println("maior salário:");
        System.out.println(e.get(e.size()-1));
        System.out.println("---------------------------------");

    }

    public static void hiringDatesExtremes(List<Employee> e){
        sortEmployeesByHiringDate(e);
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("mais antigo:");
        System.out.println(e.get(0));
        System.out.println();
        System.out.println("mais novo:");
        System.out.println(e.get(e.size()-1));
        System.out.println("---------------------------------");

    }
}

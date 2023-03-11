package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import entitites.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);

        Map<String, Employee> employees = new HashMap<>();

        Employee emp1 = new Employee("Steve Jobs", "CEO", 3000.00);
        Employee emp2 = new Employee("Scott McNealy", "Manager", 2000.00);
        Employee emp3 = new Employee("Jeff Bezos", "Bilionare", 10000000.00);
        Employee emp4 = new Employee("Larry Ellison", "businessperson", 65000.00);
        Employee emp5 = new Employee("Bill Gates", "BOSS", 4000000.00);

        employees.put("a1234", emp1);
        employees.put("a1235", emp2);
        employees.put("a1236", emp3);
        employees.put("a1237", emp4);
        employees.put("a1238", emp5);

        printEmployees(employees);
        System.out.println(getEmployee(employees, "A1236"));
    }

    public static String anyKey(String key){
        return key.toLowerCase();
    }

    public static Employee getEmployee(Map<String, Employee> e, String key){
        return e.get(anyKey(key));
    }

    public static void printEmployees(Map<String, Employee> e){
        System.out.println("lista de funcionários: ");
        System.out.println();
        for(String key : e.keySet()){
            System.out.println(e.get(key));
            System.out.println("--------------------------------");
        }
        System.out.println("-----end-----");
        System.out.println();
    }

}

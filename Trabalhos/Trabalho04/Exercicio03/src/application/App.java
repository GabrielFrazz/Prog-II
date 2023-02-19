package application;

import entities.Number;

public class App {
    public static void main(String[] args) throws Exception {

        Number num1 = new Number(1); 
        Number num2 = new Number(2);
        Number num3 = new Number(1);

        //testando toString
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        //testando método equals
        System.out.println();
        System.out.println(num1.equals(num2));
        System.out.println(num1.equals(num3)); //deve retornar verdadeiro 
        System.out.println(num2.equals(num3));

        //testando método hashCode
        System.out.println();
        System.out.println(num3.hashCode());
        System.out.println(num1.hashCode()); //deve ser igual ao do num3
        System.out.println(num2.hashCode());
    }
}

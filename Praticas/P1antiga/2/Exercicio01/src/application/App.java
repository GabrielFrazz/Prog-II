package application;

import entities.Data;

public class App {
    public static void main(String[] args) throws Exception {
        Data data1 = new Data(1, 12, 2015);
        Data data2 = new Data(31, 5, 2015);
        Data data3 = new Data(31, 12,2015);

        System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());

        data1.avancaDia();
        data2.avancaDia();
        data3.avancaDia();

        System.out.println();
        System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());

    }
}

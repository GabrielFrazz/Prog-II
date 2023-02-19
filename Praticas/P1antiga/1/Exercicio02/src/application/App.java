package application;

import entities.Vetor;

public class App {
    public static void main(String[] args) {
        //instancia um Vetor 
        Vetor v = new Vetor(3);
        v.insert("1");
        v.insert("2");
        v.insert("3");

        Object[] vector = new Object[4];

        vector = v.getVect();
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);

        v.insert("4");
        vector = v.getVect();
        System.out.println();
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);

        v.takeElementOut(1);
        vector = v.getVect();

        System.out.println();
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);

        v.insert("4");
        vector = v.getVect();
        System.out.println();
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);

    }
}
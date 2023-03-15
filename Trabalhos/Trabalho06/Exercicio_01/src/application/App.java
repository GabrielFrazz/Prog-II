package application;

import entities.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        
        Singleton s1 = Singleton.getInstancia();
        System.out.println(s1);
       
        Singleton s2 = Singleton.getInstancia();
        System.out.println(s2);
       
        Singleton s3 = Singleton.getInstancia();
        System.out.println(s3);
       
    }
}

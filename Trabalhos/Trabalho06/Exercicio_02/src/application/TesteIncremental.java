package application;

import entities.IncrementalSingleton;

public class TesteIncremental {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i<10; i++){
            IncrementalSingleton s1 = IncrementalSingleton.getInstancia();
            System.out.println(s1); //imprime somente "incremental: 1" pois agora só existe uma instância de Incremental
        }
    }
}

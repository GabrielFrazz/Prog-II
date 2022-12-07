package entities;

public class Matriz {

    private int[][] mat = new int[3][3];

    public Matriz(int[][] mat){
        this.mat = mat;
    }

    public int[][] giraMatriz(){
        int[][] matGirada = new int[3][3];
        int aux = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 2; j >= 0 ; j--){
                matGirada[i][aux] = mat[j][i];
                aux++;
            }
            aux = 0;
        }
        return matGirada;
    }
}
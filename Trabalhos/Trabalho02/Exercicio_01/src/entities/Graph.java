package entities;

public class Graph {

    private Integer tam;
    private Boolean[][] graph;

    public Graph(Integer tam) {
        this.tam = tam;
        this.graph = new Boolean[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                graph[i][j] = false;
            }
        }

    }

    public void setGrafo(Integer[][] graph) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (graph[i][j] == 0) {
                    this.graph[i][j] = false;
                } else if (graph[i][j] == 1) {
                    this.graph[i][j] = true;
                } else {
                    throw new GraphException("The graph matrix must be compose only of 0's and 1's");
                }
            }
        }
    }

    public Integer[][] getGrafo() {

        Integer[][] matrix = new Integer[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (this.graph[i][j] == false) {
                    matrix[i][j] = 0;
                } else if (graph[i][j] == true) {
                    matrix[i][j] = 1;
                }
            }
        }

        return matrix;
    }

    public void printGraph(){
        for(int i = 0; i < tam; i++){
            System.out.print((i+1) + " ");
            for(int j = 0; j < tam; j++){
                if (this.graph[i][j] == false) {
                    System.out.print("0 ");
                } else if (graph[i][j] == true) {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
         for(int i = 1; i <= tam; i++){
            if(i == 1){
            System.out.print("  ");
            }
            System.out.print(i + " ");

        }
    }

}
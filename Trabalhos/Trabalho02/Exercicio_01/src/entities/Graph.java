package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Graph {

    private Integer tam;
    private Boolean[][] graph;

    public Graph() {

    }

    public Graph(Integer tam) {
        this.tam = tam;
        this.graph = new Boolean[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                graph[i][j] = false;
            }
        }

    }

    public void setGraph(Integer[][] graph) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j && graph[i][j] == 1) {
                    throw new GraphException("the leading diagonal must consist of 0's ");
                } else if (graph[i][j] == 0) {
                    this.graph[i][j] = false;
                } else if (graph[i][j] == 1) {
                    this.graph[i][j] = true;
                } else {
                    throw new GraphException("The graph Adjacency matrix must be compose only of 0's and 1's");
                }
            }
        }
    }

    public Boolean[][] getGraph() {
        return graph;
    }

    public Integer[][] convertGraph() {

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

    public void generateRandomGraph() {
        Random rand = new Random();
        int tam = rand.nextInt(3, 6);
        this.tam = tam;
        graph = new Boolean[tam][tam];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    this.graph[i][j] = false;
                } else {
                    this.graph[i][j] = rand.nextBoolean();
                }
            }
        }
    }

    public Integer getTam() {
        return tam;
    }

    public void setTam(Integer tam) {
        this.tam = tam;
    }

    public Boolean areVerticesNeighbors(Integer v1, Integer v2) {
        if (v1 > tam) {
            throw new GraphException("v1: non-existent vertice");
        }
        if (v2 > tam) {
            throw new GraphException("v2: non-existent vertice");
        }

        return (graph[(v1 - 1)][(v2 - 1)] == true) ? true : false;
    }

    public List<Integer> neighborsVertices(Integer v) {
        if (v > tam) {
            throw new GraphException("non-existent vertice");
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < tam; i++) {
            if (graph[(v - 1)][i]) {
                list.add(i + 1);
            }
        }
        return list;
    }

}
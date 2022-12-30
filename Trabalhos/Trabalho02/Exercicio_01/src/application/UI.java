package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Graph;

public class UI {

    static Scanner sc = new Scanner(System.in);
    private Graph g;

    public void welcome() {

        Graph g = new Graph();
        g.generateRandomGraph();

        System.out.println("welcome! this program is about graphs");
        System.out.println("it uses the adjacency matrix representation, like this: ");
        printGraph(g.getGraph());

        System.out.println();

        System.out.println("you have the choice of enter with a matrix or generate one");
        System.out.println("then you can: ");
        System.out.println("1---determine if two vertices are neighbors");
        System.out.println("2---generate a list of all the neighbors vertices of a given vertice");
        System.out.println("Enjoy! ");

        System.out.println();

        System.out.println("--Press any key to continue--");
        sc.nextLine();

    }

    public Integer firstMenu() {

        System.out.println();
        System.out.println("Select an option:");
        System.out.println("1---enter with a graph matrix");
        System.out.println("2---generate a randon graph matrix");
        System.out.print("-->");
        int c = sc.nextInt();

        if (c != 1 && c != 2) {

            throw new UiException("invalid value");
        }

        return c;
    }

    public Integer secondMenu() {

        System.out.println();
        System.out.println("Select an option:");
        System.out.println("1---determine if two vertices are neighbors");
        System.out.println("2---generate a list of all the neighbors vertices of a given vertice");
        System.out.print("-->");
        int c = sc.nextInt();

        if (c != 1 && c != 2) {

            throw new UiException("invalid value");
        }

        return c;
    }

    public Integer thirdMenu() {

        System.out.println();
        System.out.println("Select an option:");
        System.out.println("1---input a new graph");
        System.out.println("2---continue with the same graph");
        System.out.println("3---close program");
        System.out.print("-->");
        int c = sc.nextInt();

        if (c != 1 && c != 2 && c != 3) {

            throw new UiException("invalid value");
        }

        if (c == 3) {
            sc.close();
        }

        return c;
    }

    public void graphInput() {

        System.out.println();

        System.out.println("Number of vertices:");
        System.out.print("--> ");
        int tam = sc.nextInt();

        g = new Graph(tam);

        System.out.println();
        System.out.println();

        System.out.println("--------------------WARNING--------------------");
        System.out.println("the matrix must be composed only of 0's and 1's");
        System.out.println("the leading diagonal must me composed of 0's");
        System.out.println("leading diagonal will be shown as: " + "!-->");
        System.out.println();

        System.out.println("Enter with the adjacency matrix");
        System.out.println();

        Integer[][] graph = new Integer[tam][tam];

        for (int i = 0; i < tam; i++) {
            System.out.println("Line #" + (i + 1));
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    System.out.print("!-->");
                } else {
                    System.out.print("--->");
                }
                graph[i][j] = sc.nextInt();
            }
        }

        g.setGraph(graph);

        System.out.println();
        System.out.println("the graph you entered: ");
        System.out.println();
        printGraph(g.getGraph());

        System.out.println();
    }

    public void randomGraph() {
        g = new Graph();
        g.generateRandomGraph();

        System.out.println();
        System.out.println("the graph generated: ");
        System.out.println();
        printGraph(g.getGraph());

        System.out.println();
    }

    public void neighborsVertices() {
        System.out.println();

        System.out.println("enter with the vertices");

        System.out.print("v1: ");
        int v1 = sc.nextInt();
        System.out.print("v2: ");
        int v2 = sc.nextInt();

        System.out.println();

        if (g.areVerticesNeighbors(v1, v2)) {
            System.out.println("yes, they are neighbors! ");
        } else {
            System.out.println("no, they are not neighbors.");
        }

    }

    public void allNeighbors() {
        System.out.println();

        System.out.println("enter with the vertice");
        System.out.print("-->");
        int v = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        list = g.neighborsVertices(v);

        System.out.println();

        System.out.println("Neighbors: ");
        System.out.print(v + ": ");
        for (int i = 0; i < list.size(); i++) {
            if (i != (list.size() - 1)) {
                System.out.print(list.get(i) + ", ");
            } else if (i == (list.size() - 1)) {
                System.out.print(list.get(i));
            }
        }

        System.out.println();
    }

    public static void printGraph(Boolean[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == false) {
                    System.out.print("0 ");
                } else if (graph[i][j] == true) {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= graph.length; i++) {
            if (i == 1) {
                System.out.print("  ");
            }
            System.out.print(i + " ");

        }
    }

}
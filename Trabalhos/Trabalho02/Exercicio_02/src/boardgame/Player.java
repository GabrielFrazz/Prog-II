package boardgame;

import java.util.Scanner;

public class Player {

    private String name;
    private char symbol;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int row(Scanner sc) {
        while (true) {
            System.out.print("chose a row: ");
            int row = sc.nextInt();
            if (row >= 0 && row <= 2) {
                return row;
            }
        }
    }

    public int column(Scanner sc) {
        while (true) {
            System.out.print("chose a column: ");
            int col = sc.nextInt();
            if (col >= 0 && col <= 2) {
                return col;
            }
        }
    }

}
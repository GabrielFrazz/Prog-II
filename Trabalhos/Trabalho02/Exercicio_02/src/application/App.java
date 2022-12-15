package application;

import java.util.Scanner;

import board.Position;
import board.StatusPlace;
import board.TheBoard;
import temp.TicTacToe;
import tictactoe.Player;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        TheBoard board = new TheBoard();
        Player player = new Player();
        Position[][] position = new Position[3][3];
        position = board.getPosition();

        board.placePlayer(1, player, position[0][1]);

        sc.nextLine();

        board.imprimeTabuleiro();

        board.placePlayer(1, player, position[1][1]);

        board.imprimeTabuleiro();

        sc.close();

    }
}

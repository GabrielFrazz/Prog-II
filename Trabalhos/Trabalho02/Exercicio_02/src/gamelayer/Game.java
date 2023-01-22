package gamelayer;

import java.util.Scanner;

import boardgame.Board;
import boardgame.Player;

public class Game {

    private Board board;
    private Player player_one;
    private Player player_two;
    private Player currentPlayer;

    public Game(Player player_one, Player player_two) {
        this.board = new Board();
        this.player_one = player_one;
        this.player_two = player_two;
        this.currentPlayer = player_one;
    }

    public void welcome(Scanner sc){

        System.out.println("this is a tictactoe game\n Enjoy!");
        System.out.print("---press any key to continue---");
        sc.nextLine();

        start(sc);
    }

    public void start(Scanner sc){
        while(true){
            board.print();

            System.out.println("------------------------------------------");
            System.out.println("it's " + currentPlayer.getName() + " time!");

            System.out.println();

            int row,col;
            do{
             row = currentPlayer.row(sc);
             col = currentPlayer.column(sc);
            }while(board.isEmpty(row, col));

            board.setPlayer(row, col, currentPlayer.getSymbol());

            //win?
            if(board.checkWin(currentPlayer.getSymbol())){
                board.print();
                System.out.println(currentPlayer.getName() + " won!");
                break;
            }

            //draw?
            if(board.checkDraw()){
                board.print();
                System.out.println("Is a draw!");
            }


            currentPlayer = (currentPlayer == player_one) ? player_two : player_one;
        }
    }
}
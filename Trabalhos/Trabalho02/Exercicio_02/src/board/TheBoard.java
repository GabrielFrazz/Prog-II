package board;

import tictactoe.Player;

public class TheBoard {

    private char[][] board = new char[3][3];
    private Position[][] position = new Position[3][3];

    // setup inicial
    public TheBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
                position[i][j] = new Position(i, j, StatusPlace.EMPTY);
            }
        }
    }

    
    public void placePlayer(int whatPlayer, Player player, Position position) {
        if (whatPlayer == 1) {
            if (!unavailablePosition(position)) {
                board[position.getRow()][position.getColumn()] = player.getPlayerOne();
            }
            else{
                System.out.println("\nposição ocupada! ");
            }
        } else if (whatPlayer == 2) {
            if (!unavailablePosition(position)) {
                board[position.getRow()][position.getColumn()] = player.getPlayerOne();
            }
            else{
                System.out.println("\nposição ocupada! ");
            }
        }

    }

    public boolean unavailablePosition(Position position) {
        if (position.getStatus() == StatusPlace.PLAYER_ONE || position.getStatus() == StatusPlace.PLAYER_TWO) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return char[][] return the board
     */
    public char[][] getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(char[][] board) {
        this.board = board;
    }

    /**
     * @return Position[][] return the position
     */
    public Position[][] getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position[][] position) {
        this.position = position;
    }

    public void imprimeTabuleiro() {
        for (int i = 0; i < 3; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < 3; j++) {
                if (j != 2)
                    System.out.print(board[i][j] + "|");
                else
                    System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c");
    }
}
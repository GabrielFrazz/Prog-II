package board;

import tictactoe.Player;

public class TheBoard {
    
    private char[][] board = new char[3][3];

    //setup inicial
    public TheBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
                Position position = new Position(i, j, StatusPlace.EMPTY);
            }
        }
    }

    
    public void placePlayer(Player player, Position[][] position){

    }

    public boolean unavailablePosition(Position[][] position){

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

}
package game;

public class TicTacToe {

    private char[][] board = new char[3][3];

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void converteEntrada(int row, char coloumn, StatusPlace status) {
        if (coloumn == 'a') {
            entrada((row - 1), 0, status);
        }
        if (coloumn == 'b') {
            entrada((row - 1), 1, status);
        }
        if (coloumn == 'c') {
            entrada((row - 1), 2, status);
        }
    }

    public void entrada(int row, int coloumn, StatusPlace place) {
        if (estaVazio(board[row][coloumn]))
            this.board[row][coloumn] = checkPlayer(place);
    }

    public void checaVitoria(int row, int coloumn) {
        

    }

    public boolean estaVazio(char tst) {
        if (tst == ' ') {
            return true;
        } else
            return false;
    }

    public char checkPlayer(StatusPlace status) {
        if (status == StatusPlace.PLAYER_ONE) {
            return 'X';
        } else
            return 'O';

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
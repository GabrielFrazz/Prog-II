package temp;

import board.StatusPlace;

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

    public int converteEntradaVitoria(int row, char coloumn, StatusPlace status) {
        if (coloumn == 'a') {
            
            return checaVitoria((row - 1), 0, status);
        }
        if (coloumn == 'b') {
            
            return checaVitoria((row - 1), 1, status);
        }
        else {
            
            return checaVitoria((row - 1), 1, status);
        }
    }

    public void entrada(int row, int coloumn, StatusPlace place) {
        if (estaVazio(board[row][coloumn]))
            this.board[row][coloumn] = checkPlayer(place);
    }

    public int checaVitoria(int row, int coloumn, StatusPlace player) {

        int conta = 0;

        for (int i = 0; i < 3; i++) {
            if (board[i][coloumn] == checkPlayer(player)) {
                conta++;
            }
        }
        if (conta != 3) {
            conta = 0;
            for (int i = 0; i < 3; i++) {
                if (board[row][i] == checkPlayer(player)) {
                    conta++;
                }
            }
            if (conta != 3) {
                conta = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (i == j) {
                            if (board[i][j] == checkPlayer(player)) {
                                conta++;
                            }
                        }
                    }
                }
                if (conta != 3) {
                    conta = 0;
                    int percorre = 3;
                    for (int i = 0; i < 3; i++) {
                        int stop = 0;
                        do {
                            if (board[i][percorre] == checkPlayer(player)) {
                                conta++;
                            }
                            stop++;
                        } while (stop == 0);
                    }
                }
            }
        }

        if(conta == 3){
            return 1;
        }
        else{
            return -1;
        }

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
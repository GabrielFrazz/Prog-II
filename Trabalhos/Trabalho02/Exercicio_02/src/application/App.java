package application;

import java.util.Scanner;

import board.StatusPlace;
import temp.TicTacToe;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        TicTacToe game = new TicTacToe();

        game.imprimeTabuleiro();

        sc.nextLine();

        game.converteEntrada(1, 'a', StatusPlace.PLAYER_ONE);
        game.converteEntrada(1, 'b', StatusPlace.PLAYER_ONE);
        game.converteEntrada(1, 'c', StatusPlace.PLAYER_ONE);

        game.imprimeTabuleiro();
        sc.nextLine();

        if(game.converteEntradaVitoria(1, 'c', StatusPlace.PLAYER_ONE) == 1){
            System.out.println("vitória do jogador 1");
        }
        else if(game.checaVitoria(1, 'c', StatusPlace.PLAYER_ONE) == -1){
            System.out.println("teste");
        }
        sc.close();

    }
}

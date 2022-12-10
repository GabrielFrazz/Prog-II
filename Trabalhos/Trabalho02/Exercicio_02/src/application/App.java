package application;

import java.util.Scanner;

import game.StatusPlace;
import game.TicTacToe;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        TicTacToe game = new TicTacToe();

        System.out.println("digite as posições no formato num/letra");

        game.imprimeTabuleiro();

        sc.nextLine();
        
        game.converteEntrada(1, 'a', StatusPlace.PLAYER_ONE);

        game.imprimeTabuleiro();

        sc.close();

    }
}

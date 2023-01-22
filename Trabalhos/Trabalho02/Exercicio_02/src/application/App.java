package application;

import java.util.Scanner;

import boardgame.Player;
import gamelayer.Game;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player("Player_one", 'X');
        Player p2 = new Player("Player_two", 'O');
        Game game = new Game(p1, p2);
        game.welcome(sc);
        sc.close();
        
    }
}

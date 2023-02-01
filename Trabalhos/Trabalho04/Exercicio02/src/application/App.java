package application;

import cartoes.Aniversario;
import cartoes.CartaoWeb;
import cartoes.DiaDosNamorados;
import cartoes.Natal;

public class App {
    public static void main(String[] args) throws Exception {
        
        CartaoWeb[] cartoes = new CartaoWeb[3];

        cartoes[0] = new DiaDosNamorados("Alissa");
        cartoes[1] = new Aniversario("Júlia");
        cartoes[2] = new Natal("Genivaldo");

        for(int i = 0; i < 3; i++){
            System.out.println("--------" + cartoes[i].getClass().getSimpleName() + "--------");
            cartoes[i].showMessage();
            System.out.println();
        }
    }
}

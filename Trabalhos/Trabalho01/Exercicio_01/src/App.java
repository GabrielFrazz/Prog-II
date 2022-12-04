import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de calculo de salário");
        System.out.print("favor entrar com o valor bruto: ");
        double valor = sc.nextDouble();
        double val_liq = valor/2.0;
        System.out.println("o valor liquido a ser recebido é: R$" + String.format("%.2f", val_liq));
        sc.close();
    }
}

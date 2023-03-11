import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");

        int x = 0, y = 0;

        boolean test = false;
        while (!test) {
            System.out.print("Informe o primeiro valor: ");
            try {
                x = teclado.nextInt();
                test = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("você digitou algo que não é um inteiro!");
                System.out.println("tente denovo.");
                System.out.println("-----------------------------------------");
                System.out.println();
                teclado.next();
            }

        }

        test = false;
        while (!test) {
            System.out.print("Informe o segundo valor: ");
            try {
                y = teclado.nextInt();
                test = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("-----------------------------------------");
                System.out.println("você digitou algo que não é um inteiro!");
                System.out.println("tente denovo.");
                System.out.println("-----------------------------------------");
                System.out.println();
                teclado.next();
            }
        }

        double r = 0.0;
        try {
            r = ((double)x / y);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            teclado.close();
        }

        System.out.printf("O resultado da divisão é: %.2f", r);
    }
}

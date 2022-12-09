package application;

import java.util.Scanner;

import entities.IntegerSet;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Apresentação

        System.out.println("olá usuário!");
        System.out.println("nesse programa você deve digitar dois conjuntos numéricos");
        System.out.println("-duas observações-");
        System.out.println("*os conjuntos devem estar no intervalo [0,50]");
        System.out.println("*não devem haver numeros repetidos");
        System.out.println("---precione ENTER para continuar---");
        sc.nextLine();

        // inicio
        System.out.print("qual o tamanho do conjunto A: ");
        int tamA = sc.nextInt();

        int[] conjA = new int[tamA];

        System.out.println();
        System.out.println("entre com os elementos do conjunto A");

        for (int i = 0; i < conjA.length; i++) {
            System.out.print("-->");
            conjA[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("qual o tamanho do conjunto B: ");
        int tamB = sc.nextInt();

        int[] conjB = new int[tamB];

        System.out.println();
        System.out.println("entre com os elementos do conjunto B");

        for (int i = 0; i < conjB.length; i++) {
            System.out.print("-->");
            conjB[i] = sc.nextInt();
        }

        IntegerSet setA = new IntegerSet();
        IntegerSet setB = new IntegerSet();

        // preenchendo setA
        for (int i = 0; i < conjA.length; i++) {
            setA.adicionarElemento(conjA[i]);
        }

        // preenchendo setB
        for (int i = 0; i < conjB.length; i++) {
            setB.adicionarElemento(conjB[i]);
        }

        System.out.println();
        System.out.println("conj A = " + setA.toString());

        System.out.println();
        System.out.println("conj B = " + setB.toString());

        boolean loop = true;
        IntegerSet result = new IntegerSet();

        do {

            System.out.println();
            System.out.println("escolha uma opção: ");
            System.out.println("1 - União A e B");
            System.out.println("2 - Interseção A e B");
            System.out.println("3 - Diferença A-B");
            System.out.println("4 - Diferença B-A");
            System.out.print("-->");

            int opc = sc.nextInt();

            if (opc == 1) {
                result = result.uniao(setA, setB);

                System.out.println();
                System.out.println("AUB = " + result.toString());
            }
            if (opc == 2) {
                result = result.intersecao(setA, setB);

                System.out.println();
                System.out.println("A(intersec)B = " + result.toString());
            }
            if (opc == 3) {
                result = result.diferencaAB(setA, setB);

                System.out.println();
                System.out.println("A-B = " + result.toString());
            }
            if (opc == 4) {
                result = result.diferencaBA(setA, setB);

                System.out.println();
                System.out.println("B-A = " + result.toString());
            }

            System.out.printf("\ndeseja continuar?\n 1 - sim \n 2 - não");
            System.out.print("\n-->");

            int continuar = sc.nextInt();

            if (continuar == 1) {
                loop = true;
            } else if (continuar == 2) {
                loop = false;
            }

        } while (loop == true);

        sc.close();
    }
}

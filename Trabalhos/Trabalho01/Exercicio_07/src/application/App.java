package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Invoice;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com as informações do item: ");
        System.out.println();

        System.out.print("numero: ");
        int numIntem = sc.nextInt();
        System.out.println("------descrição------");
        sc.nextLine();
        String abtItem = sc.nextLine();
        System.out.print("quantidade: ");
        int qtdItem = sc.nextInt();
        System.out.print("preço: ");
        double priceItem = sc.nextDouble();

        Invoice invoice = new Invoice(numIntem, abtItem, qtdItem, priceItem);

        System.out.println();
        System.out.println("Info Item: ");
        System.out.println();

        System.out.println("item " + invoice.getNumIntem());
        System.out.println(invoice.getAbtItem());
        System.out.println("quantidade: " + invoice.getQtdItem());
        System.out.println("preço: R$" + String.format("%.2f", invoice.getPriceItem()));

        System.out.println();

        System.out.println("VALOR DA FATURA: R$" + String.format("%.2f",invoice.getInvoiceAmount()));

        sc.close();
    }
}

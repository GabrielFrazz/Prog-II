package application;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import services.SeguroDeVida;

public class App {
    public static void main(String[] args) {
        System.out.println("-------------CONTA CORRENTE---------------");
        ContaCorrente c = new ContaCorrente(200.00, 450, 500.00);
        System.out.println("saldo: " + c.getAmount());
        System.out.println("deposito de 500");
        c.setAddAmount(500.00);
        System.out.println("saldo: " + c.getAmount());
        System.out.println("Extrato: ");
        System.out.println(c.bankStatement()); 
        System.out.printf("valor do tributo: %.2f", c.taxTotal());

        System.out.println();
        System.out.println("-------------CONTA POUPANCA---------------");
        ContaPoupanca p = new ContaPoupanca(0.06, 500, 12000.00);
        System.out.println("saldo: " + p.getAmount());
        System.out.println("deposito de 10.000");
        p.setAddAmount(10000.00);
        System.out.println("saldo: " + p.getAmount());
        System.out.println("Extrato: ");
        System.out.println(p.bankStatement()); 
        
        System.out.println("-------------SEGURO DE VIDA---------------");
        SeguroDeVida s = new SeguroDeVida(3754.00, 296.00);
        System.out.println("saldo: " + s.getAmount());
        System.out.println("deposito mensal: " + s.getMonthlyDeposit());
        System.out.printf("valor do tributo: %.2f", s.taxTotal());
    }
}
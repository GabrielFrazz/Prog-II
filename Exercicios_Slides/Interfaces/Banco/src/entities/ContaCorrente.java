package entities;

import services.Tributavel;

public class ContaCorrente extends Conta implements Tributavel{

    private Double withdrawnLimit;

    public ContaCorrente(double withdrawnLimit, int number, double amount) {
        super(number, amount);
        this.withdrawnLimit = withdrawnLimit;
    }

    @Override
    public Double withdrawn(double value) {
        if (value <= withdrawnLimit) {
            super.setDiscountedAmount(value);
            return getAmount();
        } else {
            return 0.0;
        }
    }

    @Override
    public void deposit(double value) {
        super.setAddAmount(value);
    }

    @Override
    public String bankStatement() {
        return "Saldo em conta: "
                + String.format("%.2f", super.getAmount())
                + "\n"
                + "Cheque especial: "
                + String.format("%.2f", withdrawnLimit)
                + "\n"
                + "Saldo total: "
                + String.format("%.2f", (withdrawnLimit + super.getAmount()));
    }

    @Override
    public double taxTotal() {
        return super.getAmount() * 0.03;
    }

}
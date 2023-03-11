package entities;

public class Account {

    private double balance;
    private double limit;

    public Account() {
    }

    public Account(Double balance, Double limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimite(double limit) {
        this.limit = limit;
    }

    public void deposita(double amount) {
        balance += amount;
    }

    public Double saca(double amount) throws AccountException {
        if (amount > balance + limit) {
            throw new AccountException("Limite excedido");
        } else if (amount > balance) {
            throw new AccountException("Saldo insuficiente");
        } else {
            balance = balance - amount;
            return amount;
        }
    }

}
package entities;

public class AccountException extends Exception{
    
    private Double balance;

    public AccountException(String msg, Double balance){
        super(msg);
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

}
package entities;

public abstract class Conta {
    
    private Integer number;
    private Double amount;

    public Conta() {
    }

    public Conta(Integer number, Double amount) {
        this.number = number;
        this.amount = amount;
    }
    
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAddAmount(Double value) {
        this.amount = amount + value;
    }

    public void setDiscountedAmount(double value){
        this.amount = amount - value;
    }

    abstract Double withdrawn(double value);
    abstract void deposit(double value);
    abstract String bankStatement();
}
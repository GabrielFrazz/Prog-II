package services;

public class SeguroDeVida implements Tributavel{

    private Double amount;
    private Double monthlyDeposit;

    public SeguroDeVida(double amount, double monthlyDeposit){
        this.amount = amount;
        this.monthlyDeposit = monthlyDeposit;
    }
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getMonthlyDeposit() {
        return monthlyDeposit;
    }

    public void setMonthlyDeposit(Double monthlyDeposit) {
        this.monthlyDeposit = monthlyDeposit;
    }

    @Override
    public double taxTotal(){
        return (amount + (0.40 * monthlyDeposit)) * 0.02;
    }
    
    
}
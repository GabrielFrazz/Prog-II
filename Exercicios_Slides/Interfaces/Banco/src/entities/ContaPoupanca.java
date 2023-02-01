package entities;

public class ContaPoupanca extends Conta{

    private Double incomeRate;

    public ContaPoupanca(double incomeRate, int number, double amount) {
        super(number, amount);
        this.incomeRate = incomeRate;  
    }

    @Override
    public Double withdrawn(double value) {
        super.setDiscountedAmount(value);
        return getAmount();
    }

    @Override
    public void deposit(double value) {
        super.setAddAmount(value);
    }

    @Override
    public String bankStatement() {
        return "Saldo sem taxa de rendimento: "
        + String.format("%.2f", super.getAmount())
        + "\n"
        + "Saldo com taxa de rendimento: "
        + String.format("%.2f",(super.getAmount() + ( super.getAmount()*incomeRate)));
    }
    
}
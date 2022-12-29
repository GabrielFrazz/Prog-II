package enterprise;

public class Seller extends Employee{
    
    private Double salesValue;
    private Integer salesAmount;

    public Seller(String name, Integer age, String sex, Double income, String registration, Double salesValue, Integer salesAmount){
        super(name, age, sex, income, registration);
        this.salesValue = salesValue;
        this.salesAmount = salesAmount;
    }

    /**
     * @return Double return the salesValue
     */
    public Double getSalesValue() {
        return salesValue;
    }

    /**
     * @param salesValue the salesValue to set
     */
    public void setSalesValue(Double salesValue) {
        this.salesValue = salesValue;
    }

    /**
     * @return Integer return the salesAmount
     */
    public Integer getSalesAmount() {
        return salesAmount;
    }

    /**
     * @param salesAmount the salesAmount to set
     */
    public void setSalesAmount(Integer salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString(){
        return "Seller: "
                + super.getName()
                + "\n"
                + "income: "
                + super.getIncome()
                + "\n"
                + "Sales value: " + String.format("R$%.2f", salesValue) + "\n"
                + "Sales amount: " + salesAmount;
    }
}
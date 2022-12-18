package enterprise;

import entities.Person;

public class Client extends Person {

    private Double debtAmount;
    private Integer yearOfBirth;

    public Client(String name, Integer age, String sex, Double debtAmount, Integer yearOfBirth) {
        super(name, age, sex);
        this.debtAmount = debtAmount;
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * @return Double return the debtAmount
     */
    public Double getDebtAmount() {
        return debtAmount;
    }

    /**
     * @param debtAmount the debtAmount to set
     */
    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    /**
     * @return Integer return the yearOfBirth
     */
    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * @param yearOfBirth the yearOfBirth to set
     */
    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Client: "
                + super.getName()
                + ", "
                + super.getAge()
                + ", "
                + super.getSex()
                + ", "
                + yearOfBirth
                + "\ndebt: R$"
                + String.format("%.2f", debtAmount);
    }

}
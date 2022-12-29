package enterprise;

import entities.Person;

public class Employee extends Person{
    
    private Double income;
    private String registration;

    public Employee(String name, Integer age, String sex, Double income, String registration){
        super(name, age, sex);
        this.income = income;
        this.registration = registration;
    }

    /**
     * @return Double return the income
     */
    public Double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(Double income) {
        this.income = income;
    }

    /**
     * @return String return the registration
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * @param registration the registration to set
     */
    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Double inssDebt(){
        return (income*0.11);
    }

}
package enterprise;

public class Manager extends Employee{
    
    private String managerName;

    public Manager(String name, Integer age, String sex, Double income, String registration, String managerName){
        super(name, age, sex, income, registration);
        this.managerName = managerName;
    }

    /**
     * @return String return the managerName
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * @param managerName the managerName to set
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString(){
        return "Manager: "
                + super.getName()
                + ", "
                + super.getAge()
                + "y"
                + "\n" + "registration: " + super.getRegistration() + "\n"
                + "management name: " + managerName + "\n"
                + "inss debt: "
                + String.format("R$%.2f", super.inssDebt());
    }

}
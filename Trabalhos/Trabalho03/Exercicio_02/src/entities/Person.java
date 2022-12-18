package entities;

public class Person {
    
    private String name;
    private Integer age;
    private String sex;

    public Person(String name, Integer age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Integer return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return String return the Sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param Sex the Sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

}
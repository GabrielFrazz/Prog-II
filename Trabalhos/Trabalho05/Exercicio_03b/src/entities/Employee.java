package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee implements Comparable<Employee>{
    
    private static final DateTimeFormatter FMT1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer id;
    private String name;
    private Double wage;
    private LocalDate hiringDate;

    public Employee(Integer id, String name, Double wage, String hiringDate) {
        this.id = id;
        this.name = name;
        this.hiringDate = LocalDate.parse(hiringDate,FMT1);
        this.wage = wage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getwage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    @Override
    public int compareTo(Employee other) {
		return wage.compareTo(other.getwage());
	}

    @Override
    public String toString() {
        return "Funcionário: " 
        + name 
        + "\n" 
        + "id: " + id 
        + "\n"
        + "salário: " + String.format("%.2f", wage) 
        + "\n"
        + "Data de contratação: " + hiringDate.format(FMT1);
    }

    
}
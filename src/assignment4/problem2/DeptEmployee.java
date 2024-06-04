package assignment4.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeptEmployee {
    protected String name;
    protected LocalDate hireDate;
    protected final double salary;
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    DeptEmployee(double salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public double computeSalary(){
        return salary;
    }
}

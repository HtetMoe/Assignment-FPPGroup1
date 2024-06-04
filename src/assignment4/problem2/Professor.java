package assignment4.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Professor extends DeptEmployee{
    private int numberOfPublications;

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

    Professor(double salary){
        super(salary);
    }

    @Override
    public double computeSalary() {
        return super.salary;
    }


    @Override
    public String toString() {
        return String.format("""
                Name: %s
                HireDate: %s
                NumberOfPublications: %d
                Salary: %.2f
                """,
                super.getName(),
                formatter.format(super.getHireDate()),
                getNumberOfPublications(),
                computeSalary());
    }

}

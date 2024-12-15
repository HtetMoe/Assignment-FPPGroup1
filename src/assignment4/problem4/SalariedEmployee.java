package assignment4.problem4;

public class SalariedEmployee extends Empolyee{
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    SalariedEmployee(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
    }
    public double getPayment(){
        return weeklySalary;
    }
    @Override
    public String toString(){
        return String.format("""
                FirstName: %s
                LastName: %s
                SSN: %s
                WeeklySalary: %.2f
                Payment: %.2f
                """,
                super.getFirstName(),
                super.getLastName(),
                super.getSsn(),
                getWeeklySalary(),
                getPayment());
    }
}

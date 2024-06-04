package assignment4.problem4;

public class HourlyEmployee extends Empolyee{
    private double wages;
    private double hours;

    public double getWages() {
        return wages;
    }

    public double getHours() {
        return hours;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    HourlyEmployee(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
    }

    public double getPayment(){
        return wages * hours;
    }
    @Override
    public String toString(){
        return String.format("""
                FirstName: %s
                LastName: %s
                SSN: %s
                Wages: %.2f
                Hours: %.2f
                Payment: %.2f
                """,
                super.getFirstName(),
                super.getLastName(),
                super.getSsn(),
                getWages(),
                getHours(),
                getPayment());
    }
}

package assignment4.problem4;

public abstract class Empolyee {
    private final String firstName;
    private final String lastName;
    private final String ssn;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    Empolyee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    abstract double getPayment();
}

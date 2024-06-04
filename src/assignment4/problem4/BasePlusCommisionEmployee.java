package assignment4.problem4;

public final class BasePlusCommisionEmployee extends CommissionEmployee{
    private double baseSalary;

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    BasePlusCommisionEmployee(String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
    }

    public double getPayment(){
        return baseSalary + super.getGrossSales() * super.getCommissionRate()/100;
    }

    @Override
    public String toString() {
        return String.format("""
                Firstname: %s
                Lastname: %s
                SSN: %s
                GrossSale: %.2f
                CommissionRate: %.2f%%
                BaseSalary: %.2f
                Payment: %.2f
                """,
                super.getFirstName(),
                super.getLastName(),
                super.getSsn(),
                super.getGrossSales(),
                super.getCommissionRate(),
                getBaseSalary(),
                getPayment());
    }
}

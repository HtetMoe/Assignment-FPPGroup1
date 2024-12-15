package assignment4.problem4;

public class CommissionEmployee extends Empolyee{
    private double grossSales;
    private double commissionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    CommissionEmployee(String firstName, String lastName, String ssn){
        super(firstName, lastName, ssn);
    }

    public double getPayment(){
        return getGrossSales()*getCommissionRate()/100;
    }

    @Override
    public String toString(){
        return String.format("""
                Frist name: %s
                Last name: %s
                SSN: %s
                GrossSales: %.2f
                CommissionRate: %.2f%%
                Payment: %.2f
                """,
                super.getFirstName(),
                super.getLastName(),
                super.getSsn(),
                getGrossSales(),
                getCommissionRate(),
                getPayment());
    }
}

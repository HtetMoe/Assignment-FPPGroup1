package assignment4.problem4;

public class Driver {
    public static void main(String[] args) {

        Empolyee emp1 = new BasePlusCommisionEmployee("Emily", "Johnson", "23-45-6789");
        Empolyee emp2 = new CommissionEmployee("Michael", "Brown", "234-56-7890");
        Empolyee emp3 = new HourlyEmployee("Sophia", "Martinez", "345-67-8901");
        Empolyee emp4 = new SalariedEmployee("Lucas", "White", "456-78-9012");
        Empolyee emp5 = new CommissionEmployee("Ava", "Taylor", "567-89-0123");

        Empolyee[] objects = {emp1, emp2, emp3, emp4, emp5};


        ((BasePlusCommisionEmployee)emp1).setGrossSales(50000.0);
        ((BasePlusCommisionEmployee)emp1).setCommissionRate(0.15);
        ((BasePlusCommisionEmployee)emp1).setBaseSalary(8000.0);
        ((CommissionEmployee)emp2).setGrossSales(40000.0);
        ((CommissionEmployee)emp2).setCommissionRate(0.25);


        ((HourlyEmployee)emp3).setWages(50.0);
        ((HourlyEmployee)emp3).setHours(160.0);
        ((SalariedEmployee)emp4).setWeeklySalary(2000.0);
        ((CommissionEmployee)emp5).setGrossSales(50000.0);
        ((CommissionEmployee)emp5).setCommissionRate(0.3);
        Empolyee res = findMaxSalary(objects);
        System.out.println(res);
    }

    public static Empolyee findMaxSalary(Empolyee[] col) {
        Empolyee result = null;
        if (col == null || col.length == 0) {
            return result;
        }
        double maxSalary = 0;
        for(Empolyee e : col) {
            double salary = e.getPayment();
            if (salary > maxSalary) {
                maxSalary = salary;
                result = e;
            }
        }
        return result;
    }
}

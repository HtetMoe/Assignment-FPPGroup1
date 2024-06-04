package assignment4.problem2;

public final class Secretary extends DeptEmployee{
    private double overtimeHours;

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    Secretary(double salary){
        super(salary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + overtimeHours * 12;
    }

    @Override
    public String toString() {
        return String.format("""
                Name: %s
                HireDate: %s
                OverTime: %.2f
                Salary: %.2f
                """,
                super.getName(),
                formatter.format(super.getHireDate()),
                getOvertimeHours(),
                computeSalary());
    }
}

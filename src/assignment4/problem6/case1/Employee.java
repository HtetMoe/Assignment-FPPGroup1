package assignment4.problem6.case1;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //instance of strategy
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (!(obj instanceof Employee)) return false; // employee is not an employee

        Employee emp = (Employee) obj;
        return emp.id == id && emp.name.equals(name); // same name, same id
    }
}


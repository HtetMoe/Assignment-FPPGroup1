package assignment4.problem6.case2;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //same class strategy
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Employee emp = (Employee) obj;
        return emp.name.equals(name) && emp.id == id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}



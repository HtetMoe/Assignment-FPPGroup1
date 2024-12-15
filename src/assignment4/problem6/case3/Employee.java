package assignment4.problem6.case3;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (getClass() != obj.getClass()) return false;

        Employee emp = (Employee) obj;
        return emp.id == id && emp.name.equals(name);
    }

}


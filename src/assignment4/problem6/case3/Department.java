package assignment4.problem6.case3;

public class Department {
    private String depName;
    private Employee manager;

    public Department(String name, Employee manager) {
        this.depName = name;
        this.manager = manager;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return true;

        if (getClass() != obj.getClass()) return false;

        Department department = (Department) obj;
        return department.depName.equals(depName) && department.manager.equals(manager);
    }

}


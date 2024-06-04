package assignment4.problem6.case3;

public class DepartmentTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Moe", 1);
        Employee e2 = new Employee("Asma", 2);

        Department d1 = new Department("Frontend", e1);
        Department d2 = new Department("Frontend", e1);
        Department d3 = new Department("Backend", e2);

        System.out.println("d1 equals d2 : " + d1.equals(d2)); // true
        System.out.println("d1 equals d3 : " + d1.equals(d3)); // false
    }
}


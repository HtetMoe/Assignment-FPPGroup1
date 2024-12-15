package assignment4.problem6.case1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Moe", 1);
        Employee e2 = new Employee("Moe", 1);
        Employee e3 = new Employee("Asma", 2);

        Manager m1 = new Manager("Htet", 3, 1000.0);
        Manager m2 = new Manager("Htet", 3, 1000.0);
        Manager m3 = new Manager("Moe", 4, 2000.0);

        System.out.println("e1 equals e2 : " + e1.equals(e2)); // true
        System.out.println("e1 equals e3 : " + e1.equals(e3)); // false
        System.out.println();

        System.out.println("m1 equals m2 : " + m1.equals(m2)); // true
        System.out.println("m1 equals m3 : " + m1.equals(m3)); // false
        System.out.println();

        System.out.println("e1 equals m1 : " + e1.equals(m1)); // false
        System.out.println("m1 equals e1 : " + m1.equals(e1)); // false
        System.out.println();
    }
}

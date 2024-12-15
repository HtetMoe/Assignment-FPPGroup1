package assignment4.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        DeptEmployee prof1 = new Professor(20000.0);
        prof1.setName("Johnson");
        prof1.setHireDate(LocalDate.parse("05/22/2016", dateFormat));

        DeptEmployee prof2 = new Professor(22000.0);
        prof2.setName("Jane");
        prof2.setHireDate(LocalDate.parse("02/12/2010", dateFormat));

        DeptEmployee prof3 = new Professor(40000.0);
        prof3.setName("Mary");
        prof3.setHireDate(LocalDate.parse("08/24/2018", dateFormat));

        DeptEmployee sec1 = new Secretary(8000.0);
        sec1.setName("John");
        sec1.setHireDate(LocalDate.parse("11/08/2013", dateFormat));

        DeptEmployee sec2 = new Secretary(6000.0);
        sec2.setName("Lisa");
        sec2.setHireDate(LocalDate.parse("12/10/2014", dateFormat));

        ((Professor) prof1).setNumberOfPublications(12);
        ((Professor) prof2).setNumberOfPublications(20);
        ((Professor) prof3).setNumberOfPublications(40);
        ((Secretary)sec1).setOvertimeHours(50.0);
        ((Secretary)sec2).setOvertimeHours(200.0);

        DeptEmployee[] objects = new DeptEmployee[]{prof1, prof2, prof3, sec1, sec2};

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you wish to see the sum of all Professor and Secretary salary in the department (y/n) :");
        String input = sc.next();
        while(true){
            if (input.equalsIgnoreCase("y")){
                double sum = 0;
                for (DeptEmployee object : objects) {
                    sum += object.computeSalary();
                    System.out.println(object);
                }
                System.out.println("Sum salary: " + sum);
                System.out.println("Average salary: " + sum / objects.length);
                break;
            }
            else if (input.equalsIgnoreCase("n")){
                break;
            }
            else{
                System.out.println("Invalid input, please try again");
                input = sc.next();
            }


        }






    }
}

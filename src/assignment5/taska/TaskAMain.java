package assignment5.taska;

import java.util.Arrays;

public class TaskAMain {
    public static void main(String[] args) {
        NameComparator nameComparator = new NameComparator();
        DeptEmployee [] employees = DeptEmployeeData.getDeptData();
        //before sort
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees, nameComparator);
        //after sort
        System.out.println(Arrays.toString(employees));

    }
    DeptEmployee[] prepareDate(){
        return DeptEmployeeData.getDeptData();
    }
}

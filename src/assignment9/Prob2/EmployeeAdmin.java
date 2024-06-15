package assignment9.Prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        List<Employee> employees = new ArrayList<>();

        for(String socNum : socSecNums) {
            if(table.containsKey(socNum)){
                Employee e = table.get(socNum);

                //whose salary is greater than $80,000.
                if(e.getSalary() > 80000){
                    employees.add(e);
                }
            }
        }

        //sort ascending order
        Collections.sort(employees, (e1, e2) -> e1.getSsn().compareTo(e2.getSsn()));
        return employees;
    }
}

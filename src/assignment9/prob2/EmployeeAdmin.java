package assignment9.prob2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		//IMPLEMENT
		List<Employee> ret = new ArrayList<>();
		HashMap<String, Integer> ssn = new HashMap<>();
		for (String num : socSecNums) {
			ssn.put(num, 0);
		}
		table.forEach((k,v)->{
			if (v.getSalary() > 80000 && ssn.containsKey(k)) {
				ret.add(v);
			}
		});
		ret.sort((e1,e2) -> e1.getSsn().compareTo(e2.getSsn()));

		return ret;
		
	}
	
}

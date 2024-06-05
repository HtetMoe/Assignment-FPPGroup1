package assignment5.taskc;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;


public class DeptEmployeeData {

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000.0, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000.0,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",45000.0,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000.0,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000.0,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[]  department = {p0,p1,p2,s0,s1};
		return department;

	}

	public static void main(String[] args) {
		DeptEmployee[] employess = getDeptData();
		// below print will print out the 0 salary for secretaries
		// because toString method of secretary print the variable netSalary
		// and netSalary is only initialized in getSalary() method
		System.out.println(Arrays.toString(employess));
		DeptEmployeeData ob = new DeptEmployeeData();
		ob.sort(employess);
		System.out.println(Arrays.toString(employess));
	}
	public void sort(DeptEmployee[] employess){
		class SalaryComparator implements Comparator<DeptEmployee> {
			@Override
			public int compare(DeptEmployee o1, DeptEmployee o2) {
				return Double.compare(o2.getSalary(), o1.getSalary());
			}
		}
		Arrays.sort(employess, new SalaryComparator());
	}

}

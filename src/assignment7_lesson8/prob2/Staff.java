package assignment7_lesson8.prob2;

public final class Staff implements EmployeeData {
	private String name;
	private double salary;
	private int numDependants;

	public Staff(String name, double salary, int numDependants) {
		this.name = name;
		this.salary = salary;
		this.numDependants = numDependants;
	}

	@Override
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getNumDependants() {
		return numDependants;
	}

	@Override
	public String toString() {
		return STR."""
		Staff{ name = '\{name}\{'\''}, salary = \{getSalary()}, numDependants = \{numDependants}}
		""";
	}
}

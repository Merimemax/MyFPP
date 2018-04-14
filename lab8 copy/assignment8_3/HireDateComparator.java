package assignment8_3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
	final double tolerance = 0.0001;

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getHireDate().compareTo(o2.getHireDate()) != 0) {
			return o1.getHireDate().compareTo(o2.getHireDate());
		} else if (o1.getName().compareTo(o2.getName()) != 0) {
			return o1.getName().compareTo(o2.getName());
		} else
			return (int) (Math.abs(o1.getSalary() - o2.getSalary()) < tolerance ? 0 : o1.getSalary() - o2.getSalary());
	}

}

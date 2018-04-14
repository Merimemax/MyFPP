package assignment10_1;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {

		if (e1.getHireDate().compareTo(e2.getHireDate()) != 0) {
			return e1.getHireDate().compareTo(e2.getHireDate());
		} else if (e1.getName().compareTo(e2.getName()) != 0) {
			return e1.getName().compareTo(e2.getName());
		}
		return ((Math.abs(e1.getSalary() - e2.getSalary()) < 0.001) ? 0 : (int) (e1.getSalary() - e2.getSalary()));
	}

}

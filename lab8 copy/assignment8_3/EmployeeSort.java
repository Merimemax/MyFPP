package assignment8_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}

	public EmployeeSort() {
		Employee[] empArray = { new Employee("George", 40000, 1996, 11, 5), new Employee("Dave", 50000, 2000, 1, 3),
				new Employee("Richard", 45000, 2001, 2, 7) };
		List<Employee> empList = Arrays.asList(empArray);
		
		NameComparator nameComp = new NameComparator();
		SalaryComparator salaryComp = new SalaryComparator();
		HireDateComparator hireDateComp = new HireDateComparator();
		
		System.out.println("----------Name Comparator -------------");
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		
		System.out.println("\n\n----------Salary Comparator -------------");
		Collections.sort(empList, salaryComp);
		System.out.println(empList);
		
		System.out.println("\n\n----------Hire Date Comparator -------------");
		Collections.sort(empList, hireDateComp);
		System.out.println(empList);

	}

}

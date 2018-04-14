package assignment8_3;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee>{
	final double tolerance = 0.0001;
	@Override
	public int compare(Employee o1, Employee o2) {
		double salary1 = o1.getSalary();
		double salary2 = o2.getSalary();
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		Date date1 = o1.getHireDate();
		Date date2 = o2.getHireDate();
		
		if(Math.abs(salary1- salary2) > tolerance) {
			return Double.compare(salary1, salary2);
		} else if (name1.compareTo(name2) != 0){
			return name1.compareTo(name2);
		}
		return date1.compareTo(date2);
	}



}

package assignment4_1;

import java.time.LocalDate;

public final class Secretary extends DeptEmployee {
	private double overtimeHours;

	public Secretary(String name, LocalDate hireDate, double salary) {
		super(name, hireDate, salary);
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		
		return ( 12 * overtimeHours ) + super.computeSalary();
	}
	
}

package assignment4_1;

import java.time.LocalDate;

public final class Professor extends DeptEmployee {
	private int numberOfPublications;

	public Professor(String name, LocalDate hireDate, double salary) {
		super(name, hireDate, salary);
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	@Override
	public double computeSalary() {
		
		return super.computeSalary();
	}
}

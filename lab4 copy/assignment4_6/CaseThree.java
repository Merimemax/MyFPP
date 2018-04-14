package assignment4_6;

import java.util.GregorianCalendar;

public class CaseThree {

	public static void main(String[] args) {
		Person3 p1 = new Person3("bob", new GregorianCalendar(1970, 1, 1));
		Person3 p2 = new Person3("bob", new GregorianCalendar(1970, 1, 1));
		Person3 p3 = new Person3("sam", new GregorianCalendar(1980, 1, 1));

		PersonWithJob3 pj1 = new PersonWithJob3("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		PersonWithJob3 pj2 = new PersonWithJob3("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		PersonWithJob3 pj3 = new PersonWithJob3("rob", new GregorianCalendar(1980, 1, 1), 75000.00);
		PersonWithJob3 pj4 = new PersonWithJob3("bob", new GregorianCalendar(1970, 1, 1), 80000.00);

		System.out.println("-------- Case Three ------------");

		System.out.println(" p1 equals  p2 expected result is true  result: " + p1.equals(p2));
		System.out.println(" p1 equals  p3 expected result is false result: " + p1.equals(p3));

		System.out.println(" p1 equals pj1 expected result is false result: " + p1.equals(pj1));

		System.out.println("pj1 equals pj2 expected result is true  result: " + pj1.equals(pj2));
		System.out.println("pj1 equals pj3 expected result is false result: " + pj1.equals(pj3));
		System.out.println("pj1 equals pj4 expected result is false result: " + pj1.equals(pj4));

	}
}

class Person3 {
	private String name;
	private GregorianCalendar dateOfBirth;

	Person3(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}

	public String getName() {
		return name;
	}

	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}

	@Override
	public boolean equals(Object person) {
		if (person == null)
			return false;
		if (!(person.getClass() == this.getClass()))
			return false;
		Person3 p = (Person3) person;
		if (!(this.name.equals(p.name) || this.dateOfBirth.equals( p.dateOfBirth)))
			return false;

		return true;
	}
}

 class PersonWithJob3 {
	Person3 p;
	private double salary;

	PersonWithJob3(String n, GregorianCalendar dob, double s) {
		p = new Person3(n, dob);
		this.salary = s;
	}

	public String getName() {
		return p.getName();
	}

	public GregorianCalendar getDateOfBirth() {
		return p.getDateOfBirth();
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object personWithJob) {
		double error = 0.0001;
		if (personWithJob == null)
			return false;
		if (!(this.getClass() == personWithJob.getClass()))
			return false;
		PersonWithJob3 p = (PersonWithJob3) personWithJob;
		if (!((this.getName().equals(p.getName())) && (this.getDateOfBirth().equals(p.getDateOfBirth()))
				&& (Math.abs(this.salary - p.salary) < error)))
			return false;
		return true;
	}
}
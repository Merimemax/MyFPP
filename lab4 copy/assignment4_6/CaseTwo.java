package assignment4_6;

import java.util.GregorianCalendar;

public class CaseTwo {

	public static void main(String[] args) {
		Person2 p1 = new Person2("bob", new GregorianCalendar(1970, 1, 1));
		Person2 p2 = new Person2("bob", new GregorianCalendar(1970, 1, 1));
		Person2 p3 = new Person2("sam", new GregorianCalendar(1980, 1, 1));
		
		
		PersonWithJob2 pj1 = new PersonWithJob2("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		PersonWithJob2 pj2 = new PersonWithJob2("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		PersonWithJob2 pj3 = new PersonWithJob2("rob", new GregorianCalendar(1980, 1, 1), 75000.00);
		PersonWithJob2 pj4 = new PersonWithJob2("bob", new GregorianCalendar(1970, 1, 1), 80000.00);

		System.out.println("-------- Case Two ------------");

		System.out.println(" p1 equals  p2 expected result is true  result: " + p1.equals(p2));
		System.out.println(" p1 equals  p3 expected result is false result: " + p1.equals(p3));

		System.out.println(" p1 equals pj1 expected result is false result: " + p1.equals(pj1));

		System.out.println("pj1 equals pj2 expected result is true  result: " + pj1.equals(pj2));
		System.out.println("pj1 equals pj3 expected result is false result: " + pj1.equals(pj3));
		System.out.println("pj1 equals pj4 expected result is false result: " + pj1.equals(pj4));

	}
}

class Person2 {
	private String name;
	private GregorianCalendar dateOfBirth;

	Person2(String name, GregorianCalendar dob) {
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
		if (this.getClass() != person.getClass()) 
			return false;
		Person2 p = (Person2) person;
		if (!(this.name.equals(p.name) || this.dateOfBirth.equals(p.dateOfBirth)))
			return false;
		return true;
	}
}

final class PersonWithJob2 extends Person {
	private double salary;

	PersonWithJob2(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object personJob) {
//		if (personJob == null)
//			return false;
//		if (this.getClass() != personJob.getClass())
//			return false;

		super.equals(personJob);
		PersonWithJob2 p = (PersonWithJob2) personJob;

		if (!((this.getName().equals(p.getName())) && (this.getDateOfBirth().equals(p.getDateOfBirth()))
				&& (Double.compare(this.salary, p.salary) == 0)))
			return false;
		return true;
	}
}
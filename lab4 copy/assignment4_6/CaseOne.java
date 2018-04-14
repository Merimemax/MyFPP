package assignment4_6;

import java.util.GregorianCalendar;

public class CaseOne {

	public static void main(String[] args) {
		Person p1 = new Person("bob", new GregorianCalendar(1970, 1, 1));
		Person p2 = new Person("bob", new GregorianCalendar(1970, 1, 1));
		Person p3 = new Person("sam", new GregorianCalendar(1980, 1, 1));

		Person pj1 = new PersonWithJob("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		Person pj2 = new PersonWithJob("bob", new GregorianCalendar(1970, 1, 1), 75000.00);
		Person pj3 = new PersonWithJob("rob", new GregorianCalendar(1980, 1, 1), 75000.00);
		Person pj4 = new PersonWithJob("bob", new GregorianCalendar(1970, 1, 1), 80000.00);

		System.out.println("-------- Case One ------------");

		System.out.println(" p1 equals  p2 expected result is true  result: " + p1.equals(p2));
		System.out.println(" p1 equals  p3 expected result is false result: " + p1.equals(p3));

		System.out.println(" p1 equals pj1 expected result is false result: " + p1.equals(pj1));

		System.out.println("pj1 equals pj2 expected result is true  result: " + pj1.equals(pj2));
		System.out.println("pj1 equals pj3 expected result is false result: " + pj1.equals(pj3));
		System.out.println("pj1 equals pj4 expected result is false result: " + pj1.equals(pj4));

	}

}

class Person {
	private String name;
	private GregorianCalendar dateOfBirth;

	Person(String name, GregorianCalendar dob) {
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
		if (!(person instanceof Person))
			return false;
		Person p = (Person) person;
		if (!(this.name.equals(p.name) || this.dateOfBirth.equals(p.dateOfBirth)))
			return false;
		return true;
	}

}

class PersonWithJob extends Person {
	private double salary;

	PersonWithJob(String n, GregorianCalendar dob, double s) {
		super(n, dob);
		this.salary = s;
	}

	public double getSalary() {
		return salary;
	}
}

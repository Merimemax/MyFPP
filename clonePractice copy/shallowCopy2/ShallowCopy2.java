package shallowCopy2;

public class ShallowCopy2 {
	Address ad = new Address("3902 Ames Street", "Washingto D.C. 20019");
	Person p = new Person("Merih", 109142, ad);
	Person p2;
	static ShallowCopy2 sup = new ShallowCopy2();

	public static void main(String[] args) {
		sup = new ShallowCopy2();
		sup.process();
	}

	public void process() {

		try {

			sup.p2 = (Person) sup.p.clone();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		sup.p2.address.city = "asmara";
		sup.p2.name = "sam";

		System.out.println(sup.p.address.city);
		System.out.println(sup.p.name);
	}

}

class Person implements Cloneable {
	String name;
	int id;
	Address address;

	Person(String name, int id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public void display() {
		System.out.println(name + " " + address);
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		Person pCopy = (Person) super.clone();
		pCopy.address = (Address) this.address.clone();
		return pCopy;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

class Address implements Cloneable {
	String street;
	String city;

	Address(String street, String city) {
		this.street = street;
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
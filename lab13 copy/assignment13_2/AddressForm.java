package assignment13_2;

public class AddressForm {
	String id;
	String firstName;
	String lastName;
	String ssn;
	String street;
	String city;
	String zip;

	public AddressForm(String firstName, String lastName, String ssn, String street, String city, String zip) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Values (\"" + firstName + "\",\"" + lastName + "\", \"" + ssn + "\",\"" + street + "\",\"" + city
				+ "\",\"" + zip + "\");";
	}
	// @Override
	// public String toString() {
	// return "AddressForm [id=" + id + ", firstName=" + firstName + ", lastName=" +
	// lastName + ", ssn=" + ssn
	// + ", street=" + street + ", city=" + city + ", zip=" + zip + "]";
	// }

}

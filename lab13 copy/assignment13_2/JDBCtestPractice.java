package assignment13_2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCtestPractice {
	public static void main(String[] args) throws SQLException {
		runQuery();
	}
	static String value = "";
//	static String sqlQurey1 = "INSERT INTO form (FirstName, LastName, SSN, Street,City,Zip)" + " Values (\"some\", \"one\", \"555667777\", \"5678 mpp St NE\", \"fairfaild iowa\", \"50006\")";
	static void runQuery() throws SQLException{
		Statement myState = ConnectionManager.getConnection().createStatement();
		String sqlQurey1 = "INSERT INTO form (FirstName, LastName, SSN, Street,City,Zip)" + value;
		myState.execute(sqlQurey1);
//		ResultSet myRes = myState.executeQuery("Select * FROM form");
//		List<AddressForm> myList = populateList(myRes);
//		System.out.println("\n" + myList);

		ConnectionManager.getConnection().close();
	}
	private static List<AddressForm> populateList(ResultSet myRes) {
		List<AddressForm> studentList = new ArrayList<>();
		try {
			while (myRes.next()) {

				String id = myRes.getString("ID");
				String firstName = myRes.getString("FirstName");
				String lastName = myRes.getString("LastName");
				String ssn = myRes.getString("SSN");
				String street = myRes.getString("Street");
				String city = myRes.getString("City");
				String zip = myRes.getString("Zip");

				System.out.printf("\n%-5s%-10s%-10s%-10s-10s%-10s%-10s", id, firstName, lastName, ssn, street, city,
						zip);
//				studentList.add(new AddressForm(id, firstName, lastName, ssn, street, city, zip));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studentList;

	}
}

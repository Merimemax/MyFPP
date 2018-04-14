package assignment13_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static String dbUrl = "jdbc:mysql://localhost:3306/AddressForm";
	private static String user = "root";
	private static String password = "yaried";

	public static Connection getConnection() {

		Connection myCon = null;
		try {
			myCon = DriverManager.getConnection(dbUrl, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myCon;
	}
}

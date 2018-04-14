package assignment2p1;

public class Assignment21 {

	public static void main(String[] args) {
		Customer bob = new Customer("Bob", "rich", "111-44-3344");
		Customer rob = new Customer("Rob", "samuel", "333-84-87");

		bob.setBillingAddress(BILL_B);
		bob.setShippingAddress(SHIP_B);

		rob.setBillingAddress(BILL_R);
		rob.setShippingAddress(SHIP_R);

		Customer[] cust = { bob, rob };

		for (int i = 0; i < cust.length; i++) {
			if (cust[i].getBillingAddress().getCity().equals("Chicago")) {
				System.out.println(cust[i].toString());
			}
		}

	}

	private static final Address BILL_B = new Address("52 L", "Chicago", "Iowa", 87623);
	private static final Address SHIP_B = new Address("52 L", "fairField", "Iowa", 87623);
	private static final Address BILL_R = new Address("52 L", "Washington", "Iowa", 87623);
	private static final Address SHIP_R = new Address("52 L", "New York", "Iowa", 87623);

}

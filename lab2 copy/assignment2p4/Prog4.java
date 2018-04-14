package assignment2p4;

public class Prog4 {

	public static void main(String[] args) {

		String data = Data.records;
		String[] item = data.split(":");

		for (String itemOne : item) {

			System.out.println(itemOne.split(",")[0]);

			// String[] itemOneParts = itemOne.split(",");
			// System.out.println(itemOneParts[0]);
		}
	}

}

package assignment2p7;

import assignment2p2.RandomNumbers;

public class Prog6 {
	static RandomNumbers random = new RandomNumbers();

	public static void main(String[] args) {
		int raw = 4;
		int col = 6;

		basedOnHint(raw, col);
		System.out.println("\n\n----------my first try with out seeing the hint-------------\n\n");
		myAlgorism(raw, col);

	}

	private static void basedOnHint(int rows, int cols) {
		int row = rows;
		int col = cols;
		for (int m = 0; m < row; m++) {
			String output = "";

			for (int i = 0; i < col; i++) {
				output = String.format(" %12d", getRand()); /// formating and printing raw one first
				System.out.print(output);
			}
			System.out.println();
			for (int i = 0; i < col; i++) {
				output = "";
				output = String.format(" %9s %2d", "+", getRand()); // formating and printing random num on raw 2 with +
																	// sign
				System.out.print(output);
			}
			System.out.println();
			for (int i = 0; i < col; i++) {
				output = "";
				output = String.format("%13s", "____"); // formating and printing line in the third raw
				System.out.print(output);
			}
			System.out.println("\n\n");
		}
	}

	private static int getRand() {
		return random.getRandomInt(1, 99);
	}

	private static void myAlgorism(int rows, int cols) {
		boolean line = false;
		int row = rows * 2;
		int col = cols;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				
				int x = random.getRandomInt(1, 99);
				int y = random.getRandomInt(1, 99);

				if (i % 2 == 0) {   // finding which raw to print first raw would just numbers
					System.out.printf("%12d", x);
				} else if (i % 2 != 0) {          // second raw would be numbers with + sign
					System.out.printf("%10s%2d", "+ ", y);
					line = true;    // after we add the second raw we set the line to be printed in the next raw
				}
			}
			if (line) {             // check if a number with + sign is printed then we print the line
				System.out.println();
				for (int k = 0; k < col; k++) {
					System.out.printf("%12s", "---");
				}
				System.out.println("\n\n\n\n");
				line = false;            // after we print the line we set the line to false and we make some extra new lines for the next entry
			} else
				System.out.println();
		}

	}

}

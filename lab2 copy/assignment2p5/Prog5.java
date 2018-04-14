package assignment2p5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String:");
		String reverse = scan.nextLine();
		scan.close();
		
		for (int i = reverse.length() - 1; i >= 0; i--) 
			System.out.print(reverse.charAt(i));
	}

}

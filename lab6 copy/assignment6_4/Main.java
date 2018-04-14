package assignment6_4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String[] testString = { "merih", "sam", "robert", "mi", "gebreyohannes" };
		Arrays.sort(testString, new StringLengthComparator());
		System.out.println(Arrays.toString(testString));
		
	}
}

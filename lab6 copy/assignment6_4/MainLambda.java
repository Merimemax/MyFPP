package assignment6_4;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		String[] testString = { "merih", "sam", "robert", "mi", "gebreyohannes" };
		System.out.println("MainLambda");

		Arrays.sort(testString, (s1, s2) -> {

			return s1.length() - s2.length();

		});
		
		System.out.println(Arrays.toString(testString));
	}

}

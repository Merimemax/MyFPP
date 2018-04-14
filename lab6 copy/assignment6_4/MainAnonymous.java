package assignment6_4;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		String[] testString = { "merih", "sam", "robert", "mi", "gebreyohannes" };
		
		Arrays.sort(testString, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		System.out.println(Arrays.toString(testString));
	}
}

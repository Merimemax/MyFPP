package assignment7_3;

import java.util.Arrays;

public class BinSearch {

	public static void main(String[] args) {
		String s = "i'm the best and it's true";
		char c = 'a';
		System.out.println(search(s,c));
	}

	public static boolean search(String s, char c) {
		char[] sc = s.toCharArray();
		Arrays.sort(sc);
		s = "";
		for (char k : sc) {
			if (Character.isAlphabetic(k)) {
				s += k;
			}
		}
		return searchMain(s, c);
	}

	private static boolean searchMain(String s, char c) {
		if (s == null || s.length() == 0 || c == '\u0000')
			return false;
		int m = s.length() / 2;
		if (s.charAt(m) == c)
			return true;
		else if (s.charAt(m) < c) {
			return search(s.substring(m + 1), c);
		} else if (s.charAt(m) > c) {
			return search(s.substring(0, m), c);
		}
		return false;
	}

}

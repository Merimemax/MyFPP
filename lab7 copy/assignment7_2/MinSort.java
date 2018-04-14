package assignment7_2;

public class MinSort {

	public static void main(String[] args) {

		MinSort ms = new MinSort();
		String resultOne = ms.sortOne("zwxuabfkafutbbbb");
		System.out.println(resultOne);
		
		String resultTwo = ms.sortTwo("zwxuabfkafutbbbb");
		System.out.println(resultTwo);

	}

	private String sortOne(String s) {
		if (s.length() == 0 || s == null)
			return s;

		char min = rmin(s);
		int index = s.indexOf(min);
		String miniString = s.substring(0, index) + s.substring(index + 1);
		return min + sortOne(miniString);

	}
	public Character rmin(String str) {
		if (str == null || str.length() == 0) {
			return null;
		}
		char ch = str.charAt(0);
		if (str.length() == 1)
			return ch;
		char c = rmin(str.substring(1));
		return (ch < c ? ch : c);
	}

	private String sortTwo(String s) {
		if (s.length() == 0 || s == null)
			return s;

		int min = minpos(s);
		String miniString = s.substring(0, min) + s.substring(min + 1);
		return s.charAt(min) + "" + sortTwo(miniString);
	}

	private int minpos(String s) {
		if (s.length() == 0 || s == null)
			return 0;
		char min = s.charAt(0);
		int index = 0;
		for (int i = 1; i < s.length(); i++) {
			if (min > s.charAt(i)) {
				min = s.charAt(i);
				index = i;
			}
		}
		return index;
	}

}

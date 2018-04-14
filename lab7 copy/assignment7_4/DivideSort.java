package assignment7_4;

public class DivideSort {
	static StringBuilder ret = new StringBuilder();

	public static void main(String[] args) {
		String s = "djshckjkkacb";
		System.out.println(divideSort(s));

	}

	static String divideSort(String s) {
		String sleft = "";
		String sright = "";
		if (s.length() == 0 || s.length() == 1)
			return s;

		int mid = s.length() / 2;
		sleft = divideSort(s.substring(0, mid));
		sright = divideSort(s.substring(mid, s.length()));
		ret = new StringBuilder();
		return merge(sleft, sright);

	}

	public static String merge(String s, String t) {

		// System.out.println(s + "-" + t+ "\n" );
		if (s == null || s.isEmpty()) {
			ret.append(t);
			return ret.toString();
		}
		if (t == null || t.isEmpty()) {
			ret.append(s);
			return ret.toString();
		}
		if (s.charAt(0) <= t.charAt(0)) {
			ret.append(s.charAt(0));
			return merge(s.substring(1), t);
		} else {
			ret.append(t.charAt(0));
			return merge(s, t.substring(1));
		}

	}

}

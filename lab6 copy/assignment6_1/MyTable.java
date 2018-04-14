package assignment6_1;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public String get(char k) {
		int pos = ((int) k) - 97;
		return entries[pos].value;
	}

	public void add(char k, String v) {
		int pos = ((int) k) - 97;
		entries[pos] = new Entry(v, k);
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < entries.length; i++) {
			if (entries[i] != null) {
				result += entries[i].getKey() + " -> " + entries[i].getValue() + "\n";
			}

		}

		return result;
	}

	private class Entry {

		private char key;
		private String value;

		Entry(String str, char ch) {
			key = ch;
			value = str;
		}

		public char getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		//
		// @Override
		// public String toString() {
		// return key + " -> " + value ;
		// }

	}
}

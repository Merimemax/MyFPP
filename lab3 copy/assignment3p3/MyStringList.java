package assignment3p3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size >= strArray.length) {
			resize();
		}
		strArray[size++] = s;
	}

	public String get(int i) {
		if (i >= size || i < 0)
			System.out.println("index out of bound");
		return strArray[i];
	}

	public boolean find(String s) {
		for (int i = 0; i < size; i++) {
			if (strArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			System.out.println("Invalid position");
		else if (pos == size)
			add(s);
		else if (strArray.length == size) {
			resize();
			insertAt(s, pos);
		} else {
			insertAt(s, pos);
		}
	}

	public void insertAt(String s, int pos) {
		for (int k = pos; k < size; k++) {
			String temp = strArray[k];
			strArray[k] = s;
			s = temp;
		}
		size++;
	}

	public boolean remove(String s) {
		if (!find(s))
			return false;
		for (int i = 0; i < size; i++) {
			if (s.equals(strArray[i])) {
				for (int k = i+1; k < size; k++) {
					String temp = strArray[k];
					strArray[k-1] = temp;
				}
				i = size;
				size--;
			}
		}
		return false;
	}

	private void resize() {
		// implement
		String[] newString = new String[size*2];
		for(int i=0; i<size; i++) {
			newString[i]=strArray[i];
		}
		strArray= newString;
	}

	public String toString() {
		String value = "";
		for(int i=0; i<size; i++) {
			value += strArray[i] + " ";
		}
		return value;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size " + l.size() + "  is :" + l);
		l.remove("Mark");
		System.out.println("\nafter mark is removed: " + l.toString() + " size " + l.size());
		l.remove("Bob");
		System.out.println("\nafter Bob is removed: " + l.toString() + " size " + l.size());
		
		System.out.println("\nThe list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("\nafter Richard inserted at position 3 : " + l.toString() + " size " + l.size());
		System.out.println("\nThe list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("\nafter Tonya inserted at position 0 : " + l.toString() + " size " + l.size());
		System.out.println("\nThe list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}
}

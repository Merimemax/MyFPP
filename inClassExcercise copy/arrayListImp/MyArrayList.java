package arrayListImp;

import binarySearchTreeImp.BSTimp;

public class MyArrayList<E> {
	private static int size = 0;
	private static int enternalArraySize = 5;
	Object[] enternalArray;

	public MyArrayList() {
		enternalArray = new Object[enternalArraySize];

	}

	void add(E o) {
		if (size == enternalArraySize)
			enternalArrayResize();

		enternalArray[size++] = o;
	}

	private void enternalArrayResize() {
		enternalArraySize *= 2;
		Object[] temp = new Object[enternalArraySize];
		System.arraycopy(enternalArray, 0, temp, 0, size);
		enternalArray = temp;
	}

	void remove(E o) {
		int index = find(o);
		for (int i = index; i < size - 1; i++) {
			enternalArray[i] = enternalArray[i + 1];
		}
		--size;
	}

	private int find(E o) {
		for (int i = 0; i < size; i++) {
			if (enternalArray[i].equals(o)) {
				return i;
			}
		}
		throw new IndexOutOfBoundsException(o + " doesn't exist");
	}

	@SuppressWarnings("unchecked")
	void sort() {
		BSTimp<E> myBst = new BSTimp<>();
		for (int i = 0; i < size; i++) {
			myBst.add((E) enternalArray[i]);
		}
		myBst.printInorder();

	}

	void minisort() {
		if (size == 0)
			return;
		if (size == 1) {
			System.out.println(enternalArray[0]);
			return;
		}
		mini(enternalArray, 0, size);
	}

	private void mini(Object[] enternalArray2, int i, int size2) {
		if (i >= size2)
			return;
		int miniIndex = findMiniIndex(enternalArray2, i, size2);
		swap(miniIndex, i);
		mini(enternalArray2, (i + 1), size2);
	}

	private void swap(int miniIndex, int i) {
		Object temp = enternalArray[i];
		enternalArray[i] = enternalArray[miniIndex];
		enternalArray[miniIndex] = temp;
	}

	private int findMiniIndex(Object[] enternalArray2, int k, int size2) {
		// i'm working only for string sort for now
		String obj = (String) enternalArray2[k];
		int min = k;
		for (int i = k; i < size2; i++) {
			min = obj.compareTo((String) enternalArray2[i]) >= 0 ? i : min;
		}

		return min;
	}

	void printArray() {
		for (int i = 0; i < size; i++) {
			System.out.print(enternalArray[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		MyArrayList<String> arrList = new MyArrayList<>();

		for (int i = 0; i < 5; i++) {
			String entry = (char) (97 + Math.random() * 26) + "";
			arrList.add(entry + entry + entry);

		}
		arrList.printArray();
		// arrList.remove("ooo");
		arrList.printArray();
		System.out.println("----- after sort---------");
		// arrList.sort();
		arrList.minisort();
		arrList.printArray();
	}

}

package assignment2p6;

import java.util.Arrays;

public class Prog6 {

	public static void main(String[] args) {
		String[] animals = { "horse", "dog", "cat", "horse", "horse", "dog", "horse", "horse", "dog" };
		String[] newArray = removeDups(animals);

		System.out.println(Arrays.toString(newArray));
	}

	public static String[] removeDups(String[] strArray) {
		int dublicate = numOfDublicate(strArray);
		int len = strArray.length - dublicate;
		String[] newArray = new String[len]; // we create a new array to store new array with out duplicate
		int index = 0;
		for (int i = 0; i < strArray.length; i++) {
			boolean found = true;	         // check if any duplicate in the strArray
			for (int j = 0; i != j && j < newArray.length; j++) {
				if (strArray[i].equals(newArray[j])) { // if an element from strArray exist in the new array we create
					found = false;					  // we set found to false we we are not going to add that value to our new array
				}
			}
			if (found && index < len) {  // check if duplicate is found if not we add the element from strArray to our new array
				newArray[index++] = strArray[i];
			}
		}
		return newArray;
	}

	private static int numOfDublicate(String[] strArray) { // we need to determine the number of duplicates first
		int dublicate = 0;
		boolean[] dubi = new boolean[strArray.length]; // we create a new boolean array to track duplicates 
		
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; i != j && j < strArray.length; j++) {
				
				if (!dubi[j] && strArray[i].equals(strArray[j])) {  // check if is already is not marked duplicate and is there any elements equals to our array
					dubi[j] = true;
					dublicate++;
				}
			}
		}
		return dublicate;

	}
}

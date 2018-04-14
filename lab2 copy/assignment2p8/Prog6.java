package assignment2p8;

public class Prog6 {

	public static void main(String[] args) {
		int[] arr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println(min(arr));
	}

	static int min(int[] arrayOfInts) {
		
		if(arrayOfInts.length==0) return 0; // we check if the array is empty
		
		int min = arrayOfInts[0];    // if array in not empty we initialize the first element as min number;
		
		for(int x: arrayOfInts) {
			
			min = min > x ? x : min;    // we compare all elements with ternary operate and set the minimum 
		}
		return min;
	}

}

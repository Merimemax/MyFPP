package assignment11_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {
	boolean checkForSum(List<Integer> list, Integer z) {

		HashMap<Integer, Integer> lm = new HashMap<Integer, Integer>();
		if (list != null)
			lm.put(list.get(0), list.get(0));
		else
			return false;
		for (int i = 1; i < list.size(); i++) {
			if (lm.containsKey(z - list.get(i))) {
				return true;
			}

			lm.put(list.get(i), list.get(i));

		}

		return false;
	}

	public static void main(String[] args) {
		Schur s = new Schur();

		boolean b = s.checkForSum(Arrays.asList(2, 4, 3, 4, 8), 12);
		System.out.println("is Present: " + b);

	}
}

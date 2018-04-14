package assignment10_3_sortroutines;

import assignment10_3_runtime.Sorter;

public class BSTSort extends Sorter {
	
	@Override
	public int[] sort(int[] arr) {
		MyBST m=new MyBST();
		m.insertAll(arr);
		return m.readIntoArray();
	}
}

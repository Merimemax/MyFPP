package assignment4_3;


import java.util.StringJoiner;

public class MyStringList {
   private final int INTIAL_SIZE=2;
	private String[] strArray;

	private int size;

	public MyStringList() {
		size = 0;
		strArray = new String[INTIAL_SIZE];
	}

	public void add(String s) {
		int temp=0;
		if(strArray.length==0)
		{
			strArray[0]=s;
			
		}
		else {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i]==null) {
			strArray[i] = s;
			++size;
			++temp;
			break;
			}
			}
		  if(temp==0) {
			resize();
			add(s);
		  }
		}
	}

	public String get(int i) {
		if (i < strArray.length)
			return strArray[i];
		else
			return null;

	}

	public boolean find(String s) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s))
				return true;
		}
		return false;

	}

	public boolean remove(String s) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				for (int j = i; j < strArray.length - 1; j++) {
					strArray[j] = strArray[j + 1];
				}
				strArray[strArray.length - 1] = null;
				--size;
				return true;
			}
		}
		return false;

	}

	public String toString() {
		int i=0;
		StringJoiner sj = new StringJoiner(",", "[", "]");
		while(i<strArray.length && strArray[i]!=null)
		{
			sj.add(strArray[i]);
					
			i++;
		}
		return sj.toString();
	}

	public int size() {
		return size;
	}

	private void resize() {
		//System.out.println("Resizing...");
		String[] strArrCopy = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, strArrCopy, 0, strArray.length);
		strArray = strArrCopy;

	}

}

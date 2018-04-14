package assignment2p2;

public class Prog2 {
	/**
	 * 
	 * 1. get a random number x in the range 1 .. 9 and compute π^x.
	 * 
	 * 2. get a random number y in the range 3 .. 14 and compute y^π.
	 * 
	 */
	public static void main(String[] args) {
		RandomNumbers random = new RandomNumbers();
		
		int x = random.getRandomInt(1, 9);
		int y = random.getRandomInt(3, 14);
		
		double xx = Math.pow(Math.PI, x);
		double yy = Math.pow(y, Math.PI);
		
		System.out.println("a random number x in the range 1 .. 9 and compute π^x = " + xx);
		System.out.println("a random number y in the range 3 .. 14 and compute y^π = " + yy);
	}

}

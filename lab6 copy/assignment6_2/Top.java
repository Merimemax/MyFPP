package assignment6_2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;

	// returns the value in the instance variables of Bottom
	int readBottom() {
		mid = new Middle();
	    midbot = mid.new Bottom();
		return midbot.b;
	}

	class Middle {
		int m = 2;
		// returns sum of instance variables in Top and
		// instance variables in Bottom
		int addTopAndBottom() {
			
			return t + midbot.b;
		}

		class Bottom {
			int b = 3;

			// returns the product of the instance variables
			// in all three classes
			int multiplyAllThree() {
				// implement
				return  b * m * t;
			}
		}
	}

	public static void main(String[] args) {
		Top top = new Top();

		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());

	}
}

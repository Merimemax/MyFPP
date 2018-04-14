package assignment2p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prog2_8Test {
	
	int min = Prog6.min(new int[] { 2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22 });
	// we compare if the prog6 out put with the number we expect
	@Test
	void test() {
		assertEquals(-22, min);
	}

}

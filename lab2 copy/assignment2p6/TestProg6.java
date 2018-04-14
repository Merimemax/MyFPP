package assignment2p6;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestProg6 {
	String[] input = { "horse", "horse", "dog" };
	String[] outPut = { "horse", "dog" };

	@Test
	void testRemoveDups() {
		String[] result = Prog6.removeDups(input);

		assertEquals(Arrays.toString(outPut), Arrays.toString(result));
	}
}

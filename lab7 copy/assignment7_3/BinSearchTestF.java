package assignment7_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BinSearchTestF {
	String s = "i'm the best & it's true";
	char c = 'a';

	// since char c which is a is not in the string s, this test will fail
	@Test
	void binarySearchTestF() {
		assertEquals(true, BinSearch.search(s, c));
	}

}

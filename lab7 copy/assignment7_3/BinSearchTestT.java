package assignment7_3;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class BinSearchTestT {
	String s = "i'm the best nd it's truea";
	char c = 'a';

	@Test
	void binarySearchTestT() {
		assertTrue( BinSearch.search(s, c));
	}

}

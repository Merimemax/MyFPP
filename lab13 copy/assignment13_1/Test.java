package assignment13_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import junit.framework.TestCase;

public class Test extends TestCase {
	static File insert;
	private String expectedText = "This is the file you are seeking!";
	private String setupDirectory = "/Users/merih/FPP/FPP_Lecture/storeInputOutput/test";
	private String targetFile = "seek.txt";

	@Override
	public void setUp() {
		File f = new File("/Users/merih/FPP/FPP_Lecture/storeInputOutput/test/level2/finalLevel");
		System.out.println(f.mkdirs());
		f = new File("/Users/merih/FPP/FPP_Lecture/storeInputOutput/test/level2a/thirdLevel");
		System.out.println(f.mkdirs());
		f = new File("/Users/merih/FPP/FPP_Lecture/storeInputOutput/test/level2b/thirdLevelb");
		System.out.println(f.mkdirs());
		f = new File("/Users/merih/FPP/FPP_Lecture/storeInputOutput/test/level2b/thirdLevelc/fourthLevel");
		System.out.println(f.mkdirs());
		insert = new File(f.getAbsolutePath() + "/seek.txt");
		System.out.println("writing to " + insert.getAbsolutePath());
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(insert)));
			pw.write(expectedText);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void testSearchForFile() throws IOException {
		boolean result = FileSearch.searchForFile(targetFile, setupDirectory);
		assertTrue(result);
		assertTrue(expectedText.equals(FileSearch.discoveredText.trim()));

	}
}

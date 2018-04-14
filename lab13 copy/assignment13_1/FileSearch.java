package assignment13_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * //PSEUDO-CODE boolean searchForFile(Object file, Object startDir) { Object[]
 * fileSystemObjects = startDir.getContents(); for(Object o: fileSystemObjects)
 * { //base case if(isFile(o) && isSameFile(o,f)) { return true; }
 * 
 * if(isDirectory(o)) { searchForFile(file, o); } } //file not found in startDir
 * return false; }
 */
public class FileSearch {

	static boolean found = false;
	// Store the text that is found in the
	// file that is found in this String variable
	static String discoveredText = null;

	public static boolean searchForFile(String filename, String startDir) {
		File dir = new File(startDir);
		File targetFile = new File(filename);
		File[] dirs = dir.listFiles();

		for (File f : dirs) {
			if (f.isFile() && f.getName().equals(targetFile.getName())) {

				BufferedReader br;
				try {
					br = new BufferedReader(new FileReader(f));
					String str = "";
					while ((str = br.readLine()) != null) {
						discoveredText = str;
						found = true;
					}
					br.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				return found;
			} else if (f.isDirectory()) {
				searchForFile(filename, f.toString());
			}
		}
		return found;
	}
}

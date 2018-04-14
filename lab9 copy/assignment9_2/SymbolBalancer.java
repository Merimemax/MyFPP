package assignment9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;
	char[] left;
	char[] right;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public void setText(String text) {
		this.text = text;
	}

	boolean symbolsBalanced(String delimiters) {
		Stack<String> stack = new Stack<>();

		String[] k = text.split("");
		for (String s : k) {
			if (delimiters.contains(s)) {
				if (s.equals("[") || s.equals("{") || s.equals("<") || s.equals("(")) {
					System.out.println("add " + stack.push(s));
				} else if (s.equals("]") || s.equals("}") || s.equals(">") || s.equals(")")) {
					String peek = "";
					if (stack.empty()) {
						return false;
					} else {
						peek = stack.peek();
					}
					if (peek.equals("[") && s.equals("]")) {
						System.out.println(s + " found so remove " + stack.pop());
					} else if (peek.equals("{") && s.equals("}")) {
						System.out.println(s + " found so remove " + stack.pop());
					} else if (peek.equals("<") && s.equals(">")) {
						System.out.println(s + " found so remove " + stack.pop());
					} else if (peek.equals("(") && s.equals(")")) {
						System.out.println(s + " found so remove " + stack.pop());
					}
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("lab9/assignment9_2/Employee.java");
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
	}

	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text += sc.next();
			sc.close();
		} catch (FileNotFoundException ex) {
			System.err.println("File Not Found Exception " + ex.getMessage());
		}
	}

}

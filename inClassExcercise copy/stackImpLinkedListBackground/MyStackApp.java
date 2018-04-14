package stackImpLinkedListBackground;

public class MyStackApp {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<>();
		System.out.println("0 is expected and result is => " + stack.size());
		System.out.println("true is expected and result is => " + stack.isEmpty());
		try {
		System.out.println("Exception is expected " + stack.pop());
		}catch(IllegalStateException ex) {
			System.out.println(ex.getMessage());
			System.out.println("ok sorry, i will never do that again");
		}
		stack.push("merih");
		stack.push("sam");
		stack.push("bob");
		stack.push("rob");
		stack.push("bee");
		stack.push("boo");
		
		System.out.println("6 is expected and result is => " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("3 is expected and result is => " + stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("0 is expected and result is => " + stack.size());
	}

}

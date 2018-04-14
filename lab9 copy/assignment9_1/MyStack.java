package assignment9_1;

public class MyStack {
	private MyStringLinkedList list;

	public MyStack() {
		list = new MyStringLinkedList();
	}

	public String pop() {
		String p = list.get(0);
		list.remove(0);
		return p;
	}

	public String peek() {
		return list.get(0);
	}

	public void push(String s) {
		list.add(s);
	}

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("bottom");
		stack.push("middle");
		stack.push("top");
		stack.push("3");
		stack.push("2");
		stack.push("1");

		System.out.println("peek is " + stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}

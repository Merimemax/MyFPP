package stackImpLinkedListBackground;

public class MyStack<E> {
	private Node header;
	private int size;

	public MyStack() {
		header = new Node(null, null);
		size = 0;
	}

	public void push(E val) {
		size++;
		if (header.next == null) {
			Node newNode = new Node(null, val);
			header.next = newNode;
			return;
		}
		Node newNode = new Node(header.next, val);
		header.next = newNode;
	}

	public E pop() {
		if (header.next == null)
			throw new IllegalStateException("Stack is empty");
		E val = header.next.value;
		size--;
		if (header.next.next == null) {
			header.next = null;

		} else {
			header.next = header.next.next;
		}

		return val;
	}

	public int size() {
		return size;
	}

	private class Node {
		Node next;
		E value;

		public Node(Node next, E value) {
			this.next = next;
			this.value = value;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}
}

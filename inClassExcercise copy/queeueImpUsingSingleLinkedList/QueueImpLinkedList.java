package queeueImpUsingSingleLinkedList;

public class QueueImpLinkedList<E> {
	private Node header;
	private int size;

	public QueueImpLinkedList() {
		header = new Node(null, null);
		size = 0;
	}

	public void enqueue(E value) {
		if (value == null)
			throw new IllegalArgumentException("queue don't accept null");
		Node newNode = new Node(null, value);

		if (header.next == null) {
			header.next = newNode;
			size++;
			return;
		}
		Node temp = header.next;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		size++;
	}

	public E dequeue() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
		E val = header.next.value;
		Node nTemp = header.next.next;
		if (nTemp == null) {
			header.next = null;
			size--;
			return val;
		}
		header.next = nTemp;
		return val;
	}

	public E peek() {
		if (isEmpty())
			throw new IllegalStateException("Queue is empty");
		return header.next.value;
	}

	public void print() {
		if (header.next == null)
			System.out.println("queue is empty");
		print(header.next);
	}

	void print(Node n) {
		if (n == null)
			return;
		
		print(n.next);
		System.out.print(n.value + " ");
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return header.next == null;
	}

	private class Node {
		Node next;
		E value;

		public Node(Node next, E value) {
			this.next = next;
			this.value = value;
		}
	}
}

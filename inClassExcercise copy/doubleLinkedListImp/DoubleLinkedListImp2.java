package doubleLinkedListImp;

public class DoubleLinkedListImp2<E> {
	private Node header = null;
	private int size;

	public DoubleLinkedListImp2() {
		size = 0;
	}

	public void addFirst(E val) {
		if (val == null)
			throw new IllegalArgumentException("dobuley linked list don't accept null value");
		Node newNode = new Node(null, val, null);
		if (header == null) {
			header = newNode;
			size++;
			return;
		}

		newNode.next = header;
		header.previous = newNode;
		header = newNode;
		size++;

	}

	public void addLast(E val) {
		if (val == null)
			throw new IllegalArgumentException("dobuley linked list don't accept null value");
		if (header == null) {
			header = new Node(null, val, null);
			size++;
			return;
		}
		Node tempLast = header;
		while (tempLast.next != null) {
			tempLast = tempLast.next;
		}
		Node newNode = new Node(tempLast, val, null);
		tempLast.next = newNode;
		size++;

	}

	public E delete(int pos) {
		if (pos < 0 || pos > size || header == null)
			throw new IllegalArgumentException("invalid position for deletion");

		Node temp = header;
		for (int i = 0; i < pos; i++) {
			temp = temp.next;
		}
		E val = temp.value;

		Node preTemp = temp.previous;
		Node postTemp = temp.next;

		if (preTemp != null && postTemp != null) {
			preTemp.next = postTemp;
			postTemp.previous = preTemp;
		} else if (preTemp != null && postTemp == null) {
			preTemp.next = null;
		} else if (preTemp == null && postTemp != null) {
			postTemp.previous = null;
			header = postTemp;
		} else if (preTemp == null && postTemp == null) {
			header = null;
		}

		size--;
		return val;
	}

	public void insert(E val, int pos) {
		if (pos < 0 || pos > size || val == null)
			throw new IllegalArgumentException("invalid position for insertion");
		if (pos == 0) {
			addFirst(val);
			return;
		}
		if(pos == size) {
			addLast(val);
			return;
		}
		Node tempNext = header;
		for (int i = 0; i < pos; i++) {
			tempNext = tempNext.next;
		}
		Node preTemp = tempNext.previous;
		Node newNode = new Node(preTemp, val, tempNext);
		preTemp.next = newNode;
		tempNext.previous = newNode;
		size++;
	}

	public E getValue(int pos) {
		if (pos < 0 || pos > size || header == null)
			throw new IllegalArgumentException("invalid position");
		Node temp = header;
		for (int i = 0; i < pos; i++) {
			temp = temp.next;
		}
		return temp.value;
	}

	public void print() {
		Node temp = header;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public boolean isEmpty() {
		return header == null;
	}

	public int size() {
		return size;
	}

	class Node {
		Node previous;
		Node next;
		E value;

		Node(Node previous, E value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

	}

}

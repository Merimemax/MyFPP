package doubleLinkedListImp;

public class DoubleLinkedListImp<E> {
	Node header;

	DoubleLinkedListImp() {
		header = null;
	}

	boolean delete(E o) {
		Node temp = header;
		while (temp != null) {
			if (temp.obj.equals(o)) {
				Node pre = temp.previous;
				Node nxt = temp.next;

				if (pre != null && nxt != null) {
					pre.next = nxt;
					nxt.previous = pre;
				} else if (pre == null) {
					header = nxt;
				} else if (nxt == null) {
					pre.next = null;
				}
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	void insert(E o, int pos) {
		Node newNode = new Node(null, o, null);
		if (header == null) {
			header = newNode;
			return;
		}
		Node temp = header;
		int i = 0;
		for (i = 0; i < pos && temp != null; i++) {
			temp = temp.next;
		}
		if (i < pos) {
			throw new IllegalStateException("invalied postion " + pos);
		} else {
			if (temp.previous == null) {
				newNode.next = temp;
				temp.previous = newNode;
				header = newNode;
				return;

			} else {
				Node tpre = temp.previous;
				tpre.next = newNode;
				newNode.previous = tpre;
				if (temp != null)
					newNode.next = temp;
			}
		}
	}

	void addFirst(E o) {
		if (header == null) {
			header = new Node(null, o, null);
		} else {
			Node newNode = new Node(null, o, header);
			header.previous = newNode;
			header = newNode;
		}
	}

	void addLast(E o) {
		if (header == null) {
			addFirst(o);
			return;
		}
		Node temp = header;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = new Node(temp, o, null);
		temp.next = newNode;

	}
	void printReverse() {
		printReverse(header);
	}
	private void printReverse(Node starter) {
		if (starter == null)
			return;
		printReverse(starter.next);
		System.out.print(starter.obj + " ");
	}

	void printList() {
		Node temp = header;
		while (temp != null) {
			System.out.print(temp.obj + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoubleLinkedListImp<String> dlk = new DoubleLinkedListImp<>();

		dlk.addFirst("3");
		dlk.addFirst("2");
		dlk.addFirst("1");

		dlk.printList();
		dlk.delete("1");
		dlk.printList();

		dlk.addLast("one");
		dlk.addLast("two");
		dlk.addLast("three");

		dlk.printList();

		dlk.insert("0", 0);
		dlk.insert("4", 4);

		dlk.printList();
		dlk.printReverse();

	}

}

package linkedListImp;

public class Main {
	Node startNode = null;
	String[] stringData = { "Albert", "Billy", "Charles", "David", "Emma" };
	int size = 0;

	public static void main(String[] args) {
		Main m = new Main();
		for (int i = 0; i < m.stringData.length; ++i) {
			m.addLast(m.stringData[i]);
		}
		m.printNodes();
		System.out.println("Is Charles in the list? " + m.search("Charles"));
		System.out.println("Is Bubba in the list? " + m.search("Bubba"));
		m.remove("Charles");
		m.printNodes();

		System.out.println("find node " + m.findNode(1));
		// boolean foundCharles = m.search("Charles");
		// System.out.println("Found Charles? " + foundCharles);
		//
		// m.printNodes();
		// m.addFirst("Frank");
		// m.removeNode("David");
		// m.printNodes();
		// m.addLast("Ricardo");
		// m.printNodes();

		// Node n = m.find(2);
		// if(n == null) System.out.println("null");
		// else System.out.println(n.data);
		// m.remove(2);

	}

	void addFirst(String s) {
		Node newNode = new Node();
		newNode.data = s;
		if (startNode == null) {
			startNode = newNode;
		} else {
			newNode.node = startNode;
		}
		startNode = newNode;
		size++;
	}

	void addLast(String s) {
		Node newNode = new Node();
		newNode.data = s;
		if (startNode == null) {
			startNode = newNode;
		} else {
			Node next = startNode;
			while (next.node != null) {
				next = next.node;
			} // now next.node == null
			next.node = newNode;
		}
		size++;

	}

	boolean search(String s) {

		if (startNode == null) {
			return false;
		} else {
			Node next = startNode;

			while (true) {
				if (next.data.equals(s))
					return true;
				next = next.node;
				if (next == null)
					return false;
			}

		}
	}

	Node findNode(String s) {
		if (startNode == null) {
			return null;
		} else {
			Node next = startNode;

			while (true) {
				if (next.data.equals(s))
					return next;
				next = next.node;
				if (next == null)
					return null;
			}

		}
	}

	// Node findNodeByPos(int pos) {
	// if(pos == 0) return startNode;
	// if(startNode == null) {
	// return null;
	// } else {
	// Node next = startNode;
	//
	// while(true) {
	// if(next.data.equals(s)) return next;
	// next = next.node;
	// if(next == null) return null;
	// }
	//
	// }
	// }
	void printNodes() {
		System.out.println(startNode.toString());
	}

	void remove(String s) {
		if (startNode == null)
			return;
		else if (startNode != null && startNode.data.equals(s)) {
			startNode = startNode.node;
		} else {
			Node next = startNode.node;
			Node previous = startNode;

			while (next != null) {
				if (s.equals(next.data)) {
					previous.node = next.node;
					size--;
					return;
				}
				previous = next;
				next = next.node;

			}
		}
	}

	Node findNode(int n) {
		if (n < 0 || n >= size)
			return null;
		Node wanted = startNode;
		for (int i = 0; i < n; i++) {
			if (wanted.node != null)
				wanted = wanted.node;
			else 
			return null;
		}
		return wanted;
	}

	String remove(int n) {
		return null;
	}

}

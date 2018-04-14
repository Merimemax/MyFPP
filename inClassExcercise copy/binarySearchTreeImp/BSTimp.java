package binarySearchTreeImp;

public class BSTimp<E> {
	Node root;

	public BSTimp() {
		root = null;
	}

	public void delete(E s) {
		if (s == null)
			return;
		if (root == null) {
			System.out.println("binary search tree is empty");
		} else if (s.equals(root.value)) {
			root = null;
		} else {
			removeHm1(root, s);
		}
	}

	public void removeHm1(Node b, E s) {
		if (b.value.equals(s)) {
			removeHm2(b, s);
			return;
		} else if (b.left != null &&  ((String) s).compareTo((String) b.value) < 0) {
			removeHm1(b.left, s);
		} else if (b.right != null && ((String) s).compareTo((String) b.value) > 0) {
			removeHm1(b.right, s);
		} else {
			throw new IllegalArgumentException(s + " value doesn't exit in this BST");
		}
	}

	public void removeHm2(Node b, E s) {
//		Node parent = parent(b, s);
	}

	Node parent(Node p, E s) {
		if (p.value.equals(s)) {

		}
		return p;
	}

	public void add(E s) {
		if (s == null)
			return;
		Node newNode = new Node(null, s, null);
		if (root == null) {
			root = newNode;
		} else {
			add(root, s);
		}
	}

	void add(Node r, E s) {

		if (((String) s).compareTo((String) r.value) < 0) {
			if (r.left == null) {
				r.left = new Node(null, s, null);
				return;
			}
			add(r.left, s);
		}
		if (((String) s).compareTo((String) r.value) > 0) {
			if (r.right == null) {
				r.right = new Node(null, s, null);
				return;
			}
			add(r.right, s);
		}
	}

	public void printInorder() {
		printInorder(root);
	}

	private void printInorder(Node r) {
		if (r.left != null)
			printInorder(r.left);
		System.out.print(r.value + " ");
		if (r.right != null)
			printInorder(r.right);

	}

	public static void main(String[] args) {
		BSTimp<String> myBST = new BSTimp<>();
		myBST.add("zibra");
		myBST.add("apple");
		myBST.add("mango");
		myBST.add("banana");
		myBST.add("alfa");
		myBST.add("bita");
		myBST.add("apple"); // it ignores duplicate values
		myBST.printInorder();
	}

	private class Node {
		Node left;
		Node right;
		E value;

		public Node(Node left, E value, Node right) {
			this.left = left;
			this.right = right;
			this.value = value;
		}

	}

}

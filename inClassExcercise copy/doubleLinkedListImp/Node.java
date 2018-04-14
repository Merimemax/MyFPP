package doubleLinkedListImp;

public class Node {
	 Node previous;
	 Node next;
	 Object obj;
	
	Node(Node previous, Object obj, Node next){
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [previous=" + previous + ", next=" + next + ", obj=" + obj + "]";
	}
}

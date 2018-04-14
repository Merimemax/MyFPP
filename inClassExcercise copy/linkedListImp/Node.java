package linkedListImp;

public class Node {
	String data;
	Node node;
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder(data + " ");
		return toString(sb, node);
	}
	
	private String toString(StringBuilder sb, Node n) {
		if(n == null) return sb.toString();
		sb.append(n.data + " ");
		return toString(sb, n.node);
	}
}

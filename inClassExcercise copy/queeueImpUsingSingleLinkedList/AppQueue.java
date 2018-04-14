package queeueImpUsingSingleLinkedList;

public class AppQueue {

	public static void main(String[] args) {
		QueueImpLinkedList<String> myQueue = new QueueImpLinkedList<>();

		// System.out.println(" true expected : " + myQueue.isEmpty());
		// System.out.println(" 0 expected : " + myQueue.size());
		// System.out.println(" error expected : " + myQueue.peek());
		// System.out.println(" error expected : " + myQueue.dequeue());

		myQueue.enqueue("Mera");
		myQueue.enqueue("Merih");
		myQueue.enqueue("sam");
		myQueue.enqueue("bob");
		myQueue.print();

		System.out.println("\n----------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(myQueue.dequeue());
			System.out.println();
			myQueue.print();
		}
	}

}

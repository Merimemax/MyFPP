package queeueImpUsingArray;

public class QueueApp {

	public static void main(String[] args) {
		MyQueue<String> myQueue = new MyQueue<>();

		// System.out.println(" true expected : " + myQueue.isEmpty());
		// System.out.println(" 0 expected : " + myQueue.size());
		// System.out.println(" error expected : " + myQueue.peek());
		// System.out.println(" error expected : " + myQueue.dequeue());

		myQueue.enqueue("Mera");
		myQueue.enqueue("Merih");
		myQueue.enqueue("sam");
		myQueue.enqueue("bob");
		myQueue.print();

		System.out.println("----------------");

		System.out.println(myQueue.dequeue());
		System.out.println("----------------");
		myQueue.print();
		
		System.out.println("size = " + myQueue.size());
		System.out.println("-------test throws---------");
		for(int i=0; i<10; i++) {
			myQueue.enqueue("adding " + i);
		}

	}

}

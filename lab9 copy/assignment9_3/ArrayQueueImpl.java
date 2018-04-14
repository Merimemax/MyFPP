package assignment9_3;

public class ArrayQueueImpl {
	private int[] arr = new int[5];
	private int size = 0;
	private int front = 0;
	private int rear = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	int size() {
		return size;
	}

	boolean enqueue(int value) {
		if (rear == arr.length) {
			reSize();
		}
		size++;
		arr[rear++] = value;
		return true;
	}

	private void reSize() {
		int len = (int) (arr.length * (arr.length * 0.75));
		int[] newArray = new int[len];
		System.arraycopy(arr, front, newArray, 0, size);
		front = 0;
		rear = size;
		size = rear - front;
		arr = newArray;
	}

	int dequeue() {
		if (isEmpty() == true) {
			System.out.println("stack is empty");
			return -1;
		}
		--size;
		return arr[front++];
	}

	int peek() {

		return arr[front];
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();

		System.out.printf("is empty :%s\nLoading ...\n", q.isEmpty());
		for (int i = 1; i < 20; i++) {
			System.out.println(
					q.enqueue(i) + " " + i + " is added so -> size : " + q.size() + " and peek is: " + q.peek());
		}
		System.out.println("\nis empty :" + q.isEmpty());
		for (int i = 0; i < 20; i++) {
			System.out.println(q.dequeue() + " is removed so : ->size : " + q.size() + " and peek is : " + q.peek());
		}
		System.out.println("\n-------additional check after all data is removed----------");
		System.out.println("\nis empty :" + q.isEmpty());
		System.out.println("size : " + q.size());
		System.out.println("peek : " + q.peek());
	}
}

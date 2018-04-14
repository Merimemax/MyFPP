package queeueImpUsingArray;

public class MyQueue<E> {
	private E[] arr;
	private int inLth = 5;
	private int front = -1;
	private int end = -1;
	private int size;

	@SuppressWarnings("unchecked")
	public MyQueue() {
		arr = (E[]) new Object[inLth];
		size = 0;
	}

	public void enqueue(E value) {
		if (value == null) {
			throw new IllegalArgumentException("queue cant add null value");
		} else if (isEmpty()) {
			arr[++front] = value;
			++end;
			++size;

		} else if (arr.length - 1 == end) {
			reSize();
		} else {
			arr[++end] = value;
			++size;
		}
	}

	public E dequeue() {
		if (isEmpty())
			throw new IllegalStateException("queue is empty");
		size--;
		return arr[front++];
	}

	public E peek() {
		if (isEmpty())
			throw new IllegalStateException("queue is empty");

		return arr[front];
	}

	public boolean isExists(E value) {
		if (value == null)
			throw new IllegalArgumentException("null value");
		for (int i = front; i <= end; i++) {
			if (arr[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void print() {
		if (end < front) {
			System.out.println("queue is empty");
		}
		for (int i = front; i <= end; i++) {
			System.out.println(arr[i]);
		}
	}

	private void reSize() {
		System.out.println("rezing " + inLth);
		inLth *= 2;
		@SuppressWarnings("unchecked")
		E[] temp = (E[]) new Object[inLth];
		System.arraycopy(arr, front, temp, 0, size);
		arr = temp;
		front = 0;
		end = size - 1;
		
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

}

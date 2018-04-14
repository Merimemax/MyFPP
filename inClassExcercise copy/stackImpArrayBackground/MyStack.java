package stackImpArrayBackground;

public class MyStack<E> {
	private int pointer = 0;
	private int initialSize = 5;
	private E[] inArray;

	@SuppressWarnings("unchecked")
	public MyStack() {
		inArray = (E[]) new Object[initialSize];
	}

	public void push(E value) {
		if (pointer == inArray.length) {
			reSize();
		}
		inArray[pointer++] = value;
	}

	public E pop() {
		if (pointer == 0)
			throw new IllegalStateException("Stack is empty");
		return inArray[--pointer];
	}

	public boolean isEmpty() {
		return pointer == 0;
	}

	public int size() {
		return pointer;
	}

	@SuppressWarnings("unchecked")
	private void reSize() {
		initialSize *= 2;
		E[] temp = (E[]) new Object[initialSize];

		System.arraycopy(inArray, 0, temp, 0, pointer);
		inArray = temp;
	}

}

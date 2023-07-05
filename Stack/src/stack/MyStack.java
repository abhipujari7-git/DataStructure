package stack;

public class MyStack {

	private int size;
	private int top;
	private int[] arr;

	public MyStack(int sizee) {

		this.size = sizee;
		arr = new int[size];
		this.top = -1;
	}

	public void push(int val) {
		++top;
		arr[top] = val;
	}

	public void pop() {
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

}

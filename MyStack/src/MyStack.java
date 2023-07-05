
public class MyStack {

	private int arr[];
	private int top;

	public MyStack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		// TODO Auto-generated method stub
		++top;
		arr[top] = val;
	}

	public void pop() {
		// TODO Auto-generated method stub 
		--top;
	}

	public int peek() {

		return arr[top];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return top == arr.length - 1;
	}

}

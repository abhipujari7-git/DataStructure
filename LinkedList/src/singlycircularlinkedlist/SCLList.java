package singlycircularlinkedlist;

public class SCLList {

	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			super();
			this.data = val;
			this.next = null;
		}

	}

	private Node head;

	public SCLList() {
		super();
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		Node trav = head;
		if (head == null)
			throw new RuntimeException("List is Empty ");
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);

	}

	public void addFirst(int val) {

		Node nn = new Node(val);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		} else {

			while (trav.next != head)
				trav = trav.next;
			trav.next = nn;
			nn.next = head;
			head = nn;
		}
	}

	public void addLast(int val) {

		Node nn = new Node(val);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		} else {
			while (trav.next != head) {
				trav = trav.next;
			}
			nn.next = head;
			trav.next = nn;
		}

	}

	public void addAtPos(int pos, int val) {

		Node nn = new Node(val);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		} else {

			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == head)
					throw new RuntimeException("Invalid Position");
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
		}

	}

	public void delFirst() {

		Node trav = head;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {

			while (trav.next != head)
				trav = trav.next;

			trav.next = head.next;
			head = trav.next;

		}
	}

	public void deleteLast() {

		Node temp = null;
		Node trav = head;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {

			while (trav.next != head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = head;
		}

	}

	public void delAtPos(int pos) {
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {
			for (int i = 1; i < pos; i++) {
				if (trav.next == head)
					throw new RuntimeException("Invalid position");
				temp = trav;
				trav = trav.next;

			}
			temp.next = trav.next;
		}

	}

	public void deleteAll() {
		head.next = null;
		head = null;

	}

}

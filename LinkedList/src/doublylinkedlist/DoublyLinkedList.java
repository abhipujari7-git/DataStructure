package doublylinkedlist;

public class DoublyLinkedList {

	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}

		public Node() {
			super();
			this.data = 0;
			this.next = null;
			this.prev = null;
		}
	}

	private Node head;

	public DoublyLinkedList() {
		super();
		this.head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {

		Node trav = head;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
	}

	public void addFirst(int val) {

		Node nn = new Node(val);

		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}

	public void addLast(int val) {

		Node nn = new Node(val);
		Node trav = head;

		if (isEmpty()) {
			head = nn;
		} else {
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn;
			nn.prev = trav;
		}

	}

	public void addAtPos(int pos, int val) {

		Node nn = new Node(val);
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			head = nn;
		} else {

			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null) {
					throw new RuntimeException("Invalid Position");
				}
				trav = trav.next;
				temp = trav.next;
			}
			nn.next = temp;
			nn.prev = trav;
			trav.next = nn;
			if (temp.next == null)
				temp.prev = nn;
		}

	}

	public void delFirst() {

		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {
			head = head.next;
			head.prev = null;
		}

	}

	public void deleteLast() {
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {

			while (trav.next != null) {
				temp = trav;
				trav = trav.next;
			}

			temp.next = null;
			trav.prev = null;
			trav = null;
		}

	}

	public void delAtPos(int pos) {
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {

			for (int i = 1; i < pos; i++) {
				if (trav.next == null)
					throw new RuntimeException("Invalid Position");
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
			trav.next.prev = temp;
		}

	}

	public void deleteAll() {

		head = null;

	}

	public void displayRev() {

		Node trav = head;

		if (isEmpty())
			throw new RuntimeException("List is empty");

		while (trav.next != null) {
			trav = trav.next;
		}

		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}
	}

}

package singlycircularlinkedlist;

public class SinglyCircularLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

		public Node() {
			super();
			this.data = 0;
			this.next = null;
		}

	}

	private Node head;

	public SinglyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (head == null)
			throw new RuntimeException("List is Empty ");
		Node trav = head;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println("");
	}

	public void addFirst(int val) {

		Node nn = new Node(val);
		Node trav = head;
		if (isEmpty()) {
			head = nn;
			nn.next = head;
		}
		while (trav.next != head) {
			trav = trav.next;
		}
		trav.next = nn;
		nn.next = head;
		head = nn;

	}

	public void addLast(int val) {
		Node nn = new Node(val);
		Node trav = head;

		if (isEmpty()) {
			head = nn;
			nn.next = head;
		}
		while (trav.next != head) {
			trav = trav.next;
		}
		nn.next = head;
		trav.next = nn;
		System.out.println("Added ");

	}

	public void addAtPos(int pos, int val) {

		Node nn = new Node(val);
		Node trav = head;
		if (isEmpty()) {
			addFirst(val);
		}
		for (int i = 1; i < pos - 1; i++) {
			if (trav.next == head) {

				break;
			}
			trav = trav.next;
		}
		nn.next = trav.next;
		trav.next = nn;

	}

	public void delFirst() {

		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		} else {
			Node trav = null;
			while (trav.next != null) {
				trav = trav.next;
			}
			head = head.next;
			trav.next = head;
		}

	}

	public void deleteLast() {
		Node trav = head;
		Node temp = null;
		if (isEmpty()) {
			throw new RuntimeException("List is empty");
		}
		while (trav.next == head) {
			temp = trav;
			trav = trav.next;
		}

		System.out.println("-----");

		temp.next = head;
	}

	public void delAtPos(int pos) {
		Node trav = head;
		Node temp = null;

		for (int i = 1; i < pos; i++) {
			if (trav.next == head) {
				throw new RuntimeException("invalid position");
			}
			temp = trav;
			trav = trav.next;

		}
		temp.next = trav.next;

	}

	public void deleteAll() {
		head.next = null;
		head = null;
	}

}

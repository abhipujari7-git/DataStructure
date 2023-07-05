package singlylinkedlist;

public class MyLinkedList {

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

	public MyLinkedList() {
		head = null;
	}

	public void display() {
		Node trav = head;

		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

	public void addFirst(int val) {
		Node nn = new Node(val);
		if (head == null) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public void addLast(int val) {

		Node nn = new Node(val);
		Node trav = new Node();
		if (head == null)
			addFirst(val);
		else {
			trav = head;

			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = nn;
		}

	}

	public void deleteAll() {
		head = null;

	}

	public void addAtPos(int pos, int val) throws RuntimeException {
		Node nn = new Node(val);
		Node trav = new Node();
		if (head == null || pos <= 1) {

			addFirst(val);
		} else {
			trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null) {
					throw new RuntimeException("Invalid Position");
				}
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;

		}

	}

	public void delFirst() {

		if (head == null)
			throw new RuntimeException("List Empty");
		head = head.next;
	}

	public void deleteLast() {

		Node temp = null;
		Node trav = head;

		while (trav.next != null) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = null;
	}

	public void delAtPos(int pos) {

		Node temp = null;
		Node trav = head;

		if (head == null || pos < 1) {
			throw new RuntimeException("List Empty");
		} else {
			for (int i = 1; i < pos; i++) {
				if(trav.next == null)
					throw new RuntimeException("Pos Beyond Range");
				temp = trav;
				trav = trav.next;
			}
		}
		temp.next = trav.next;

	}

}

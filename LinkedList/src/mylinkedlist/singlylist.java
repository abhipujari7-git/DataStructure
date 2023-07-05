package mylinkedlist;

public class singlylist {
	// self refrenctial class
	static class Node {
		private int data;
		private Node next;

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}

	}

	private Node head;

	public singlylist() {
		head = null;
	}

	void display() {
		System.out.println("LList : ");
		Node trav = head;
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");

	}

	void addFirst(int val) {
		Node nn = new Node(val);

		if (head == null) {

			head = nn;
		}
		if (head.next != null) {
			nn.next = head;
			head = nn;
		}

	}

	void addLast(int val) {
		Node nn = new Node(val);

		if (head == null) {
			head = nn;
		} else {
			Node trav = head;

			while (trav.next != null) { // traversing to last node
				trav = trav.next;// locating last node
			}
			trav.next = nn; // last node next == nn

		}

	}

	void addAtPos(int val, int pos) {
		// alocate nn
		Node nn = new Node(val);

		// if list is empty
		if (head == null || pos <= 1) {
			addFirst(val);
		} else {
			// traverse till pos -1
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				// if pos > length of list
				if (trav.next == null)
					break;
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;

		}

	}

	void deleteFirst() {
		if (head == null) {
			System.out.println("list empty");
		}
		head = head.next;
	}

	void deleteLast() {
		Node trav = head;
		while (trav.next != null)
			trav = trav.next;
		trav.data = 0;
	}

	void deleteAll() {
		head = null;
	}

	void deleteAtPos(int pos) {
		Node temp = null, trav = head;
		if (pos == 1) {
			deleteFirst();

		} else if (head == null || pos < 1) {
			throw new RuntimeException("Empty or invalid position");
		} else {
			for (int i = 1; i < pos; i++) {

				if (trav == null) {
					throw new RuntimeException("invalid position");
				}
				temp = trav;
				trav = trav.next;
			}
			temp.next = trav.next;
		}
	}
}

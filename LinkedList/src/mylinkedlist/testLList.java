package mylinkedlist;

public class testLList {

	public static void main(String[] args) {
		singlylist list = new singlylist();

		list.display();// empty list
		list.addFirst(500);
		list.addLast(501);
		list.addFirst(502);
		list.addFirst(503);
		list.addLast(506);

//		list.display();
//		list.addAtPos(111, 5);
		list.display();
//		list.deleteFirst();
		list.display();
//		list.deleteLast();
		list.display();
//		list.deleteAll();
//		list.display();
		list.deleteAtPos(1);
		list.display();
	}

} 

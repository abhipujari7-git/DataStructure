package singlylinkedlist;

import java.util.Scanner;

public class testSLLList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList();
		boolean exit = true;
		int choice = 0;
		do {
			try {
			System.out.println("0.Exit " 
					+ "1.display "
					+ "2.add first "
					+ "3.add last" 
					+ "4.add at pos"
					+ "5.delete first" 
					+ "6.delete last" 
					+ "7.delete at pos" 
					+ "8.delete all");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("List :");
				list.display();
				break;
			case 2:
				System.out.println("Enter value to add at first");
				list.addFirst(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter value to add at Last");
				list.addLast(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter value to add at Pos and val");
				list.addAtPos(sc.nextInt(), sc.nextInt());
				break;
			case 5:
//				System.out.println("Enter value to add at Pos and val");
				list.delFirst();
				break;
			case 6:
				list.deleteLast();
				break;
			case 7:
				System.out.println(" Pos to delete");
				list.delAtPos(sc.nextInt());
				break;
			case 8:
				list.deleteAll();
				break;
			
			case 0:
				exit = false;
				break;
			}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (exit);
	}

}

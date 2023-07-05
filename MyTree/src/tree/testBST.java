package tree;

import java.util.Scanner;

public class testBST {

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();
System.out.println("start");
		tree.add(50);
		tree.add(60);
		tree.add(40);
		tree.add(70);
		tree.add(80);
		tree.add(20);
		tree.add(10);
		System.out.println("list :");
		tree.preOrder();
		tree.inOrder();
		tree.postOrder();
//		Scanner sc = new Scanner(System.in);
//		BinarySearchTree tree = new BinarySearchTree();
//		boolean exit = true;
//		int choice = 0; 
//		do {
//			try {
//				System.out.println("0.Exit \n1.Add \n2.Pop \n3.Peek \n4.isEmpty \n5.isfull");
//				System.out.println("Enter choice");
//				choice = sc.nextInt();
//				switch (choice) {
//				case 1:
//					System.out.println("Enter val to Push");
//					tree.add(sc.nextInt());
//					break;
//				case 2:
//					tree.preOrder();
//					break;
//				case 3:
////					System.out.println(tree.peek());
//					break;
//				case 4:
////					System.out.println(tree.isEmpty());
//					break;
//				case 5:
////					System.out.println(tree.isFull());
//					break;
//
//				case 0:
//					exit = false;
//					break;
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				System.out.println(e.getMessage());
//			}
//		} while (exit);
	}

}

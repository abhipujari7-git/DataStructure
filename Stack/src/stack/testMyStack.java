package stack;

import java.util.Scanner;

public class testMyStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyStack stack = new MyStack(5);
		boolean exit = true;
		int choice = 0;
		do {
			try {
				System.out.println("0.Exit \n1.Push \n2.Pop \n3.Peek \n4.isEmpty \n5.isfull");
				System.out.println("Enter choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter val to Push");
					stack.push(sc.nextInt());
					break;
				case 2:
					stack.pop();
					break;
				case 3:
					System.out.println(stack.peek());
					break;
				case 4:
					System.out.println(stack.isEmpty());
					break;
				case 5:
					System.out.println(stack.isFull());
					break;

				case 0:
					exit = false;
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (exit);
	}

}

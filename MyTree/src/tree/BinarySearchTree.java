package tree;

public class BinarySearchTree {

	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int val) {

			this.data = val;
			this.left = null;
			this.right = null;
		}

		public Node() {
			super();
			this.data = 0;
			this.left = null;
			this.right = null;
		}

	}

	private Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public void add(int val) {
		Node nn = new Node(val);

		if (root == null) {
			root = nn;
		} else {
			Node trav = root;
			while (true) {
				if (val < trav.data) {
					if (trav.left != null)
						trav = trav.left;
					else {
						trav.left = nn;
						break;
					}
				} else {
					if (trav.right != null)
						trav = trav.right;
					else {
						trav.right = nn;
						break;
					}
				}
			}
		}
	}

	public void preOrder(Node root) {
		Node trav = root;
		if (trav == null)
			return;
		else {
			System.out.print(trav.data + ",");
			preOrder(trav.left);
			preOrder(trav.right);
		}

	}

	public void preOrder() {
		System.out.println("preOrder List : ");
		preOrder(root);
		System.out.println("");
	}

	public void inOrder(Node root) {
		Node trav = root;
		if (trav == null)
			return;
		else {

			inOrder(trav.left);
			System.out.print(trav.data + ",");
			inOrder(trav.right);
		}

	}

	public void inOrder() {
		System.out.println("inOrder List : ");
		inOrder(root);
		System.out.println("");
	}

	public void postOrder(Node root) {
		Node trav = root;
		if (trav == null)
			return;
		else {

			postOrder(trav.left);
			postOrder(trav.right);
			System.out.print(trav.data + ",");
		}

	}

	public void postOrder() {
		System.out.println("postOrder List : ");
		postOrder(root);
		System.out.println("");
	}

}

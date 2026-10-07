package Demo;

import Demo.PostorderTraversal.Node;

public class PostorderTraversal {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data) {
			this.data = data;
		}
	}
		static void postorder(Node root) {
			if (root == null) {
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}
		public static void main(String[] args) {
			Node root = new Node(56);
			root.left = new Node(30);
			root.right = new Node(20);
			root.left.left = new Node(10);
			root.left.right = new Node(34);
			root.left.right.left = new Node(80);
			root.right.left = new Node(90);
			root.right.right = new Node(70);
			System.out.println("Postorder Traversal");
			postorder(root);
		}
}

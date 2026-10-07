package Demo;
import java.util.Stack;
public class AdvancedPreorder {
static class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
	}
}
static void Preorder(Node root) {
	if (root == null) {
		return;
	}
	Stack<Node> stack = new Stack<>();
	stack.push(root);
	 while (!stack.isEmpty()) {
		 Node current = stack.pop();
		 System.out.println(current.data + " ");
		 if (current.right != null) {
			 stack.push(current.right);
		 }
		 if(current.left != null) {
			 stack.push(current.left);
		 }
	 }
}
public static void main(String[] args) {
	Node root = new Node(50);
	root.left = new Node(30);
	root.right = new Node(20);
	root.left.left = new Node(10);
	root.left.right = new Node(34);
	root.left.right.left = new Node(80);
	root.right.left = new Node(90);
	root.right.right = new Node(70);
	System.out.println("Preorder Traversal:");
	Preorder(root);
}
}

package Demo;

import Demo.LinkedListAdvanced.Node;

public class DoublyLinkedList {
static class Node {
	int data;
	Node prew;
	Node next;
	Node(int data){
		this.data = data;
		this.prew = null;
		this.next = null;
}
}
Node head;
Node tail;
void insertList(int data) {
	Node newNode = new Node(data);
	if (head == null) {
		head = newNode;
		tail = newNode;
		return;
	}
	tail.next = newNode;
	newNode.prew = tail;
	tail = newNode;
	return;
}
	 
void displayForward() {
	Node current = head;
	while (current != null) {
		System.out.print(current.data + " ");
		current = current.prew;
		
	}
	System.out.println("NULL");
}
public static void main(String[] args) {
	DoubleLinkedList list = new DoubleLinkedList();
	list.insertLast(10);
}
}


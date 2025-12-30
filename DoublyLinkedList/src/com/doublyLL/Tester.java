package com.doublyLL;

public class Tester {

	public static void main(String[] args) {
		DoublyLL dll = new DoublyLL();
		dll.insertAtBeginnig(20);
		dll.insertAtBeginnig(240);
		dll.insertAtBeginnig(60);
		dll.insertAtBeginnig(10);
		dll.insertAtEnd(30);
//		dll.deleteAtBeginning();
//		dll.deleteAtLast();
//		dll.deleteByValue(20);
//		dll.deleteByIndex(1);
		dll.search(20);
		dll.display();

	}

}

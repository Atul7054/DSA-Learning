package com.doublyLL;

public class DoublyLL {
	Node head;
	Node tail;
	
	public void insertAtBeginnig(int data) {
		Node newNode = new Node(data);
		//agar head ki value null nhi h to newNode ka next head ko point karega 
		//head ka prev newNode ko ponint karega
		//<----newNode--->head
		
		if(head !=null) {
			newNode.next=head;
			head.prev=newNode;
		}
		head=newNode;
	}
	
	//DISPLAY
	
	public void display() {
		Node temp=head;
		while(temp !=null) {
			System.out.print(temp.data+"<-->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	//INSERT_AT_END
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		//if dll is empty
		if(head==null) {
			newNode=head;
			return;
			
		}
		
		Node temp=head;
		while(temp.next !=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.prev=temp;
	}
	
	//Delete at Beginning
	
	public void deleteAtBeginning() {
		if(head==null) return;
		head=head.next;
		if(head !=null) {
			head.prev=null;
		}
	}
	
	// Delete At Last
	
	public void deleteAtLast() {
		//No element
		if(head==null) return;
		//1 element
		if(head.next==null) {
			 head=null;
			 return;
		}
		//traverse to second last
		Node temp=head;
		while(temp.next != null) {
			temp = temp.next;
			
		}
		temp.prev.next=null;
		
		
	}
	
	//delete by index
	
	public void deleteByIndex(int index) {
		if(index==0) {
			deleteAtBeginning();
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		
		Node deleteNode=temp.next;
		if(deleteNode==tail) {
			deleteAtLast();
			return;
		}
		temp.next=deleteNode.next;
		deleteNode.next.prev=temp;
		
		deleteNode.next=deleteNode.prev=null;
	
	}
	
	//delete by value
	
	public void deleteByValue(int value) {
		if(head==null) return;
		//if deleting head
		if(head.next==null) {
			head=null;
			return;
			
					
		}
		Node temp=head;
		
		//find data
		//link previous and next Node
	
		
		while(temp.data != value) {
			temp=temp.next;
		}
		
		if(temp==null) return; // value not found
		
		//jab head na ho
		if(temp.prev !=null) {
			temp.prev.next=temp.next;
		}else {  //jab head ho to head ko next pe point kardenge
			head=temp.next;
		}
		
		if(temp.next !=null) {
			temp.next.prev=temp.prev;
		}
		
	}
	
	//search by value 
	public void search(int value) {
		Node temp=head;
		int pos=0;
		while(temp != null) {
			if(temp.data==value) {
				System.out.print("Found at "+ pos );
			}
			temp=temp.next;
			pos++;
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

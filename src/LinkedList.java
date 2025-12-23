class LinkedList{
	 Node head;
	 public void insertAtBeginning(int data) {
		 Node newNode=new Node(data);
		 newNode.next=head;
		 head=newNode;
	 }
	 
	 public void display() {
		 Node temp=head;
		 while(temp != null) {
			 System.out.print(temp.data+" ->");
			 temp=temp.next;
		 }
	 }
	 
	 public void insertAtLast(int data) {
		 Node newNode=new Node(data);
		 Node current=head;
		 //check if list is empty
		 if(head==null) {
			 head=newNode;
			 return;
		 }
		 while(current.next !=null) {
			 current=current.next;
		 }
		 current.next=newNode;
	 }
	 
	 public void deleteFromBeginning() {
		 if(head==null) {
			 System.out.print("List is Empty");
			 return;
		 }
		 head=head.next;
	 }
	 
	 public void deleteFromEnd() {
		 if(head==null) {
			 System.out.print("List is Empty");
			 return;
			 
		 }
		 
		 //if there is only one node
		 if(head.next==null) {
			 head=null;
			 return;
			 
		 }
		 Node temp=head;
		 
		 //ab ye second last element khojega fir uske bad temp.next ko null kardega
		 
		 while(temp.next.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=null;
	 }
	 
	 public boolean search(int value) {
		 Node temp=head;
		 while(temp !=null) {
			 if(temp.data==value) {
				 return true;
			 }
			 temp=temp.next;
		 }
		 return false;
	 }
	 
	 //delete by value
	 
	 public void deleteByValue(int value) {
		 Node temp=head;
		 if(head==null) {
			 System.out.println("List is empty");
			 return;
		 }
		 //case 2 value id present at first
		 if(head.data==value) {
			 head=head.next;
			 return;
		 }
		 
		
		 
			 
		 
		 while(temp.next !=null && temp.next.data !=value) {
			 temp=temp.next;
		 }
		 //last elemnt par aa gya
		 if(temp.next==null) {
			 System.out.println("Value not found");
			 return;
		 }
		 
		 temp.next=temp.next.next;
	
		 
		 
		 
	 }
	 
	 //LENGTH OF LINKED LIST
	 
	 public int length() {
		 int count=0;
		 Node temp=head;
		 while(temp !=null) {
			 count++;
			 temp=temp.next;
		 }
		 return count;
	 }

	 public void reverse(){
		Node prev=null;
		Node curr=head;
		while(curr !=null){
			Node next=curr.next;//Save the next address before we change it
			//Then reverse
			curr.next=prev;
			//Move prev and curr in same order firstly prev then curr
			
			prev=curr;
			curr=next;

		}
		head=prev;
	 }
 }
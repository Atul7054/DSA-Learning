public class Test{
	 public static void main(String[] args) {
		 LinkedList list=new LinkedList();
		 list.insertAtBeginning(10);
		 list.insertAtBeginning(25);
		 list.insertAtBeginning(30);
		 list.insertAtBeginning(50);
		 list.insertAtBeginning(90);
		 list.insertAtBeginning(70);
		 
		 
		 
		 list.insertAtLast(5);
		 
		 list.deleteFromBeginning();
		 
		 list.deleteFromEnd();
		 System.out.println(list.search(25));
		 list.deleteByValue(25);
		 System.out.println(list.length());
		 System.out.println("Before Reverse");
		 list.display();
		
		 System.out.println("After Reverse");
		  list.reverse();
		 list.display();
		 
		 
	 }
 }
package hacktoberfest;

class Node {
	
    int data;
    Node next;
    
    // Parameterized constructor
    Node(int d) {
        data = d;
        next = null;
    }
}

public class DetectCycleInLL {
	
	// Method to create a Linked List
	public static Node createLinkedList(Node head, int data) {
	    
		// Create a new node
		Node temp = new Node(data);
	    
		// Insert the node into the Linked List
	    if(head == null) {
	        head = temp;
	    }
	    else {
	    	Node ptr = head;
		    while(ptr.next != null) {
		    	ptr = ptr.next;
		    }
		    ptr.next = temp;
	    }
	    
	    return head;
	}
	
	/* Method to create a cycle in the Linked List by connecting
	 * node at position 'a' to node at position 'b'	*/
	public static void createCycle(Node head, int a, int b) {
	    
		int cnta = 0, cntb = 0;
	    Node ptr1 = head;
	    Node ptr2 = head;
	    
	    while(cnta != a || cntb != b) {
	        if(cnta != a) {
	        	ptr1 = ptr1.next; 
	        	++cnta;
	        }
	        if(cntb != b) {
	        	ptr2 = ptr2.next;
	        	++cntb;
	        }
	    }
	    
	    ptr2.next = ptr1;
	}
	
	// Method to detect a cycle in the Linked List using two pointers
	public static boolean detectCycle(Node head) {
	    
		if(head == null) {
	    	return false;
	    }
		
	    Node fast = head;	// Moves two steps at a time
	    Node slow = head;	// Moves one step at a time
	        
	    while(fast.next != null && fast.next.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	        if(fast == slow) {
	        	return true;
	        }
	    }
	    
	    return false;
	}

	public static void main(String[] args) {

		 Node head = null;
		 
		 // Creating a Linked List with elements 1, 2, 3, 4, 5
		 head = createLinkedList(head, 1);
		 head = createLinkedList(head, 2);
		 head = createLinkedList(head, 3);
		 head = createLinkedList(head, 4);
		 head = createLinkedList(head, 5);
		 
		 // Creating a cycle by connecting nodes at positions 1 and 3
		 createCycle(head, 1, 3);
		 
		 // Checking if the Linked List has a cycle
		 if(detectCycle(head) == true) {
			 System.out.println("The Linked List has a Cycle!");
		 }
		 else{
			 System.out.println("The Linked List does not have a Cycle!");
		 }
	}

}

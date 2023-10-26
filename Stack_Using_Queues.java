/* 
 * Implementation of Stack using two Queues
 */
package stackImplementation;
import java.util.*;


class Stack{  					// Stack class where all methods of stack are created 
	Queue<Integer> q1 = new LinkedList<Integer>(); 
	Queue<Integer> q2 = new LinkedList<Integer>();
	int size;
	
	Stack(){
		size=0;
	}
	
	//using Push Operation costly approach
	void push(int element) {  
		size++; 
		q2.add(element);    //adding recently entered element to q2

		while (!q1.isEmpty()) {    
			q2.add(q1.peek());	 // moving all the elements of q1 to q2 
			q1.remove(); 
		} 
		
		Queue<Integer> temp = q1;   
		q1 = q2; 				//swapping the queues
		q2 = temp;
	}

	
	int pop() {  				// returns and remove the recently entered element
		if (q1.isEmpty()) { 
			return -1; } //returns -1 for empty queue
		else{
			size--;
			return q1.remove(); 
		}
	}

	
	int top() {    // returns the recently entered element
		if (q1.isEmpty()) 
			return -1; 
		return q1.peek(); 
	}

	
	int size() {     // returns the size of stack
		return size;
	}
}

public class Stack_Using_Queues {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Stack stack=new Stack();   //Instantiating Stack class
		char m;int choice;
		do {


			System.out.println("Enter the choice from the menu");
			System.out.println(" 1.Push element\n 2.Pop element"); //menu
			choice=input.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter number:");
				int x=input.nextInt();
				stack.push(x);
				break;
			}
			case 2: {
				System.out.println(stack.pop());
				break;
			}

			default: {
				System.out.println("Enter valid input");
			}
			} 
			System.out.println("Press 'Y' to continue to menu or press 'N' to exit");
			m=input.next().charAt(0);

			if(m=='n'|| m=='N') {
				System.out.println("The program has exited successfully");
				System.exit(0);}
		}while(m=='y' || m=='Y');

		input.close();
	}

}

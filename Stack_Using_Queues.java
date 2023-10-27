/* 
 * Implementation of Stack using two Queue
 */
package stackImplementation;
import java.util.*;


	class Stack{  					// Stack class where all methods of stack are created 
	Queue<Integer> q1 = new LinkedList<Integer>(); 
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	//using Push Operation costly approach
	void push(int element) {  
		
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
			return q1.remove(); 
		}
	}
}

public class Stack_Using_Queues {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		Stack stack=new Stack();   //Instantiating Stack class
		stack.push(2);
		stack.push(3);
		System.out.print(stack.pop()+" ");
		stack.push(4);
		System.out.print(stack.pop()+" ");
		
		
		
		input.close();
	}

}

package newAndrew;

import java.util.Scanner;

public class MainStack02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack02 st = new Stack02(5);
		
		st.push(5);
		st.push(10);
		st.push(8);
		
		while(!st.isFull()) {//can add new data to stack until stack full
			double pushVal;
			System.out.println("Enter valuue push : ");
			pushVal = s.nextDouble();
			st.push(pushVal);
		}
		
		st.display();
		System.out.println(); 
		//while(!st.isEmpty()) { //can delete/ pop data ,until the stack is empty
			System.out.println("popped : " + st.pop());		
			
		//}
		
			System.out.println();
		//while(!st.isEmpty()) { //can read/ peek data, until the stack is empty
			System.out.println("peek : " + st.peek());
			System.out.println();
		//}
	}

}

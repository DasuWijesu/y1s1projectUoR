package newAndrew;

import java.util.Scanner;

public class MainLineQueue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		lineQueue lq = new lineQueue(7);
		
		lq.insert(67);
		lq.insert(12);
		lq.insert(22);
		
		while(!lq.isFull()) {
			double input;
			System.out.println("Enter insets : ");
			input = s.nextDouble();
			
			lq.insert(input);
		}
		lq.display();
		System.out.println();
		
		while(!lq.isEmpty()) {
			System.out.println("Remove :" + lq.remove());
		}

		System.out.println();
		System.out.println("peekFront : " + lq.peekFront());
	}

}

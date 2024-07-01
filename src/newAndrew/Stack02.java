package newAndrew;

public class Stack02 {

	private int maxSize;
	private double[] STarray ;
	private int top;
	
	public Stack02(int s){
		maxSize = s;
		STarray = new double[maxSize];
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return  true;
		}
		else {
			return  false;
		}
	}
	
	public boolean isFull() {
		if(top == (maxSize -1)) {
			return  true;
		}
		else {
			return  false;
		}
	} 

	public void push(double j) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			STarray[++top] = j;
		}
	}
	
	
	public double pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty ");
		return -99;
		}
		else {
			return STarray[top--];
		}
	}
	
	public double peek() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty ");
			return -99;
		}
		else {
			//double poppedVal = STarray[top];
			
			return STarray[top];
		}
	} 
	
	public void display () {
		int i = top;
		
		do {
			System.out.println("Stack " + STarray[i]);
			i--;
		}while(i>=0);
		
		//i=top;
	}
	
}

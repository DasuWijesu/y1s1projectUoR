package newAndrew;

public class CircularQueue {
	private int front, rear;
	private double[] arrayC;
	private int noOfIteam, maxSize;
	
	public CircularQueue(int s) {
		maxSize = s;
		front = 0;
		rear = -1;
		arrayC = new double[maxSize];
		noOfIteam =0;
	}
	
	public void insert(double fgh) {
		if(noOfIteam == maxSize) {
			System.out.println("Queue is full ");
		}
		else {
			if(rear == maxSize-1) {
				rear = -1;
				arrayC[++rear] = fgh;
				noOfIteam++;
			}
		}
	}
	
	public double remove() { 
		if(noOfIteam == 0) {
			System.out.println("Stack is empty ");
			return -99;
		}
		else {
			double temp = arrayC[front++];
			if(front == maxSize)
				front = 0;
			noOfIteam--;
			return temp;
		}
	}
	
	public double peekFront() { 
		if(noOfIteam == 0) {
			System.out.println("Stack is empty ");
			return -99;
		}
		else {
			return arrayC[front];
		}
	}
	
	public boolean isEmpty() {
    	if(noOfIteam == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public boolean isFull() {
    	if(noOfIteam == maxSize) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
    public void display() {
    	int i = 0;
    	
    	System.out.println("ArrayQ ");
    	do {
    	System.out.print(arrayC[front++]);
    	}while(i>=rear);
    	
    }
}

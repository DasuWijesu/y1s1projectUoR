package newAndrew;

public class lineQueue {

	private int front;
	private int rear;
	private double[] ArrayQ;
	private int maxSIze;
	private int noOfItem;
	
	public lineQueue(int s) {
		maxSIze= s;
		ArrayQ = new double[maxSIze];
		front = 0;
		rear = -1;
		noOfItem =0;
	}
	
	//insert
	public void insert(double j) {
		if(rear == (maxSIze - 1)){
			System.out.println("The queue is full ");
		}
		else {
			ArrayQ[++rear] = j;
			noOfItem++;
		}
	}
	
    public double remove() {
    	if(noOfItem == 0) {
    		System.out.println("queue is empty ");
		return -99;
    	}
    	else {
    		noOfItem--;
    		return ArrayQ[front++];
    	}
	}
    
    public double peekFront() {
    	if(noOfItem == 0) {
    		System.out.println("queue is empty ");
		return -99;
    	}
    	else {
    		//noOfItem--;
    		return ArrayQ[front];
    	}
	}
    
    public boolean isEmpty() {
    	
    		return noOfItem == 0;
    	
    }
    
    public boolean isFull() {
    
    		return noOfItem == maxSIze;
    	
    }
    
    public void display() {
    	
    	System.out.println("ArrayQ ");
    	for(int i = 0; i<rear; i++)
    	System.out.print(ArrayQ[i] + " ");
    	
    	}
    	
    
}

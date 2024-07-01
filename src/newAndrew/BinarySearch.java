package newAndrew;
class Tree{
	private Node root; //first node of free
	
	public Tree() {
		root = null;
	}
	
	public void insert (int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		
		if(root == null) {// no node in root
			root = newNode;
		}
		else //no need in root
		{
			Node current = root; //start at root
			Node parent;
			while(true) {
				parent = current;
				if(id < current.iData)//go left
				{
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return ;
					}
					else //go right 
					{
						current = current.leftChild;
						if(current == null) {
							parent.rightChild = newNode;
							return ;
						}
					}
				}
			}
		}
	}
	
	public boolean delete (int id) {
		
	}
	
	public Node find(int Key) {
		Node current = root;
		while (current.iData != Key){
			if(Key < current.iData) {
				current = current.leftChild; 
			}
			else
				current = current.rightChild;
			
			if(current == null) {
				return null;
			}
		}
		return current;
	}
}

class Node{
	public int iData; //data item(used as key value)
	public double dData; //other data
	public Node leftChild; //this node`s left child
	public Node rightChild; //this node`s right child
	
	public void displayNode() {
		System.out.println("{");
		System.out.println(iData);
		System.out.println(",");
		System.out.println(dData);
		System.out.println("}");
	}
	
}

class BinarySearch {
	
}

package LinearQ;

public class LinearQ {
	private int rear, front;
	private int data[];
	
	public LinearQ(int size)
	{
		this.rear=-1;
		this.front=-1;
		data = new int[size];
	}
	
	public int getRear()
	{
		return rear;
	}
	
	public void setRear(int rear)
	{
		this.rear=rear;
	}
	
	public int getFront()
	{
		return front;
	}
	
	public void setFront(int front)
	{
		this.front=front;
	}
	
	public boolean isFull()
	{
		if(rear==data.length-1)
			{
				return true;
			}
		
		return false;
	}
	
	public boolean isEmpty()
	{
		if(rear==-1)
		{
			return true;
		}
		return false;
	}
	
	 public void enque(int val)
	 {
		 if(isFull())
		 {
			 System.out.println("Q is Full");
			 return;
		 }
		 
		data[++rear]=val;	
		if(rear==0)
		{
			front=rear;
		}	
	 }
	 
	 public int deque()
	 {
		 if(isEmpty())
		 {
			 System.out.println("Q is Empty");
			 return -1; 
		 }
		 int v = data[front++]; 
		 if(front==rear+1)
		 {
			 front=rear=-1;
		 }
		 return v;
	 }
	 
	 public void peek()
	 {
		 if(isEmpty())
		 {
			 System.out.println("Q is Empty");
			 return; 
		 }
		 System.out.println("\nFront value is " +data[front]);	 
	 }
	 
	 public void display()
	 {
		 if(isEmpty())
		 {
			 System.out.println("Q is Empty");
			 return; 
		 }
		 System.out.println("Q elements are ");
		for(int i=front; i<=rear; i++)
		{
			System.out.print(data[i]+" ");
		}	 
	 }
}

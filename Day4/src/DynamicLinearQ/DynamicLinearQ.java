package DynamicLinearQ;

public class DynamicLinearQ {
	private Node rear, front;
	
	public DynamicLinearQ()
	{
		this.rear=null;
		this.front=null;
	}
	
	public Node getrear()
	{
		return rear;
	}
	
	public void setRear(Node rear)
	{
		this.rear=rear;
	}
	
	public Node getFront()
	{
		return front;
	}
	
	public void setFront(Node front)
	{
		this.front=front;
	}
	
	public boolean isEmpty()
	{
		if(rear==null)
			return true;
		return false;
	}
	
	public void enque(int val)
	{
		Node nn = new Node(val);
		if(isEmpty())
		{
			front=rear=nn;
			front.setNext(nn);
			return;
		}
		
		rear.setNext(nn);
		rear=nn;
		
	}
	
	public int deque()
	{
		if(isEmpty())
		{
			System.out.println("Q is Empty");
			return -1;
		}
		
		Node temp=front;
		front=front.getNext();
		temp.setNext(null);
		return(temp.getData());	
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Q is Empty");
			return;
		}
		System.out.println("Peek Element is " +front.getData());
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Q is Empty");
			return;
		}
		
		for(Node i= front; i!=null; i=i.getNext())
		{
			System.out.println("Display Element is " +i.getData());
		}
	}

}

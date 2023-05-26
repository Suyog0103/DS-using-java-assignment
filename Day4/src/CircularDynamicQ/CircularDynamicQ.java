package CircularDynamicQ;

public class CircularDynamicQ {

private Node rear, front;
	
	public CircularDynamicQ()
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
		if(front==null)
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
		nn.setNext(front);
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
		rear.setNext(front);
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
		Node i=front;
		System.out.println("\nList Elements  -");
		while(i.getNext()!=front)
		{
			System.out.println("Display Element is " +i.getData());
			i=i.getNext();
		}
		System.out.println("Display Element is " +i.getData());
	}

}

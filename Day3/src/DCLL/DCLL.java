package DCLL;

public class DCLL {
	private Node head, tail;
	
	public DCLL()
	{
		this.head=null;
		this.tail=null;
	}
	

	public boolean insertAtBeg(int val)
	{
		Node nn = new Node(val);
		if(nn==null)
			return false;
		
		if(head==null)
		{
			head=tail=nn;
			head.setNext(nn);
			head.setPrev(nn);
		}
		else {
		nn.setNext(head);
		nn.setPrev(tail);
		head.setPrev(nn);
		tail.setNext(nn);
		head=nn;
		}
		return true;
		
	}
	
	public void forwardDisplay()
	{
		if(head==null)
		{
			System.out.println("list is Empty");
			return;
		}
		
		Node temp =head;
		
		System.out.println("Elements are: ");
		for(; temp.getNext()!=head; temp=temp.getNext())
		{
			System.out.print(temp.getData()+" \t");
		}
		System.out.print(temp.getData()+" \t");
	}

}


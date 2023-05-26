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
	
	public void insertAtLast(int val)
	{
		Node nn= new Node(val);
		if(head==null)
		{
			head=tail=nn;
			head.setNext(nn);
			head.setPrev(nn);
		}
		else {
			nn.setPrev(tail);
			nn.setNext(head);
			tail.setNext(nn);
			tail=nn;
			head.setPrev(nn);
		}
	}
	
	public void insertAtPos(int v, int p)
	{
		if(p<=0)
		{
			System.out.println("Insert +ve position");
			return;
		}
		if(p==1)
		{
			insertAtBeg(v);
			return;
		}
		
		
		Node temp=head;
		int i=1;
		while(i<p-1)
		{
			temp=temp.getNext();
			i++;
		}
		if(temp.getNext()==head) //this is not good //make for last
		{
			insertAtLast(v);
			return;
		}
		Node nn= new Node(v);
		nn.setNext(temp.getNext());
		nn.setPrev(temp);
		temp.setNext(nn);
		nn.getNext().setPrev(nn);	
	}
	
	
	public void deleteAtBeg()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else {
			head=head.getNext();
			head.getPrev().setNext(null);
			head.getPrev().setPrev(null);
			head.setPrev(tail);
			tail.setNext(head);	
		}
	}
	
	public void deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		else
		{
			tail=tail.getPrev();
			tail.getNext().setNext(null);
			tail.getNext().setPrev(null);
			tail.setNext(head);
			head.setPrev(tail);
		}
	}
	
	public void deleteAtPos(int pos)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(pos<=0)
		{
			System.out.println("Insert +ve value");
			return;
		}
		if(pos==1)
		{
			deleteAtBeg();
		}
		Node temp = head;
		int i=1;
		while(i<pos-1)
		{
			temp=temp.getNext();
			++i;
			if(temp.getNext()==head)
			
			{
				System.out.println("Invalid position");
				return;
			}
		
		temp.setNext(temp.getNext().getNext());
		temp.getNext().setPrev(temp);
		if(temp.getNext().getNext()==head)
		{
			tail=temp;
		}
//		temp.getNext().getPrev().setPrev(null);
//		temp.getNext().getPrev().setNext(null);
		
		}
	}
	
	
	
	public void forwardDisplay()
	{
		if(head==null)
		{
			System.out.println("list is Empty");
			return;
		}
		
		Node temp;
		
		System.out.println("\nForward display Elements are: ");
		for(temp =head; temp.getNext()!=head; temp=temp.getNext())
		{
			System.out.print(temp.getData()+" \t");
		}
		System.out.print(temp.getData()+" \t");
	}
	
	public void backwardDisplay()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=tail;
		System.out.println("\nElements are ");
		while(temp.getPrev()!=tail)
		{
			System.out.print(temp.getData()+"\t");
			temp = temp.getPrev();
		}
		System.out.print( temp.getData()+"\t");
	}
}

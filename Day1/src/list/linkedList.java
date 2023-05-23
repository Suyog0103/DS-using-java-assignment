package list;

public class linkedList {
	private node head;
	
	public linkedList()
	{
		this.head=null;
	}
	
	public node getHead()
	{
		return head;
	}
	
	public void setHead(node head)
	{
		this.head=head;
	}
	
	public void insertAtBeg(int ss)
	{
		node freshNode = new node(ss);
		
		if(head!=null)
		{
			freshNode.setNext(head);
		}
		head = freshNode;
	}
	
	public void insertAtLast(int ss)
	{
		node freshNode = new node(ss);
		node temp = head;
		
		if(head==null)
			{
				head = freshNode;
			}
		else
		{
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(freshNode);
		}	
	 }
	
	public void deleteAtLast()
	{
		node temp = head;
		
		if(temp!=null)
		{
			while(temp.getNext().getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(null);
		}
	}
	
	public void deleteAtFirst()
	{
		node temp = head;
		if(temp!=null)
		{
			if(temp.getNext()==null)
			{
				head=null;
			}
			else
			{
				head=temp.getNext();
			}
		}
	}
	
	public void search(int ss)
	{
		node temp = head;
		int index=0;
		
		while(temp!=null)
		{
			++index;
			if(ss==temp.getData())
			{
				System.out.println("\n" +ss+" is found at position "+index);
				break;
			}
		temp=temp.getNext();
		}
	}
	
	public void display()
	{
		node temp = head;
		
		System.out.println("Array Elements are- \n");
		while(temp!=null)
		{
			System.out.print( temp.getData()+"\t");
			temp=temp.getNext();
		}	
	}
	
	
	
	
	
	
}


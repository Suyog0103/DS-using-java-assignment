package list;

public class SLLL {
	private node head;
	
	public SLLL()
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
	
	
	public boolean insertAtPos(int val, int pos)
	{
		if(head==null)
		{
			return false;
		}
		
		if(pos<=0)
		{
			System.out.println("Enter position greater than zero");
			return false;
		}
		
		if(pos==1)
		{
			insertAtBeg(val);
			return true;
		}
		else
		{
			node temp= head;
			node nn = new node(val);
			int i=1;
			while(i<pos-1 && temp!= null)
			{
				temp=temp.getNext();
				++i;
			}
			
			if(temp==null)
			{
				System.out.println("invalid position null");
				return false;
			}
	
			nn.setNext(temp.getNext());
			temp.setNext(nn);
			return true;
			
		}}
		
		public boolean deleteAtPos(int pos)
		{
			if(head==null)
			{
				return false;
			}
			
			if(pos<=0)
			{
				System.out.println("Enter position greater than zero");
				return false;
			}
			
			if(pos==1)
			{
				deleteAtFirst();
				return true;
			}
			else
			{
				node temp= head;
				
				int i=1;
				while(i<pos-1 && temp!= null)
				{
					temp=temp.getNext();
					++i;
				}
				
				if(temp==null)
				{
					System.out.println("invalid position null");
					return false;
				}
		        node t=temp.getNext();
			    temp.setNext(t.getNext());
			    t.setNext(null);
			    return true;
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
				temp.setNext(null);
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
	
	public void reverse()
	{
		node p, q, r;
		p=head;
		q=p.getNext();
		
		while(q!=null)
		{
			r=q.getNext();
			q.setNext(p);
			p=q;
			q=r;
		}
		head.setNext(null);
		head=p;
	}
	
	

	
	
}
	
	
	
	
	
	



package day2;

public class SCLL {
	private node head;
	private node tail;
	
	public SCLL()
	{
		this.head=null;
		this.tail=null;
	}
	
	public node getHead()
	{
		return head;
	}
	
	public void setHead(node head)
	{
		this.head=head;
	}
	
	public node getTail()
	{
		return tail;
	}
	
	public void setTail(node tail)
	{
		this.tail=tail;
	}
	
	public void insertAtBeg(int ss)
	{
		node nn = new node(ss);
		
		if(head==null)
		{
			head=tail=nn;
			nn.setNext(head);
		}
		else
		{
			nn.setNext(head); 
			head=nn;
			tail.setNext(head);
		}
	}
	
	public void insertAtLast(int ss)
	{
		node nn = new node(ss);
		node temp = head;
		
		if(head==null)
			{
				head=tail=nn;
				nn.setNext(head);
			}
		else
		{
			while(temp.getNext()!=head)
			{
				temp=temp.getNext();
			}
			temp.setNext(nn);
			nn.setNext(head);
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
//				nn.setNext(head);
//				tail.setNext(nn);
//				tail=nn;
				System.out.println("invalid position");
				return true;
			}
	
			nn.setNext(temp.getNext());
			temp.setNext(nn);
			return true;
			
			}
		}
		
//		public boolean deleteAtPos(int pos)
//		{
//			if(head==null)
//			{
//				return false;
//			}
//			
//			if(pos<=0)
//			{
//				System.out.println("Enter position greater than zero");
//				return false;
//			}
//			
//			if(pos==1)
//			{
//				deleteAtFirst();
//				return true;
//			}
//			else
//			{
//				node temp= head;
//				
//				int i=1;
//				while(i<pos-1 && temp!= null)
//				{
//					temp=temp.getNext();
//					++i;
//				}
//				
//				if(temp==null)
//				{
//					System.out.println("invalid position null");
//					return false;
//				}
//		        node t=temp.getNext();
//			    temp.setNext(t.getNext());
//			    t.setNext(null);
//			    return true;
//			}
//		}
//		
//	
//	
//	
//	public void deleteAtLast()
//	{
//		node temp = head;
//		
//		if(temp!=null)
//		{
//			while(temp.getNext().getNext()!=null)
//			{
//				temp=temp.getNext();
//			}
//			temp.setNext(null);
//		}
//	}
//	
//	public void deleteAtFirst()
//	{
//		node temp = head;
//		if(temp!=null)
//		{
//			if(temp.getNext()==null)
//			{
//				head=null;
//			}
//			else
//			{
//				head=temp.getNext();
//			}
//		}
//	}
//	
//	public void search(int ss)
//	{
//		node temp = head;
//		int index=0;
//		
//		while(temp!=null)
//		{
//			++index;
//			if(ss==temp.getData())
//			{
//				System.out.println("\n" +ss+" is found at position "+index);
//				break;
//			}
//		temp=temp.getNext();
//		}
//	}
//	
	public void display()
	{
		node temp = head;
		
		System.out.println("Array Elements are- \n");
		while(temp.getNext()!=head)
		{
			System.out.print( temp.getData()+"\t");
			temp=temp.getNext();
		}
		System.out.print( temp.getData()+"\t");
		
	}
	
//	public void reverse()
//	{
//		node p, q, r;
//		p=head;
//		q=p.getNext();
//		
//		while(q!=null)
//		{
//			r=q.getNext();
//			q.setNext(p);
//			p=q;
//			q=r;
//		}
//		head.setNext(null);
//		head=p;
//	}
//	
	

	
	
}
	
	
	
	
	
	




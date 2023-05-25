package DynamicStack;

public class DynamicStack {
	
	private node top;
	
	public DynamicStack()
	{
		this.top=null;
	}
	
	public node getTop()
	{
		return top;
	}
	
	public void setTop(node top)
	{
		this.top=top;
	}
	
	public boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		return false;
	}
	
	public void push(int val)
	{
		node nn = new node(val);
		if(isEmpty())
		{
			top=nn;
			return;
		}
		
		nn.setPrev(top);
		top=nn;
		
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow can't pop" );
			return;
		}
		
		node temp=top;
		top=top.getPrev();
		System.out.println("Popped element is " +temp.getData());
		temp.setPrev(null);
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow can't peek" );
			return;
		}
		System.out.println("Top element is " +top.getData());
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow can't display" );
			return;
		}
		
		node temp;
		System.out.println("Stack elements are" );
		for(temp= top; temp.getPrev()!=null; temp=temp.getPrev())
		{
			System.out.println(temp.getData());
		}
		System.out.println(temp.getData());
	}

}

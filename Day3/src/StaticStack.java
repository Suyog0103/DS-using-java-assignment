
public class StaticStack {
	int data[];
	int top;
	
	public StaticStack(int size)
	{
		data= new int[size];
		top = -1;
	}
	
	public int getTop()
	{
		return top;
	}

	public void setTop(int top)
	{
		this.top = top;
	}
	
	public boolean isEmpty()
	{
		if (top==-1)
		{
			System.out.println("Stack is empty/underflow");
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==data.length-1)
		{
			System.out.println("Stack is Full");
			return true;
		}
		return false;
	}
	
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("Stack is Full can't push");
			return;
		}
		
		data[++top]=value;
		
	}

		
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty can't pop");
			return -1;
		}
		
		return (data[top--]);
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty can't peek");
			return;
		}
		
		System.out.println("Topmost value is "+data[top]);
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty can't display");
			return;
		}
	
		System.out.println("Stack elements are");
		for(int i=top;i>=0;--i)
		{
			System.out.println(data[i]);
		}
			
	}
}
package DynamicStack;

public class node {
	
	private int data;
	private node prev;
	
	public node(int data)
	{
		this.data=data;
		prev=null;
	}
	
	public int getData()
	{
		return data;
	}
	
	public void setData(int data)
	{
		this.data=data;
	}
	
	public node getPrev()
	{
		return prev;
	}
	
	public void setPrev(node prev)
	{
		this.prev=prev;
	}
}

package DynamicStack;

public class test {
	
	public static void main(String [] args)
	{
		DynamicStack ds = new DynamicStack();
		
		ds.push(10);
		ds.push(11);
		ds.push(12);
		ds.push(13);
		ds.push(14);
		
//		ds.pop();
//		ds.pop();
		
		ds.peek();
		ds.display();
	}

}


public class Test {
	
	public static void main(String args[])
	{
		StaticStack ss= new StaticStack(5);
		
		ss.push(5);
		ss.push(6);
		ss.push(7);
		ss.push(8);
		ss.push(9);
		ss.push(11);
		
//		ss.pop();
//		
//		ss.peek();
		ss.display();
	}
}

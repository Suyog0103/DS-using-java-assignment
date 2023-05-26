package DynamicLinearQ;

public class test {
	public static void main(String[] args)
	{
		DynamicLinearQ ss= new DynamicLinearQ();
		
		ss.enque(5);
		ss.enque(6);
		ss.enque(7);
		ss.enque(8);
		ss.enque(9);
		ss.enque(10);
		
		ss.peek();
		ss.display();
		
		ss.deque();
		ss.deque();
		
		ss.peek();
		ss.display();
	}
}

package CircularDynamicQ;

public class Test {

	public static void main(String[] args) {
		CircularDynamicQ ss= new CircularDynamicQ();
		
		ss.enque(5);
		ss.enque(6);
		ss.enque(7);
		ss.enque(8);
		ss.enque(9);
		ss.enque(10);
		
		ss.peek();
		ss.display();
		
		int v=ss.deque();
		System.out.println("D Q Element is " +v);
		int v1=ss.deque();
		System.out.println("D Q Element is " +v1);
		
		ss.peek();
		ss.display();

	}

}

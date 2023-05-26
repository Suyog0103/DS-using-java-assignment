package CircularStaticQ;

public class test {

	public static void main(String[] args) {
		CircularStaticQ ss = new CircularStaticQ(5);
		
		ss.enque(5);
		ss.enque(6);
		ss.enque(7);
		ss.enque(8);
		ss.enque(9);
		ss.enque(10);
		
		ss.peek();
		ss.display();
		
		int v=ss.deque();
		System.out.println("\nde q element is "+v);
		int v1=ss.deque();
		System.out.println("\nde q element is "+v1);
		
		ss.peek();
		ss.display();

	}

}

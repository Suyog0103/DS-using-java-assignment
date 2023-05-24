package list;

public class test {

	public static void main(String[] args) {
		SLLL suyog = new SLLL();
//		suyog.insertAtBeg(49);
//		suyog.insertAtBeg(8);
//		suyog.insertAtBeg(99);
//		suyog.insertAtBeg(20);
//		suyog.insertAtBeg(36);
//		suyog.insertAtBeg(15);
		
		suyog.insertAtLast(15);
		suyog.insertAtLast(16);
		suyog.insertAtLast(17);
		suyog.insertAtLast(18);
		suyog.insertAtLast(19);
		
		suyog.display();
		
//		suyog.deleteAtLast();
//		suyog.deleteAtLast();
		
//		suyog.deleteAtFirst();
//		suyog.deleteAtFirst();

//		suyog.search(19);
		
//		suyog.reverse();	
		
	//	suyog.insertAtPos(60,3);
		suyog.deleteAtPos(2);
		suyog.display();
	}

}

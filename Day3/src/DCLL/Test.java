
public class Test {
	public static void main(String[] args) {
		
		DCLL dc = new DCLL();
		
//		dc.insertAtBeg(11);
//		dc.insertAtBeg(12);
//		dc.insertAtBeg(13);
//		dc.insertAtBeg(14);
		
		dc.insertAtLast(21);
		dc.insertAtLast(22);
		dc.insertAtLast(23);
		dc.insertAtLast(24);
		dc.insertAtLast(25);
		dc.insertAtLast(26);
		dc.insertAtLast(27);
		dc.forwardDisplay();
		
//		dc.deleteAtBeg();
//		dc.deleteAtBeg();
//		dc.deleteAtBeg();
		
//		dc.deleteAtLast();
//		dc.deleteAtLast();
//		dc.deleteAtLast();
		
		// dc.deleteAtPos(7);
		
//		dc.insertAtPos(5, 6);
	//	dc.insertAtPos(69,7);

		// dc.reverse();

		dc.circularity(100);
		
		// dc.forwardDisplay();
//		dc.backwardDisplay();
	}
}
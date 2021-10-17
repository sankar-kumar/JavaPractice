package DataStructurePractice;

public class LinkedListRunner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(55);
		list.insert(78);
		list.insert(95);
		list.insertAt(2,99);
		list.insertAtStart(100);
		list.insertAt(0, 130);
		list.deleteAt(2);
		
		list.show();
	}
}

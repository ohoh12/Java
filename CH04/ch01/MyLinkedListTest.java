package ch01;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		
		list.insertElement(1, "D");
		list.printAll();
	}

}

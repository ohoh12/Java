package ch13;

public class BookArrTest {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0] = new Book("�ﱹ��1", "ħ����", 12000);
		library[1] = new Book("�ﱹ��2", "ħ����", 12000);
		library[2] = new Book("�ﱹ��3", "ħ����", 12000);
		library[3] = new Book("�ﱹ��4", "ħ����", 12000);
		library[4] = new Book("�ﱹ��5", "ħ����", 12000);
		
		for(Book book : library) {
			book.showInfo();
			System.out.println("==============================");
		}
	}
}

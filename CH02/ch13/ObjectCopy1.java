package ch13;

public class ObjectCopy1 {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�ﱹ��1", "ħ����", 12000);
		library[1] = new Book("�ﱹ��2", "ħ����", 12000);
		library[2] = new Book("�ﱹ��3", "ħ����", 12000);
		library[3] = new Book("�ﱹ��4", "ħ����", 12000);
		library[4] = new Book("�ﱹ��5", "ħ����", 12000);
		
		
		copyLibrary[0] = new Book("�ﱹ��1", "ħ����", 12000);
		copyLibrary[1] = new Book("�ﱹ��2", "ħ����", 12000);
		copyLibrary[2] = new Book("�ﱹ��3", "ħ����", 12000);
		copyLibrary[3] = new Book("�ﱹ��4", "ħ����", 12000);
		copyLibrary[4] = new Book("�ﱹ��5", "ħ����", 12000);
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		copyLibrary[0].setAuthor("�������丮");
		copyLibrary[0].setName("�����");
		
		for(Book book : library) {
			book.showInfo();
			System.out.println("==============================");
		}
		System.out.println("***************************");
		for(Book book : copyLibrary) {
			book.showInfo();
			System.out.println("==============================");
		}

	}

}

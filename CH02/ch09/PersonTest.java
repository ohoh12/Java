package ch09;

public class PersonTest {
	
	String name;
	int age;
	
	public PersonTest() {
		this("�̸�����", 1);
	}
	
	public PersonTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public PersonTest getPerson() {
		return this;
	}
	public static void main(String[] args) {
		
		PersonTest p = new PersonTest();
		PersonTest p2;
		System.out.println(p);
		p2 = p.getPerson();
		System.out.println(p2);
		
	}

}

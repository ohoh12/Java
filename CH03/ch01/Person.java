package ch01;

public class Person extends Mammalia{
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public void drive() {
		System.out.println(name+"�� ���� �������Դϴ�.");
	}
}

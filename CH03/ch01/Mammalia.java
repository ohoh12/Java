package ch01;

public class Mammalia {
	protected String name;
	protected String address;
	
	public void walk(String leg) {
		System.out.println(name+"�� "+leg+"�� �Ȱ��ֽ��ϴ�.");
	}
	
	public void showInfo() {
		System.out.println("�̸��� "+name+"�̰� ��� ����"+address+"�Դϴ�.");
	}
}

package ch02;

public class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected double bonusPoint;
	protected double bonusRatio;
	protected double salesRatio;
	protected static int number= 100;
	
	public Customer() {}
	public Customer(String name) {
		this.name = name;
		this.salesRatio = 0;
		this.bonusRatio = 0.01;
		this.grade ="silver";
		this.id = number++;
		this.bonusPoint = 10;
		
	}
	public void calcPrice(int price) {
		
		System.out.println(price+"������ ���Ž� "+(price-(int)(price*salesRatio))+"���� �����մϴ�.");
		System.out.println("������"+(int)price*bonusRatio+"�� �����˴ϴ�.");
	}
	public void showInfo() {
		System.out.println(name+"���� �����"+grade+"�̰� "+name+"���� �������� "+salesRatio+"% ���ʽ��� "+bonusRatio+"% �̰� ���ʽ�����Ʈ"+bonusPoint+"% �̴�");
		
	}
}

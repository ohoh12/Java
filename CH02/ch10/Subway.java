package ch10;

public class Subway {
	private int number;
	private int money;
	private int passengerCount;
	
	public Subway(int number) {
		this.number = number;
		
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(number+"�� ����ö�� �°�����"+passengerCount+"�̰�, ���� ����"+money+"�Դϴ�.");
	}
}

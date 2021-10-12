package ch10;

public class Bus {
	private String number;
	private int money;
	private int passengerCount;
	
	
	public Bus(String number) {
		this.number = number;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(number+"�� ������ �°�����"+passengerCount+"�̰�, ���� ����"+money+"�Դϴ�.");
	}
}

package ch10;

public class Gasstation {
	private int money;
	private String address;
	private int gasAccount;
	
	public Gasstation(String address) {
		this.address = address;
		gasAccount = 10;
	}
	
	public int oiling(int liter) {
		this.gasAccount -= liter;
		this.money += liter*6000;
		return liter*6000;
	}
	public void showInfo() {
		System.out.println(address+"���� �������� ���� �⸧�� "+gasAccount+"���� �̰� ���� ���� "+money+"�Դϴ�.");
	}
}

package ch04;

public abstract class Computer {
	protected abstract void display();
	protected abstract void typing();
	
	public void turnOn() {
		System.out.println("��ǻ�͸� ŵ�ϴ�.");
		
	}
	public void turnOff() {
		System.out.println("��ǻ�͸� ���ϴ�.");
	}
}

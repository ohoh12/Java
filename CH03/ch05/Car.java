package ch05;

public abstract class Car {
	public void startCar() {
		System.out.println("�극��ũ�� ����ϴ�.");
		System.out.println("�õ��� �̴ϴ�.");
	}
	public void turnOff() {
		System.out.println("�극��ũ�� ����ϴ�.");
		System.out.println("�õ��� ���ϴ�.");
	}
	public abstract void drive();
	public abstract void stop();
	
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

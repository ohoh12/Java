package ch05;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("������ P->D");
		System.out.println("�׼��� ����ϴ�.");
		System.out.println("�ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ����ϴ�.");
		System.out.println("������ D->P");
		System.out.println("���̵�극��ũ�� �̴ϴ�.");
	}
	
}

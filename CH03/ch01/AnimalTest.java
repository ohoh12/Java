package ch01;

public class AnimalTest {
	public static void main(String[] args) {
		Person choi = new Person("choi", "gangseogu");
		Tiger bat = new Tiger("bat", "gangseogu");
		
		choi.walk("두 발");
		choi.drive();
		choi.showInfo();
		
		bat.walk("네 발");
		bat.hunt();
		bat.showInfo();
	}
}

package ch07;

public class studentTest {
	public static void main(String[] args) {
		student choi = new student(100, "choi");
		student kim = new student(101, "kim");
		
		choi.setKoreanScore("����", 100);
		choi.setmathScore("����", 100);
		
		kim.setKoreanScore("����", 90);
		kim.setmathScore("����", 95);
		
		
		choi.showStudentScore();
		kim.showStudentScore();
		
		
	}
}

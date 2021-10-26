package ch14;

import java.util.ArrayList;

public class Student {
	private int number;
	private String name;
	private ArrayList<Subject> subjects;
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
		
		subjects = new ArrayList();
			
	}
	public void addSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject(subjectName, subjectScore);
		subjects.add(subject);
	}
	
	public void showInfo() {
		int sum = 0;
		for(Subject s : subjects) {
			System.out.println(name+"�л���"+s.getSubjectName()+"�� ������"+s.getSubjectScore()+"�Դϴ�");
			sum += s.getSubjectScore();
		}
		System.out.println("�� ����"+sum+"�Դϴ�.");
		
	}
}

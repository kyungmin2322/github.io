package org.javaro.lecture;

public class Midterm {
	public static void main(String[] args) {
		Student stud1 = new Student("2019001", "홍길동", 3);
		stud1.exam[0].setExamScore("자바", 88);
		stud1.exam[1].setExamScore("C", 91);
		stud1.exam[2].setExamScore("C++", 92);
		stud1.printGPA();
	}
}

package org.javaro.lecture;

public class Student {
	String Num, Name;
	int Class;
	Exam [] exam;
	public Student(String Num, String Name,  int Class) {
		this.Num = Num;
		this.Name = Name;
		exam = new Exam[Class];
		for(int i = 0; i < exam.length; i++) {
			exam[i] = new Exam(); }
	}
	public void setNum(String Num) { this.Num = Num; }
	public void setName(String Name) { this.Name = Name; }
	public String getName() { return this.Name; }
	
	public int getGPA() { 
		int sum = 0;
		for(int i = 0; i < exam.length; i++) sum = sum + this.exam[i].getScore();
		return sum;
	}
	public void printGPA() {
		for(int i = 0; i < exam.length; i++)
			System.out.println(this.exam[i].getClassName() + this.exam[i].getScore());
		System.out.println("합계 = " + this.getGPA()); }
}

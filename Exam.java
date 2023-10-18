package org.javaro.lecture;

public class Exam {
	String ClassName;
	int Score;
	
	public void setClassName(String ClassName) {
		this.ClassName = ClassName; }
	public String getClassName() {
		return this.ClassName; }
	public void setScore(int Score) {
		this.Score = Score; }
	public int getScore() {
		return this.Score; }
	public void setExamScore(String ClassName, int Score) {
		this.ClassName = ClassName;
		this.Score = Score; }
}

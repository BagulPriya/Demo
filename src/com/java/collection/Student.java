package com.java.collection;

public class Student {
	private int studentid;
	private String name;
	private int marks;

	public Student(){

	}
	public Student(int studentid, String name, int marks){
		this.studentid = studentid;
		this.name = name;
		this.marks=marks;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student {" +
				"studentid=" + studentid +
				", name='" + name + '\'' +
				", marks=" + marks +
				'}';
	}
}

package com.java.service;

import com.java.collection.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_Service_Implemention implements Student_Interface{

	@Override
	public List<Student> getStudentsListFromUser() {
		Scanner sc = new Scanner(System.in);
		int i=100;
		List<Student> studentList = new ArrayList<>();

		while(true){
			Student student = new Student();
			System.out.println("Enter student name :");
			student.setName(sc.next());
			System.out.println("Enter student marks");
			student.setMarks(sc.nextInt());
			student.setStudentid(i);

			studentList.add(student);

			System.out.println("Do you want to add more student [Yes|No] :: ");
			if(!sc.next().equalsIgnoreCase("Yes")){
				break;
			}
			i++;
		}
		return studentList;
	}

	@Override
	public void printStudentList(List<Student> studentList) {

		for(Student s1: studentList){
			System.out.println(s1);  //System.out.println(s1.toString());
		}
	}

	@Override
	public Student getMaxMarkStudentFromUserList(List<Student> studentList) {
		Student maxMarkStudent=null;

		for(Student s:studentList){
			if(maxMarkStudent==null){
				maxMarkStudent =s;
			}
			else if (s.getMarks() > maxMarkStudent.getMarks()){
				maxMarkStudent =s;
			}
		}

		return maxMarkStudent;
	}

	@Override
	public Student getMinMarkStudentFromUserList(List<Student> studentList) {
		Student minMarkStudent=null;

		for(Student s:studentList){
			if(minMarkStudent==null){
				minMarkStudent=s;
			} else if (s.getMarks() < minMarkStudent.getMarks()) {
				minMarkStudent=s;

			}
		}
		return minMarkStudent;
	}
	public Student FindStudentByName(List<Student> studentList,String name){
		for(Student s: studentList){
			if(s.getName().equalsIgnoreCase(name)){
				return s;
			}
		}
		return null;
	}
}

package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		Student rishi = new Student(1,"Rushi",50);
		Student priyanka = new Student(2,"Priyanka",40);
		Student pankaj = new Student(3,"Pankaj",50);

		List<Student> studentList = new ArrayList<>();
		studentList.add(rishi);
		studentList.add(priyanka);
		studentList.add(pankaj);

		System.out.println(studentList.size());

		for(int i=0 ; i<studentList.size() ; i++){
			Student s = studentList.get(i);
			System.out.println(s.getName());
		}

		for(Student s : studentList){
			System.out.println(s.getName());
		}



	}
}

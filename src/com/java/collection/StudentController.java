package com.java.collection;

import com.java.service.Student_Interface;
import com.java.service.Student_Service_Implemention;

import java.util.List;

public class StudentController {
	public static void main(String[] args) {

		Student_Interface studentService = new Student_Service_Implemention();
        //interface name, object name=implementation name
		List<Student> studentList= studentService.getStudentsListFromUser();
		studentService.printStudentList(studentList);
		//function to find max mark student
		Student maxMarkStudent = studentService.getMaxMarkStudentFromUserList(studentList);

		System.out.println("Max Marks received "+maxMarkStudent);

		//function to find min mark student
		Student minMarkStudent = studentService.getMinMarkStudentFromUserList(studentList);

		System.out.println("Min Marks received "+minMarkStudent.toString());

		Student student= studentService.FindStudentByName(studentList,"xyz");
		System.out.println("searched student is " + student);
		}

}

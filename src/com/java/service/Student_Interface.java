package com.java.service;

import com.java.collection.Student;

import java.util.List;

public interface Student_Interface {
	List<Student> getStudentsListFromUser();
	void printStudentList(List<Student> studentList);
	Student getMaxMarkStudentFromUserList(List<Student> studentList);
	Student getMinMarkStudentFromUserList(List<Student> studentList);
	Student FindStudentByName(List<Student> studentList,String name);

}

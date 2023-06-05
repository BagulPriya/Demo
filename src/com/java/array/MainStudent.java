package com.java.array;

public class MainStudent {
	public static void main(String[] args) {
		Student pankaj=new Student("Pankaj",1);
		Student ana=new Student("Ana",2);
		Student ava=new Student("Ava",3);

		Student[] studentsArray=new Student[]{pankaj,ana,ava};
//		for(Student s :studentsArray){
//			if(s.getName().equalsIgnoreCase("ana")){
//				System.out.println(s);
//	        }
//		}

		for(int i=0;i< studentsArray.length;i++){
			Student s=studentsArray[i];
			if(s.getName().equalsIgnoreCase("PANKAJ")){
				System.out.println(s);
			}
		}
	}
}

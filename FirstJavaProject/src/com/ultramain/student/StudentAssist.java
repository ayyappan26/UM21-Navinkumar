package com.ultramain.student;

import java.util.Scanner;

public class StudentAssist{
	private Scanner scan;
	public Student getStudentDetail(Student student){
		Student mystudent=null;
		if(student==null){
			mystudent=new Student();
		}
		else{
			mystudent=student;
		}
		scan = new Scanner(System.in);
		System.out.println("Enter Student ID:");
		mystudent.setStuId(scan.nextInt());
		System.out.println("Enter Student Name:");
		mystudent.setStuName(scan.next());
		System.out.println("Enter Student Department:");
		mystudent.setStuDept(scan.next());
		return mystudent;
	}
	public void printStudentDetails(Student student){
		if(student!=null){
			System.out.println("Student ID   :"+student.getStuId());
			System.out.println("Student Name :"+student.getStuName());
			System.out.println("Student ID:"+student.getStuDept());
			
		}
	}
}
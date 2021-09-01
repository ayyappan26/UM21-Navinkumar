package com.ultramain.student;

public class StudentTest{
	public static void main(String arg[]){
		Student mystudent=new Student();
		StudentAssist sAssit=new StudentAssist();
		mystudent=sAssit.getStudentDetail(mystudent);
		sAssit.printStudentDetails(mystudent);
	}
}
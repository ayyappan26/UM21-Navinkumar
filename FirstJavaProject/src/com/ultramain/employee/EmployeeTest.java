package com.ultramain.employee;

public class EmployeeTest{
	public static void main(String arg[]){
		Employee emp=new Employee();
		EmployeeDTO empdto[]=emp.getUserDetails();
		emp.printEmployeeDetails(empdto);
	}
}
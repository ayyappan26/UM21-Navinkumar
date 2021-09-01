package com.ultramain.employee;

import java.util.Scanner;

public class Employee {
	public EmployeeDTO[] getUserDetails(){
		Scanner scan=EmployeeInput.getscannerInstance();
		System.out.println("Enter the number of Employee");
		int size=scan.nextInt();
		 EmployeeDTO employeeDTO[]=new EmployeeDTO[size];
		 EmployeeDTO empdto=null;
		for(int i=0;i<size;i++){
			empdto=new EmployeeDTO();
			System.out.println("Enter the detail of Employee:"+(i+1));
			System.out.println("Enter the Employee ID  :");
			empdto.setEmpId(scan.nextInt());
			System.out.println("Enter the Employee Name  :");
			empdto.setEmpName(scan.next());
			System.out.println("Enter the Employee Salary  :");
			empdto.setSalary(scan.nextDouble());
			System.out.println("Enter the Employee Department :");
			empdto.setEmpDept(scan.next());
			employeeDTO[i]=empdto;	
		}
		return employeeDTO;
	}
	public void printEmployeeDetails(EmployeeDTO[] empdetail){
		System.out.println("Employee Details");
		EmployeeDTO empdto=null;
		for(int i=0;i<empdetail.length;i++){
			empdto=empdetail[i];
			System.out.println("Employee Detail     :"+(i+1));
			System.out.println("Employee ID         :"+empdto.getEmpId());
			System.out.println("Employee Name       :"+empdto.getEmpName());
			System.out.println("Employee Salary     :"+empdto.getSalary());
			System.out.println("Employee Department :"+empdto.getEmpDept());
			System.out.println("-----------------------------");
		}
		
	}

}

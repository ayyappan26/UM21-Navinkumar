package project.employee.bo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import project.employee.department.EmployeeIDAO;
import project.employee.departmentselect.AbstractDepartment;
import project.employee.dto.EmployeeDto;
import project.employee.utility.Scan;

public class EmployeeBo {
	public void selection(){
	System.out.println("1. To view specific department Employee");
	System.out.println("2. To view all department Employees");
	Scanner b=Scan.getScannerInstance();
	int a=b.nextInt();
	switch(a){
	case 1:
		viewEmployee();
		break;
	case 2:
		viewAllEmployee();
		break;
	case 3:
		return;
	}
	
	}
	public void viewEmployee(){
		System.out.println("Enter the department Name : ");
		Scanner scan = Scan.getScannerInstance();
		String department =scan.next();
		ArrayList<EmployeeDto>emplist= null;
		AbstractDepartment depart=AbstractDepartment.getDepartment(1);
		EmployeeIDAO idao=depart.getDao();
		try{
			emplist=idao.viewEmployeeByDepart(department);
			if(!emplist.isEmpty()){
				for(EmployeeDto empDto : emplist){
					System.out.println("Employee Id: " + empDto.getEmployeeId());
					System.out.println("First Name : " + empDto.getFirstName());
					System.out.println("Last Name : " + empDto.getLastName());
					System.out.println("Salary : " + empDto.getSalary());
					System.out.println("Department Id :" + empDto.getDepartmentId());
					System.out.println("----------------------------------------------");
				}
		}
	}catch(SQLException e){
		System.out.println(e.getMessage());
	}
	
		
}
	public void viewAllEmployee(){
		AbstractDepartment depart=AbstractDepartment.getDepartment(1);
		EmployeeIDAO idao=depart.getDao();
		HashMap<Integer,ArrayList<EmployeeDto>> resultMap=null;
		ArrayList<EmployeeDto> emplist=null;
		try{
			resultMap=idao.viewAllEmployeeByDepart();
			System.out.println("Enter Department ID :");
			Scanner scan=Scan.getScannerInstance();
			int deptid=scan.nextInt();
			emplist=resultMap.get(deptid);
			if(!emplist.isEmpty()){
				for(EmployeeDto empDto : emplist){
					System.out.println("Employee Id: " + empDto.getEmployeeId());
					System.out.println("First Name : " + empDto.getFirstName());
					System.out.println("Last Name : " + empDto.getLastName());
					System.out.println("Salary : " + empDto.getSalary());
					System.out.println("Department Id :" + empDto.getDepartmentId());
					System.out.println("----------------------------------------------");
				}
			}
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}

package assignment.employeemain;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.aircraft.utility.Scan;

public class EmployBo {
	public void selection(){
		int choice=0;
		Scanner scan =Scan.getScannerInstance();
		EmployDao dao=new EmployDao();
		do{
		System.out.println("1.Register Department");
		System.out.println("2.Register Employee");
		System.out.println("3.View Employee");
		System.out.println("4.Exit");
		System.out.println("Enter the choice :");
		choice=scan.nextInt();
		}while(choice==0);
		
		switch(choice){
		case 1:
			storeDepartmentDetails(dao);
			break;
		case 2:
			storeEmployeeDetails(dao);
			break;
		case 3:
			retriveEmployeeDetails(dao);
			break;
		case 4:
			return;
		}
	}
	private  void storeDepartmentDetails(EmployDao dao){
		try{
			EmployDto dto=getDepartDetails();
			dao.storeDepartmentDetails(dto);
	}catch(SQLException e){
		System.out.println(e.getMessage());
	}
		
	}
	private void storeEmployeeDetails(EmployDao dao){
		try{
			EmployDto dto=getEmployDetails();
			dao.storeEmployeeDetails(dto);
		}catch(SQLException e){
			System.out.println("Employee ID alreay exist");
		}catch(InputMismatchException i){
			System.out.println("Wrong entire");
		}//catch(SQLIntegrityConstraintViolationException j){
			//System.out.println("Employee ID already exist");
		//}
	}
	private void retriveEmployeeDetails(EmployDao dao){
		Scanner b=Scan.getScannerInstance();
		System.out.println("Enter the Employee ID :");
		int empid=b.nextInt();
		try{
		dao.retriveEmployeeDetail(empid);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
	private EmployDto getDepartDetails(){
		EmployDto dto=new EmployDto();
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter the Department ID");
		dto.setDepartId(scan.nextInt());
		System.out.println("Enter the Department Name");
		dto.setDepartName(scan.next());
		System.out.println("Enter the Department Head");
		dto.setDepartHead(scan.next());
		System.out.println("Enter the Department Description");
		dto.setDepartDescription(scan.next());
		return dto;
	}
	private EmployDto getEmployDetails(){
		EmployDto dto=new EmployDto();
		Scanner scan=Scan.getScannerInstance();
		System.out.println("Enter Employee ID :");
		dto.setEmployId(scan.nextInt());
		System.out.println("Enter the Employee Name :");
		dto.setEmployName(scan.next());
		System.out.println("Enter the Employee Address :");
		dto.setEmployAddress(scan.next());
		System.out.println("Enter the Salary :");
		dto.setEmploySalary(scan.nextFloat());
		System.out.println("Enter the Employee contact number");
		dto.setEmployContact(scan.nextInt());
		System.out.println("Enter the Employee Department ID :");
		dto.setDepartId(scan.nextInt());
		return dto;
	}
}

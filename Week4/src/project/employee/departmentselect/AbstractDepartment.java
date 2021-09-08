package project.employee.departmentselect;

import project.employee.department.EmployeeIDAO;

public  abstract class AbstractDepartment {
	public abstract EmployeeIDAO getDao();
	
	public static AbstractDepartment getDepartment(int choice){
		AbstractDepartment dep=null;
		
		switch(choice){
		case 1:
			dep=new OracleDepartment();
			break;
		case 2:
			dep=new SqlDepartment();
			break;
		case 3:
			dep=new FileSystemDepartment();
			break;
		}
		return dep;
	}

}

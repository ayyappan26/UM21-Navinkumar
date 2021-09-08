package project.employee.departmentselect;

import project.employee.department.EmployeeIDAO;
import project.employee.department.FileSystemEmpDao;

public class FileSystemDepartment extends AbstractDepartment {

	
	public EmployeeIDAO getDao() {
		return new FileSystemEmpDao();
	}

}

package project.employee.departmentselect;

import project.employee.department.EmployeeIDAO;
import project.employee.department.SqlEmpDao;

public class SqlDepartment extends AbstractDepartment{

	public EmployeeIDAO getDao() {
		return new SqlEmpDao();
	}

}

package project.employee.departmentselect;

import project.employee.department.EmployeeIDAO;
import project.employee.department.OracleEmpDao;

public class OracleDepartment extends AbstractDepartment{

	
	public EmployeeIDAO getDao() {
		return new OracleEmpDao();
	}

}

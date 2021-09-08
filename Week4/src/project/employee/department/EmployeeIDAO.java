package project.employee.department;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import project.employee.dto.EmployeeDto;

public  interface EmployeeIDAO {
	public ArrayList<EmployeeDto> viewEmployeeByDepart(String department) throws SQLException;
	public HashMap<Integer,ArrayList<EmployeeDto>> viewAllEmployeeByDepart() throws SQLException;

}

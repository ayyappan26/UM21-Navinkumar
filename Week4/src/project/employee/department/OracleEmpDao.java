package project.employee.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import project.data.DataConnect;
import project.employee.dto.EmployeeDto;

public class OracleEmpDao implements EmployeeIDAO {
	public ArrayList<EmployeeDto> viewEmployeeByDepart(String department) throws SQLException {
		ArrayList<EmployeeDto> emplist=null;
		boolean deptcheck=isDepartmentAvailable(department);
		if(deptcheck==true){
			int deptId = 0;
			deptId = getDeptID(department);
			emplist = getEmpDetails(deptId);
		}else{
			System.out.println("Invalid department name...");
		}
		return emplist;
		
	}
	private int getDeptID(String department) throws SQLException {
		int deptId = 0;
		Connection con = DataConnect.getDbConnection();
		String deptQuery = "select department_id from departments where lower(department_name) = lower(?)";
		PreparedStatement pst = con.prepareStatement(deptQuery);
		pst.setString(1, department);
		ResultSet deptResultSet = pst.executeQuery();
		
		while(deptResultSet.next()){
			deptId= deptResultSet.getInt(1);
		}
		return deptId;
	}
	private boolean isDepartmentAvailable(String department) throws SQLException{
		boolean status=false;
		Connection con=DataConnect.getDbConnection();
		String deptQuery= "SELECT COUNT(department_id) FROM departments WHERE lower(department_name) = lower(?)";
		PreparedStatement pst=con.prepareStatement(deptQuery);
		pst.setString(1, department);
		ResultSet deptResult=pst.executeQuery();
		while(deptResult.next()){
			int count=deptResult.getInt(1);
			if(count!=0){
				status=true;
			}
		}
		return status;
		
	}
	private ArrayList<EmployeeDto> getEmpDetails(int deptId) throws SQLException{
		ArrayList<EmployeeDto> emplist=new ArrayList<>();
		Connection con=DataConnect.getDbConnection();
		String query="SELECT employee_id, first_name,last_name,salary,department_id FROM employees WHERE department_id = ?";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, deptId);
		ResultSet deptResultSet = pst.executeQuery();
		while(deptResultSet.next()){
			EmployeeDto empDto  = new EmployeeDto();
			empDto.setEmployeeId(deptResultSet.getInt(1));
			empDto.setFirstName(deptResultSet.getString(2));
			empDto.setLastName(deptResultSet.getString(3));
			empDto.setSalary(deptResultSet.getFloat(4));
			empDto.setDepartmentId(deptResultSet.getInt(5));
			emplist.add(empDto);
		}
	
	return emplist;
		
	}

	
	public HashMap<Integer,ArrayList<EmployeeDto>> viewAllEmployeeByDepart() throws SQLException {
		Connection con=DataConnect.getDbConnection();
		ArrayList<Integer> deptList=new ArrayList<>();
		HashMap<Integer,ArrayList<EmployeeDto>> empmap=new HashMap<>();
		String query="SELECT DISTINCT department_id FROM employees";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			deptList.add(rs.getInt(1));
			
		}
		for(int deptid:deptList){
			ArrayList<EmployeeDto> emplist=getEmpDetails(deptid);
			empmap.put(deptid,emplist);
		}
		return empmap;
	}
	

}

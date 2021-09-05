package project.employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sqlconnection.ConnectionTest;

public class EmployeeDAO {
	
	public void viewEmployees() throws SQLException{
		Connection con=ConnectionTest.getDbConnection();
		String sqlQuery="SELECT * FROM emp";
		PreparedStatement pst=con.prepareStatement(sqlQuery);
		ResultSet rs=pst.executeQuery();
		int employeeId;
		String firstName;
		String lastName;
		float salary;
		int mobileNo;
		String department;
		while(rs.next()){
			employeeId=rs.getInt(1);
			firstName=rs.getString(2);
			lastName=rs.getString(3);
			salary=rs.getFloat(4);
			mobileNo=rs.getInt(5);
			department=rs.getString(6);
			System.out.println("Employee ID         :"+employeeId);
			System.out.println("Employee First Name :"+firstName);
			System.out.println("Employee Last Name  :"+lastName);
			System.out.println("Employee Salary     :"+salary);
			System.out.println("Employee Moblie No. :"+mobileNo);
			System.out.println("Employee Department :"+department);
			System.out.println("------------------------------");
			}
		
	}
	public void registerEmployee(EmployeeDTO empdto) throws SQLException
	{
		Connection con=ConnectionTest.getDbConnection();
		String sql="INSERT INTO emp VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empdto.getEmployeeId());
		pst.setString(2, empdto.getFirstName());
		pst.setString(3, empdto.getLastName());
		pst.setFloat(4, empdto.getSalary());
		pst.setInt(5, empdto.getMobile());
		pst.setString(6, empdto.getDepartment());
		int rowsUpdated=pst.executeUpdate();
		System.out.println("Updated rows :"+rowsUpdated);
		
		
	}
}

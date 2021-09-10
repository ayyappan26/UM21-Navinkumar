package assignment.employeemain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project.data.DataConnect;

public class EmployDao {
	public void storeDepartmentDetails(EmployDto dto) throws SQLException{
		Connection con=DataConnect.getDbConnection();
		String sql="INSERT INTO depart VALUES(?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, dto.getDepartId());
		pst.setString(2, dto.getDepartName());
		pst.setString(3, dto.getDepartHead());
		pst.setString(4, dto.getDepartDescription());
		int rs=pst.executeUpdate();
		System.out.println("Updated row :"+rs);
	}
	public void storeEmployeeDetails(EmployDto dto) throws SQLException{
		Connection con=DataConnect.getDbConnection();
		String sql="INSERT INTO employ VALUES(?,?,?,?,?,?)";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,dto.getEmployId());
		pst.setString(2,dto.getEmployName());
		pst.setString(3, dto.getEmployAddress());
		pst.setFloat(4, dto.getEmploySalary());
		pst.setInt(5, dto.getEmployContact());
		pst.setInt(6, dto.getDepartId());
		int rs=pst.executeUpdate();
		System.out.println("Updated rows :"+rs);
	}
	public void retriveEmployeeDetail(int empid) throws SQLException{
		Connection con=DataConnect.getDbConnection();
		String sql="SELECT employ_id,employ_name,employ_address,employ_salary,employ_contact,depart_id FROM employ WHERE employ_id=?";
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1, empid);
		int employId;
		String employName;
		String employadd;
		float salary;
		int employContact;
		int departId;
		ResultSet rs=pst.executeQuery();
		while(rs.next()){
			employId=rs.getInt(1);
			employName=rs.getString(2);
			employadd=rs.getString(3);
			salary=rs.getFloat(4);
			employContact=rs.getInt(5);
			departId=rs.getInt(6);
			System.out.println("Employee ID :"+employId);
			System.out.println("Employee Name :"+employName);
			System.out.println("Employee Address :"+employadd);
			System.out.println("Employee Salary :"+salary);
			System.out.println("Employee Contact No. :"+employContact);
			System.out.println("Employee Department ID :"+departId);
			System.out.println("---------------------------------------");
		}
	}

}

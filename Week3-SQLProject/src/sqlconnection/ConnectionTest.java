package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public static void main(String arg[]){
		try{
		Connection con=getDbConnection();
		System.out.println(con);
		}catch(SQLException e){
			System.out.println("Caught Exception :"+e);
		}
	}
	public static Connection getDbConnection() throws SQLException {
		//Loading the driver 
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String userName = "system";
				String password = "password-1";
				Connection con = DriverManager.getConnection(url,userName,password);
				return con;
	}
	

}

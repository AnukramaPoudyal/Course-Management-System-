package studentCourseManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CourseFetchGUI 
{
	private String queryString2;
	Login1 l = new Login1();
	private ResultSet result;
	static protected int duration;
	public void DatabaseConnect(String URL, String email, String password)
	{
		
	}

	public void DatabaseConnect(String URL)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(URL,"root","");

			queryString2 = "SELECT Duration FROM Courses WHERE Course_Name = ?";
			
			PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			

			statement1.setString(1, Login1.course);
			result = statement1.executeQuery();

			result.next();
			
			duration = result.getInt("Duration");
				
			result.close();
			
			statement1.close();
			
			Connect.close();
		} catch (ClassNotFoundException a) {
			System.out.println(a);
		} catch (SQLException f) {
			System.out.println(f);
		}
	}
}

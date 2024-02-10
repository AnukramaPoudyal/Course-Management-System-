package studentCourseManagement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StudentsList
{
	static public String queryString2;
	private ResultSet result;
	static public Calendar now;
	static protected PreparedStatement statement1;
	static protected SimpleDateFormat dateFormat;
	static protected int cyear;
	static public int level;
	private ResultSet result2;
	protected java.util.Date date;
	static public String RD;
	static protected Connection Connect;
	static protected PreparedStatement statement;
	static protected String queryString;
	static public Calendar calendar;
	static private int id;
	static public int result1;
    static protected int mark;
	static protected int module1;
	static protected int module2;
	static protected int module3;
	static protected int module4;
	static protected int module5;
	static protected int module6;
	static protected int module7;
	static protected int module8;
	static protected int module9;
	static protected int module10;
	static protected int module12;
	static protected int module11;
	static protected int module13;
	static protected int module14;
	static protected int module15;
	static protected int module16;
	static protected int module17;
	static protected int module18;
	static protected int module19;
	static protected int module20;
	static protected int module21;
	static protected int module22;
	static protected int module23;
	static protected int module24;
	static protected int module25;
	static protected int module26;
	static protected int module27;
	static protected int module28;
	static protected int module29;
	static protected int module30;
	static protected int module31;
	static protected int module32;
	boolean z;
	private Calendar strorage;
	private Calendar storage;
	private int res;
	private String query;
	private String queryS;
	private ResultSet r;
	private Connection Connection;
	private PreparedStatement statement12;
	private ResultSet result100;
	private String queryString20;
	static protected int duration12;
	static protected int id1;
	static public String duration;
	static protected String course;
//	private char[]  ;

	

	int Database() {
	    for (int i = 1; i <= Database("jdbc:mysql://localhost:3306/records","root",""); i++) {
	    	try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

	            queryString = "SELECT Course, Registered_Date, Module1, Module2, Module3, Module4, Module5, Module6, Module7, Module8, Module9, Module10, Module11, Module12, Module13, Module14, Module15, Module16, Module17, Module18, Module19, Module20, Module21, Module22, Module23, Module24, Module25, Module26, Module27, Module28, Module29, Module30, Module31, Module32 FROM user WHERE id = ?";
	            
	            statement = Connect.prepareStatement(queryString);
	            
	            statement.setInt(1, i);
	            result = statement.executeQuery();

	            result.next();
	            
	            RD = result.getString("Registered_Date");
	            module1 = result.getInt("Module1");
	            module2 = result.getInt("Module2");
	            module3 = result.getInt("Module3");
	            module4 = result.getInt("Module4");
	            module5 = result.getInt("Module5");
	            module6 = result.getInt("Module6");
	            module7 = result.getInt("Module7");
	            module8 = result.getInt("Module8");
	            module9 = result.getInt("Module9");
	            module10 = result.getInt("Module10");
	            module11 = result.getInt("Module11");
	            module12 = result.getInt("Module12");
	            module13 = result.getInt("Module13");
	            module14 = result.getInt("Module14");
	            module15 = result.getInt("Module15");
	            module16 = result.getInt("Module16");
	            module17 = result.getInt("Module17");
	            module18 = result.getInt("Module18");
	            module19 = result.getInt("Module19");
	            module20 = result.getInt("Module20");
	            module21 = result.getInt("Module21");
	            module22 = result.getInt("Module22");
	            module23 = result.getInt("Module23");
	            module24 = result.getInt("Module24");
	            module25 = result.getInt("Module25");
	            module26 = result.getInt("Module26");
	            module27 = result.getInt("Module27");
	            module28 = result.getInt("Module28");
	            module29 = result.getInt("Module29");
	            module30 = result.getInt("Module30");
	            module31 = result.getInt("Module31");
	            module32 = result.getInt("Module32");
	            course = result.getString("Course");
	            
               queryString20 = "SELECT Duration FROM Courses WHERE Course_Name = ?";
	            
	            statement = Connect.prepareStatement(queryString20);
	            
	            statement.setString(1, course);
	            result = statement.executeQuery();

	            result.next();
                
	            duration = result.getString("Duration");

	            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	            
	            try {
					date = dateFormat.parse(RD);
				} catch (ParseException e) {
					e.printStackTrace();
				}
	            
	            Calendar calendar = Calendar.getInstance();
	            
	            calendar.setTime(date);	
	            
	            storage = calendar;
	            
	            now = Calendar.getInstance();
	            
	            calendar.add(Calendar.MONTH, 8);
	            
	            int[] marks = {module1,module2,module3, module4, module5, module6, module7, module8};
	            int count = 0;
	            int temp = 0;

		        for (int j = 0; j < marks.length; j++) 
		        {
		            if (marks[j] >= 40) 
		            {
		                count++;
		            }
		            if (count == 3) 
		            {
		            	temp = 1;
		            }
		            if (count >= 4)
		            {
		                break;
		            }
		        }
		        
		        int[] marks2 = {module9,module10,module11, module12, module13, module14, module15, module16};
                int count1 = 0;
                int temp1 = 0;

		        for (int j = 0; j < marks2.length; j++) 
		        {
		            if (marks2[j] >= 40) 
		            {
		                count1++;
		            }
		            if (count == 3) 
		            {
		            	temp1 = 1;
		            }
		            if (count1 >= 4) 
		            {
		                break;
		            }
		        }
		        
		        int[] marks3 = {module17,module18,module19, module20, module21, module22, module23, module24};
                int count2 = 0;
                int temp2 = 0;

		        for (int j = 0; j < marks3.length; j++) 
		        {
		            if (marks3[j] >= 40) 
		            {
		                count2++;
		            }
		            if (count == 3) 
		            {
		            	temp2 = 1;
		            }
		            if (count2 >= 4) 
		            {
		                break;
		            }
		        }
		        
		        int[] marks4 = {module25,module26,module27, module28, module29, module30, module31, module32};
                int count3 = 0;
                int temp3 = 0;

		        for (int j = 0; j < marks4.length; j++) 
		        {
		            if (marks4[j] >= 40) 
		            {
		                count3++;
		            }
		            if (count == 3) 
		            {
		            	temp3 = 1;
		            }
		            if (count3 >= 4) 
		            {
		                break;
		            }
		        }
		        
		        
		        if (duration == "1")
		        {
	            if (now.after(calendar) && temp == 1) 
		           {
	            	   String updateString = "UPDATE user SET Level = ? WHERE id = ?";
	                   statement = Connect.prepareStatement(updateString);
	                   statement.setInt(1, 7);
	                   statement.setInt(2, i);
	                   statement.executeUpdate();
		           }
		        }
		        
	            else if (duration == "2")
	            {
	            	if (now.after(calendar) && count >=4)
	            	{
	            		   String updateString1 = "UPDATE user SET Level = ? WHERE id = ?";
		                   statement = Connect.prepareStatement(updateString1);
		                   statement.setInt(1, 6);
		                   statement.setInt(2, i);
		                   statement.executeUpdate();
		                   calendar=storage; 
		                   calendar.add(Calendar.MONTH, 16); 
		                   
		                   if (now.after(calendar) && temp1 == 1)
		                   {
		                	   String updateString2 = "UPDATE user SET Level = ? WHERE id = ?";
			                   statement = Connect.prepareStatement(updateString2);
			                   statement.setInt(1, 7);
			                   statement.setInt(2, i);
			                   statement.executeUpdate();
		                   }
	            	}
	            }
		        
		        else if (duration == "3")
		        {
		        	if (now.after(calendar) && count >=4)
		        	{
		                String updateString3 = "UPDATE user SET Level = ? WHERE id = ?";
			            statement = Connect.prepareStatement(updateString3);
			            statement.setInt(1, 5);
			            statement.setInt(2, i);
			            statement.executeUpdate();
			            calendar=storage; 
			            calendar.add(Calendar.MONTH, 16);
		        	
			            if (now.after(calendar) && count1 >=4)
		                   {
		                	   String updateString4 = "UPDATE user SET Level = ? WHERE id = ?";
			                   statement = Connect.prepareStatement(updateString4);
			                   statement.setInt(1, 6);
			                   statement.setInt(2, i);
			                   statement.executeUpdate();
			                   calendar=storage; 
					           calendar.add(Calendar.MONTH, 24);
			                   
			                   if (now.after(calendar) && temp2 == 1)
			                   {
			                	   String updateString5 = "UPDATE user SET Level = ? WHERE id = ?";
				                   statement = Connect.prepareStatement(updateString5);
				                   statement.setInt(1, 7);
				                   statement.setInt(2, i);
				                   statement.executeUpdate();
				               }
		                   }
		        	}
		         }
		        else if (duration == "4")
		        {
		        	if (now.after(calendar) && count >=4)
		        	{
		                String updateString6 = "UPDATE user SET Level = ? WHERE id = ?";
			            statement = Connect.prepareStatement(updateString6);
			            statement.setInt(1, 4);
			            statement.setInt(2, i);
			            statement.executeUpdate();
			            calendar=storage; 
			            calendar.add(Calendar.MONTH, 16);
			            
			            if (now.after(calendar) && count1 >=4)
		                   {
		                	   String updateString7 = "UPDATE user SET Level = ? WHERE id = ?";
			                   statement = Connect.prepareStatement(updateString7);
			                   statement.setInt(1, 5);
			                   statement.setInt(2, i);
			                   statement.executeUpdate();
			                   calendar=storage; 
					           calendar.add(Calendar.MONTH, 24);
					           
					           if (now.after(calendar) && count2 >= 4)
			                   {
			                	   String updateString8 = "UPDATE user SET Level = ? WHERE id = ?";
				                   statement = Connect.prepareStatement(updateString8);
				                   statement.setInt(1, 6);
				                   statement.setInt(2, i);
				                   statement.executeUpdate();
				                   calendar=storage; 
						           calendar.add(Calendar.MONTH, 32);
				                   
						           if (now.after(calendar) && temp3 == 1)
				                   {
				                	   String updateString9 = "UPDATE user SET Level = ? WHERE id = ?";
					                   statement = Connect.prepareStatement(updateString9);
					                   statement.setInt(1, 7);
					                   statement.setInt(2, i);
					                   statement.executeUpdate();
				                   }
				               }
		                   }
		        	}
		        	else
		        	{
		        		System.out.println();
		        	}
			            
		        }
		                    
	            
	    
	           result.close();
	           statement.close();
	           Connect.close();

	        } catch (ClassNotFoundException a) {
	            System.out.println(a);
	        } catch (SQLException f) {
	            System.out.println(f);
	        }
	    
	    }
	            
	    return 0;
	}

	void Database(String username)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records",username,"");

			queryString2 = "UPDATE user SET Status = NULL WHERE Status = ?";
			
			PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			

			statement1.setString(1, "Last");
			result1 = statement1.executeUpdate();

			statement1.close();
			Connect.close();
		} catch (ClassNotFoundException a) {
			System.out.println(a);
		} catch (SQLException f) {
			System.out.println(f);
		}
	}
	
	public int Database(String URL, String username, String password)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection(URL ,username, password);

			queryString2 = "SELECT id FROM user WHERE Status = ?";
			
			PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			

			statement1.setString(1, "Last");
			result2 = statement1.executeQuery();
			
			result2.next();
            id = result2.getInt("id");
			
			result2.close();
			statement1.close();
			Connect.close();
		} catch (ClassNotFoundException a) {
			System.out.println(a);
		} catch (SQLException f) {
			System.out.println(f);
		}
		return id;
	}
	
	void DatabaseConnect(String username)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records",username,"");

			query = "UPDATE Courses SET Status = NULL WHERE Status = ?";
			
			PreparedStatement statement1 = Connect.prepareStatement(query);
			

			statement1.setString(1, "Last");
			statement1.executeUpdate();

			statement1.close();
			Connect.close();
		} catch (ClassNotFoundException a) {
			System.out.println(a);
		} catch (SQLException f) {
			System.out.println(f);
		}
	}
	
	public int DatabaseConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records" , "root", ",AbHiNaV@123");

			queryS = "SELECT id1 FROM Courses WHERE Status = ?";
			
			PreparedStatement statement1 = Connect.prepareStatement(queryS);
			 

			statement1.setString(1, "Last");
			r = statement1.executeQuery();
			
			r.next();
            id1 = r.getInt("id1");
			
			r.close();
			statement1.close();
			Connect.close();
		} catch (ClassNotFoundException a) {
			System.out.println(a);
		} catch (SQLException f) {
			System.out.println(f);
		}
		return id1;
	}
	
	void DatabaseConnect(String URL, String user)
	{Register r = new Register();
		
	    	try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection = DriverManager.getConnection(URL,user,"");
	            
	            String queryStr = "SELECT Duration FROM Courses WHERE Course_Name = ?";
                statement12 = Connection.prepareStatement(queryStr);
                statement12.setString(1, r.input2);
                statement12.executeQuery();
	            result100 = statement12.executeQuery();
	            result100.next();
                duration12 = result100.getInt("Duration");
	    	} catch (ClassNotFoundException a) {
				System.out.println(a);
			} catch (SQLException f) {
				System.out.println(f);
			}
		
	}

	
	public synchronized void waitMethod()
	{		
		StudentsList l = new StudentsList();
		while(true)
		{
			l.Database();
		try
		{
			this.wait(6000);
		}
		catch
		(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
		
	public static void main(String[] args) 
	{
		StudentsList l = new StudentsList();
		l.Database();
	}

}

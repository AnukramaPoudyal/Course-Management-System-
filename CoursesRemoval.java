package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoursesRemoval {

	private JFrame frame;
	private JTextField textField;
	static protected String temp;
	private JLabel lblCourseName;
	private JLabel lblCourseNot;
	private JLabel lblNewLabel;
	private JButton btnSubmit_1_1;
	protected String Course_Name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesRemoval window = new CoursesRemoval();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void delcourse() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesRemoval window = new CoursesRemoval();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoursesRemoval() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 436, 56);
		frame.getContentPane().add(panel_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-16, 23, 148, 23);
		panel_1.add(lblNewLabel_4);
		Image img = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(-202, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image1 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image1));
		
		JLabel lblDeleteCourses = new JLabel("DELETE COURSES");
		lblDeleteCourses.setForeground(new Color(116, 192, 67));
		lblDeleteCourses.setFont(new Font("Roboto", Font.BOLD, 30));
		lblDeleteCourses.setBackground(SystemColor.menu);
		lblDeleteCourses.setBounds(105, 92, 285, 23);
		frame.getContentPane().add(lblDeleteCourses);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(69, 66, 50, 49);
		frame.getContentPane().add(lblNewLabel_1);
		Image image2 = new ImageIcon(this.getClass().getResource("/marks.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image2));
		
		textField = new JTextField();
		textField.setFont(new Font("Roboto", Font.PLAIN, 15));
		textField.setBounds(28, 175, 386, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblCourseName = new JLabel("Course Name:");
		lblCourseName.setFont(new Font("Roboto", Font.BOLD, 15));
		lblCourseName.setBounds(28, 142, 107, 23);
		frame.getContentPane().add(lblCourseName);
		
		btnSubmit_1_1 = new JButton("Delete");
		btnSubmit_1_1.addActionListener(new ActionListener() {
			private ResultSet result;
			private String Course;
			private Object result10;

			public void actionPerformed(ActionEvent e) {
				
				temp = textField.getText();
				
				try 
				{
					lblNewLabel.setVisible(false);
					lblCourseNot.setVisible(false);
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "SELECT Course_Name FROM Courses WHERE Course_Name = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			     
			        statement1.setString(1, temp);
			        
			        result = statement1.executeQuery();
			        
			        if (result.next() && result.getString("Course_Name").equals(temp)) 
			        {
			        	Course_Name = result.getString("Course_Name");
						lblNewLabel.setVisible(true);
						System.out.println("Deleted !!!!");
						
					} 
			        else 
					{
			        	lblCourseNot.setVisible(true);					
			        }
			        
			        String queryString10 = "SELECT Status FROM Courses WHERE Course_Name = ?";
			           
			        statement1 = Connect.prepareStatement(queryString10);
			     
			        statement1.setString(1, Course_Name);
			        
			        result10 = statement1.executeQuery();
			        
			        if (result.next() && result.getString("Status").equals("Last")) 
			        {
						StudentsList list = new StudentsList();
						list.DatabaseConnect();
						String queryString11 = "UPDATE Courses SET Status = 'Last' WHERE id1 = ?";
				           
				        statement1 = Connect.prepareStatement(queryString11);
				     
				        statement1.setInt(1, (list.id1-1));
				        
				        result10 = statement1.executeQuery();
						
					} 
			        
			        String queryString = "DELETE FROM Courses WHERE Course_Name = ?";
			           
			        statement1 = Connect.prepareStatement(queryString);
			     
			        statement1.setString(1, temp);
			        
			        statement1.executeUpdate();
			        
			        String queryString3 = "DELETE FROM user WHERE Course = ?";
			           
			        statement1 = Connect.prepareStatement(queryString3);
			     
			        statement1.setString(1, temp);
			        
			        statement1.executeUpdate();
			        statement1.close();
			        Connect.close();
			        
			    } 
			    catch (ClassNotFoundException a) 
			    {
			        System.out.println(a);
			    }
			    catch (SQLException f) 
			    {
			        System.out.println(f);
			        if (f != null)
			        {
						lblCourseNot.setVisible(true);	        
			    	}
			    }
			}
		});
		
		btnSubmit_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1_1.setBounds(318, 279, 96, 21);
		frame.getContentPane().add(btnSubmit_1_1);
		
		lblNewLabel = new JLabel("** Deleted Successfully **");
		lblNewLabel.setVisible(false);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(116, 192, 67));
		lblNewLabel.setBounds(129, 243, 181, 13);
		frame.getContentPane().add(lblNewLabel);
		
		lblCourseNot = new JLabel("** Course not registered **");
		lblCourseNot.setVisible(false);
		lblCourseNot.setForeground(new Color(255, 0, 0));
		lblCourseNot.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblCourseNot.setBounds(126, 214, 209, 16);
		frame.getContentPane().add(lblCourseNot);
		
		JButton btnSubmit_1_1_1 = new JButton("<< Back");
		btnSubmit_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.Dashboard();
				CoursesRemoval del = new CoursesRemoval();
				del.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1_1_1.setBounds(10, 279, 96, 21);
		frame.getContentPane().add(btnSubmit_1_1_1);
				
	}
}
		


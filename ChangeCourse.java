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
import java.util.regex.Pattern;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeCourse {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private String queryS;
	private String text;
	private String text2;
	private ResultSet r;
	private JLabel lblNewLabel_2;
	private Component lblNewLabel_2_1_1;
	protected ResultSet result;
	protected String Course_Name;
	protected String querySt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeCourse window = new ChangeCourse();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void modulechange() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeCourse window = new ChangeCourse();
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
	public ChangeCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 611, 437);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDeleteChangeName = new JLabel("Rename Course");
		lblDeleteChangeName.setForeground(new Color(255, 128, 128));
		lblDeleteChangeName.setFont(new Font("Roboto", Font.BOLD, 30));
		lblDeleteChangeName.setBackground(SystemColor.menu);
		lblDeleteChangeName.setBounds(146, 29, 239, 36);
		frame.getContentPane().add(lblDeleteChangeName);
		
		JLabel lblNewLabel = new JLabel("From:");
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setBounds(33, 130, 62, 18);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(85, 130, 326, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblTo = new JLabel("To:");
		lblTo.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblTo.setBounds(33, 203, 62, 18);
		frame.getContentPane().add(lblTo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(85, 203, 326, 22);
		frame.getContentPane().add(textField_1);
				
		lblNewLabel_2 = new JLabel("** Course Changed **");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setForeground(new Color(116, 192, 67));
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(164, 258, 117, 13);
		frame.getContentPane().add(lblNewLabel_2);
	
		
		lblNewLabel_2_1_1 = new JLabel("** Unavailable Course / Atleast 3 letters for new Course **");
		lblNewLabel_2_1_1.setVisible(false);
		lblNewLabel_2_1_1.setForeground(Color.RED);
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(69, 235, 316, 13);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		
		JButton btnSubmit_1 = new JButton("Done");
		btnSubmit_1.addActionListener(new ActionListener() {
			private int res;
			private PreparedStatement statement2;

			public void actionPerformed(ActionEvent e) 
			{
				text = textField.getText();
				text2 = textField_1.getText();
                lblNewLabel_2.setVisible(false);
				lblNewLabel_2_1_1.setVisible(false);
				
				try 
				{
					
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "SELECT Course_Name FROM Courses WHERE Course_Name = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			     
			        statement1.setString(1, text);
			        
			        result = statement1.executeQuery();
			        
			        if (result.next() && result.getString("Course_Name").equals(text) && Pattern.matches("^[a-zA-Z ]{3,}$", text2)) 
			        {
			        	Course_Name = result.getString("Course_Name");
			        	lblNewLabel_2.setVisible(true);
						
					} 
			        else 
					{
						lblNewLabel_2_1_1.setVisible(true);
			        }
			        
				
				System.out.println(text);
				System.out.println(text2);				
				
				if (Pattern.matches("^[a-zA-Z ]{3,}$", text2))
				{
				
				queryS = "UPDATE Courses SET Course_Name = ? WHERE Course_Name = ?";
					
					statement1 = Connect.prepareStatement(queryS);
					
					statement1.setString(1, text2);
					statement1.setString(2, text);
										
					statement1.executeUpdate();
					
                   querySt = "UPDATE user SET Course = ? WHERE Course = ?";
					
					statement1 = Connect.prepareStatement(querySt);
					

					statement1.setString(1, text2);
					statement1.setString(2, text);
					
					
					statement1.executeUpdate();

					statement1.close();
					Connect.close();
					statement1.close();
					Connect.close();
				} }catch (ClassNotFoundException a) {
					System.out.println(a);
				} catch (SQLException f) {
					System.out.println(f);
				}
				
				
			}
			
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1.setBounds(187, 310, 94, 21);
		frame.getContentPane().add(btnSubmit_1);
		
		
		
	}
}


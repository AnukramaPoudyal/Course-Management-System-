package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register {

	private JFrame frame;
	private JTextField textField;
	protected JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	protected JLabel lblNewLabel_5;
	protected JLabel lblNewLabel_5_1;
	protected JLabel lblNewLabel_5_2;
	protected JLabel lblNewLabel_5_2_1;
	private JPasswordField passwordField;
	private JToggleButton tglbtnNewToggleButton;
	private JToggleButton tglbtnNewToggleButton_1;
	private JLabel lblNewLabel_7;
	static protected String input8;
	static protected String input7;
	static protected String input;
	static String input1;
	static String input2;
	static String input3;
	static String input4;
	static String input5;
	static int input6;
	private JButton btnSubmit;
	private JButton btnSubmit_2;
	static protected int input9;
	StudentsList list = new StudentsList();
	private Statement statement5;
	private ResultSet rs;

	
	/**
	 * Launch the application.
	 */
	
	public static void RegisterScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	
	public Register() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	protected void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 549, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setBounds(185, 85, 120, 23);
		lblRegister.setForeground(new Color(255, 128, 128));
		lblRegister.setFont(new Font("Dialog", Font.BOLD, २०));
		frame.getContentPane().add(lblRegister);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(127, 75, 48, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:\r\n\r\n");
		lblNewLabel_1.setBounds(39, 153, 83, 23);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, १४));
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(180, 153, 207, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:\r\n\r\n");
		lblNewLabel_1_1.setBounds(39, 203, 83, 23);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 202, 207, 23);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Username:");
		lblNewLabel_1_1_1.setBounds(39, 295, 83, 23);
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 295, 207, 22);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password:\r\n");
		lblNewLabel_1_1_1_1.setBounds(39, 344, 83, 23);
		lblNewLabel_1_1_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_2 = new JLabel("Course:");
		lblNewLabel_1_1_2.setBounds(39, 252, 83, 23);
		lblNewLabel_1_1_2.setFont(new Font("Roboto", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_1_1_2);

		JComboBox<String> comboBox = new JComboBox<>(new String[]{"", "BIBM", "BIT", "IMBA"});
		comboBox.setBounds(203, 252, 179, 23);
		frame.getContentPane().add(comboBox);

		comboBox.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		    }
		});
		comboBox.setBounds(180, 253, 89, 21);
		
		String url= "jdbc:mysql://localhost:3306/records";
        String username = "root";
        String password = "";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connect = DriverManager.getConnection(url,username,password);
            
            statement5 = Connect.createStatement();
            String sql = "Select * from Courses";
            rs = statement5.executeQuery(sql);
            while(rs.next()) 
            {
                 comboBox.addItem(rs.getString("Course_Name"));
            }
    }catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        System.out.println(e);
    }catch (SQLException e) {
        System.out.println(e);
    }
		comboBox.setFont(new Font("Roboto", Font.PLAIN, 15));
		frame.getContentPane().add(comboBox);
		
		lblNewLabel_2 = new JLabel("** Your first name should contain atleast 3 alphabets **");
		lblNewLabel_2.setBounds(139, 183, 260, 13);
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_5 = new JLabel("** Your last name should contain atleast 2 alphabets **");
		lblNewLabel_5.setBounds(139, 235, 260, 13);
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Roboto", Font.PLAIN, 10));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_5_1 = new JLabel("** Enter username **");
		lblNewLabel_5_1.setBounds(270, 324, 99, 13);
		lblNewLabel_5_1.setVisible(false);
		lblNewLabel_5_1.setForeground(Color.RED);
		lblNewLabel_5_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		frame.getContentPane().add(lblNewLabel_5_1);
		
		lblNewLabel_5_2 = new JLabel("**Password:1 lowercase, 1 uppercase, 1 char, 1 number and at least 10 characters long**");
		lblNewLabel_5_2.setBounds(10, 387, 426, 13);
		lblNewLabel_5_2.setForeground(new Color(116, 192, 67));
		lblNewLabel_5_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		frame.getContentPane().add(lblNewLabel_5_2);
		
		JButton btnSubmit_1 = new JButton("Registered");
		btnSubmit_1.setBounds(320, 419, 94, 21);
		btnSubmit_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				StudentsList list = new StudentsList();
				list.DatabaseConnect("jdbc:mysql://localhost:3306/records" , "root");
				
	    		lblNewLabel_7.setVisible(false);				        
				String text = textField.getText();
				if (!(Pattern.matches("^[a-zA-Z]{3,}$", text)))
				{
					try
					{
						lblNewLabel_2.setVisible(true);
					}
					catch (NullPointerException a)
					{
						System.out.println(a);
					} 
					System.out.println("InCorrect First Name.");

				}
				else
				{
					lblNewLabel_2.setVisible(false);
					System.out.println("Correct First Name.");
				}
				
				String text1 = textField_1.getText();
				if (!(Pattern.matches("^[a-zA-Z]{2,}$", text1)))
				{
					try
					{
						lblNewLabel_5.setVisible(true);
					}
					   catch (NullPointerException b)
					{
						System.out.println(b);
					}				
				System.out.println("InCorrect last name.");
				}
				else
				{
					lblNewLabel_5.setVisible(false);
					System.out.println("Correct last name.");
				}
				
				String text2 = textField_2.getText();
				int length2 = text2.length();

				if (length2 <= 0)
				{
					try 
					{
						lblNewLabel_5_1.setVisible(true);
				    }
					catch (NullPointerException c)
					{
						System.out.println(c);
					}
					System.out.println("InCorrect username");
				}
				else
				{
					lblNewLabel_5_1.setVisible(false);
					System.out.println("Correct username");
				}
				

				char[] password = passwordField.getPassword();
				String text3 = new String(password);
				String patternString = "^(?=.{10,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
		        if (Pattern.matches(patternString,text3)) 
		        {
		    		lblNewLabel_5_2.setVisible(true);
		        	System.out.println("Correct password pattern.");
		        } 
		        else 
		        {
		    		lblNewLabel_5_2.setVisible(false);
		        	lblNewLabel_5_2_1.setVisible(true);
		        	System.out.println("Incorrect password pattern.");
		        }
				
				
				if (Pattern.matches("^[a-zA-Z]{3,}$", text) && Pattern.matches("^[a-zA-Z]{2,}$", text1) &&  length2 > 0 && Pattern.matches(patternString,text3))
				
				{
					list.Database("root");
					Test t = new Test();
				    try {
				        Class.forName("com.mysql.cj.jdbc.Driver");
				        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
				        

//				               
//				        Statement.executeUpdate(sql);
//				        System.out.println("Table created successfully...");
				        
				        String queryString2 = "INSERT INTO user(First_Name, Last_Name, Username, Password, Course, Level, Registered_Date, Designation, Status, Module1, Module2, Module3, Module4, Module5, Module6, Module7, Module8, Module9, Module10, Module11, Module12, Module13, Module14, Module15, Module16, Module17, Module18, Module19, Module20, Module21, Module22, Module23, Module24, Module25, Module26, Module27, Module28, Module29, Module30, Module31, Module32) VALUES (? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				           
				        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
				        input = textField.getText();
						input1 = textField_1.getText();
						input2 = (String) comboBox.getSelectedItem();
						input3 = textField_2.getText();
						input4 = new String(passwordField.getPassword());
						input5 = "Student";
                        list.DatabaseConnect("jdbc:mysql://localhost:3306/records" , "root");
						try
						{
						if (list.duration12 == 1)
						{
						   input6 = 6;
						}
						else if (list.duration12 == 2)
						{
						   input6 = 5;
						}
						else if (list.duration12 == 3)
						{
						   input6 = 4;
						}
						else if (list.duration12 == 4)
						{
							input6 = 3;
						}
						}
						catch(DurationOopsie z)
						{
							System.out.println(z);
						}
						
						input7 = t.registeredDate();
						input8 = "Last";
						input9 = 0;
						
				    
				        statement1.setString(1, input);
				        statement1.setString(2, input1);
				        statement1.setString(3, input3);
				        statement1.setString(4, input4);
				        statement1.setString(5, input2);
				        statement1.setInt(6, input6);
				        statement1.setString(7, input7);
				        statement1.setString(8,input5);
				        statement1.setString(9,input8);
				        for (int i=10 ; i<=41; i++)
				        {
				            statement1.setInt(i,input9);
				        }

				        statement1.executeUpdate();
				        System.out.println("Inserted!!!!");
				        statement1.close();
				        Connect.close();
				        
				        Login1 login = new Login1();
				        Login1.Login();
					    Register register = new Register();
						register.frame.setVisible(false);
						frame.dispose();
				        
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
				        	System.out.println("Duplicate Username");
				    		lblNewLabel_7.setVisible(true);				        
				    	}
				}
				}
				list.Database();
			}
		});
		
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnSubmit_1);
		
		lblNewLabel_5_2_1 = new JLabel("**Password:1 lowercase, 1 uppercase, 1 char, 1 number and at least 10 characters long**");
		lblNewLabel_5_2_1.setBounds(10, 387, 426, 13);
		lblNewLabel_5_2_1.setForeground(new Color(255, 0, 0));
    	lblNewLabel_5_2_1.setVisible(false);
		lblNewLabel_5_2_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		frame.getContentPane().add(lblNewLabel_5_2_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 347, 207, 23);
		frame.getContentPane().add(passwordField);
		
		tglbtnNewToggleButton = new JToggleButton();
		tglbtnNewToggleButton.setBounds(397, 344, 29, 23);
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tglbtnNewToggleButton.setVisible(false);
				tglbtnNewToggleButton_1.setVisible(true);
                passwordField.setEchoChar((char) 0);
			}
		});
		frame.getContentPane().add(tglbtnNewToggleButton);

		
		tglbtnNewToggleButton_1 = new JToggleButton();
		tglbtnNewToggleButton_1.setBounds(397, 344, 29, 23);
		tglbtnNewToggleButton_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tglbtnNewToggleButton.setVisible(true);
				tglbtnNewToggleButton_1.setVisible(false);
                passwordField.setEchoChar('*');
			}
		});
		tglbtnNewToggleButton_1.setVisible(false);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		lblNewLabel_7 = new JLabel("** Username already exists.**");
		lblNewLabel_7.setBounds(139, 327, 144, 13);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setFont(new Font("Roboto", Font.PLAIN, 10));
		frame.getContentPane().add(lblNewLabel_7);
		
		btnSubmit = new JButton("Return");
		btnSubmit.setBounds(20, 419, 94, 21);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courses courses = new Courses();
				Courses.courses();
				Register window = new Register();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnSubmit);
		
		btnSubmit_2 = new JButton("Lets Login");
		btnSubmit_2.setBounds(175, 419, 94, 21);
		btnSubmit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login1 login = new Login1();
				Login1.Login();
				Register window = new Register();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btnSubmit_2);
		}
	
	
	}


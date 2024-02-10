package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login1 {
	
	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;
	protected JLabel lblNewLabel_2;
	protected String queryString4;
	protected String queryString5;
	protected String queryString6;
	protected String queryString7;
	protected String queryString3;
	protected String queryString2;
	static protected String password;
	protected ResultSet result5;
	protected ResultSet result4;
	protected ResultSet result3;
	protected ResultSet result2;
	protected ResultSet result1;
	protected ResultSet result;
	protected JLabel textField;
	static protected String Progression;
	static protected int module1;
	static protected int module2;
	static protected int module3;
	static protected int module4;
	static protected int module5;
	static protected int module6;
	static protected int module7;
	static protected int module9;
	static protected int module10;
	static protected int module11;
	static protected int module12;
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
	static protected int module8;
	static protected String designation;
	static protected String course;
	static protected String username;
	static protected String lastname;
	static protected String firstname;
	static protected String level;


	/**
	 * Launch the application.
	 */
	public static void Login() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
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
	public Login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 537, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, ३०));
		lblNewLabel.setBounds(203, 37, 107, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username:");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(41, 126, 107, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(204, 128, 178, 23);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password:\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(41, 176, 107, 23);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 176, 179, 23);
		frame.getContentPane().add(passwordField);
		
		JButton btnSubmit = new JButton("Welcome");
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				StudentsList list = new StudentsList();
				list.Database();
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

					queryString2 = "SELECT First_Name, Last_Name, Username, Password, Course, Level, Designation, Module1, Module2, Module3, Module4, Module5, Module6, Module7, Module8, Module9, Module10, Module11, Module12, Module13, Module14, Module15, Module16, Module17, Module18, Module19, Module20, Module21, Module22, Module23, Module24, Module25, Module26, Module27, Module28, Module29, Module30, Module31, Module32, Progression FROM user WHERE Username = ?";
					
					PreparedStatement statement1 = Connect.prepareStatement(queryString2);
					
					String input = textField_1.getText();
					String input1 = new String(passwordField.getPassword());

					statement1.setString(1, input);
					result = statement1.executeQuery();

					if (result.next() && result.getString("Password").equals(input1)) {
						System.out.println("Checked!!!!");
						Dashboard dashboard = new Dashboard();
						dashboard.Dashboard();
						Login1 login = new Login1();
						login.frame.setVisible(false);
						frame.dispose();
					} else {
						lblNewLabel_2.setVisible(true);
					}
					
					
						firstname = result.getString("First_Name");
						lastname = result.getString("Last_Name");
						username = result.getString("Username");
						password = result.getString("Password");
						course = result.getString("Course");
						designation = result.getString("Designation");
						level = result.getString("Level");
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
						Progression = result.getString("Progression");

					result.close();
					
					statement1.close();
					
					Connect.close();
				} catch (ClassNotFoundException a) {
					System.out.println(a);
				} catch (SQLException f) {
					System.out.println(f);
				}
			}
		});
		btnSubmit.setFont(new Font("Dialog", Font.PLAIN, १४));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(242, 309, 94, 21);
		frame.getContentPane().add(btnSubmit);
		
		lblNewLabel_2 = new JLabel("** Invalid Credential/s **");
		lblNewLabel_2.setVisible(false);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(222, 280, 114, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnSubmit_1 = new JButton("Register");
		btnSubmit_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Register courses = new Register();
		        courses.RegisterScreen();
		        Login1 window = new Login1();
		        window.frame.setVisible(false);
		        frame.dispose();
		    }
		});
		btnSubmit_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1.setBounds(392, 341, 94, 21);
		frame.getContentPane().add(btnSubmit_1);

		JButton btnSubmit_2 = new JButton("Return");
		btnSubmit_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Courses courses = new Courses();
		        courses.courses();
		        Login1 window = new Login1();
		        window.frame.setVisible(false);
		        frame.dispose();
		    }
		});
		btnSubmit_2.setFont(new Font("Dialog", Font.PLAIN, १४));
		btnSubmit_2.setBackground(Color.LIGHT_GRAY);
		btnSubmit_2.setBounds(41, 310, 94, 21);
		frame.getContentPane().add(btnSubmit_2);

		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton_2.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        textField_1.setText("");
		        passwordField.setText("");
		    }
		});
		btnNewButton_2.setBounds(41, 274, 85, 21);
		frame.getContentPane().add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("New Here??");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(402, 310, 74, 21);
		frame.getContentPane().add(lblNewLabel_1);

		// Existing code for JLabel "Login As"
		JLabel loginAsLabel = new JLabel("Login As");
		loginAsLabel.setFont(new Font("Arial", Font.BOLD, 14));
		loginAsLabel.setBounds(41, 228, 96, 17);
		frame.getContentPane().add(loginAsLabel);

		// New code for JComboBox
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        // Add any necessary logic for the mouse click event on the JComboBox
		    }
		});
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "", "Admin", "Teacher", "Student" }));
		comboBox.setBounds(209, 227, 173, 21);
		frame.getContentPane().add(comboBox);



    }
}

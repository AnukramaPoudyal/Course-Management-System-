package studentCourseManagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JInternalFrame;

public class Login2{

	private JFrame frame;
	private JTextField textField_1;
	private JPasswordField passwordField;
	protected JToggleButton tglbtnNewToggleButton;
	protected JToggleButton tglbtnNewToggleButton_1;
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
	private JLabel lblNewLabel_5;
	static protected String designation;
	static protected String course;
	static protected String username;
	static protected String lastname;
	static protected String firstname;
	static protected String level;

	/**
	 * Launch the application.
	 */
	public static void ValidLogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login2 window = new Login2();
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
	public Login2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 450, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     Welcome Back");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(new Color(255, 128, 128));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, ३०));
		lblNewLabel.setBounds(41, 33, 340, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username:");
		lblNewLabel_2_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(41, 120, 107, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 122, 178, 23);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Password:\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(41, 185, 107, 23);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 187, 179, 23);
		frame.getContentPane().add(passwordField);
		
		JButton btnSubmit = new JButton("Dive In");
		btnSubmit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Login1 login = new Login1();
				String input1 = new String(passwordField.getPassword());
				if (textField_1.getText().equals(login.username) && input1.equals(login.password))
				{
					lblNewLabel_5.setVisible(false);					
					Results results = new Results();
					results.Results();
					Login2 login2 = new Login2();
					login2.frame.setVisible(false);
					frame.dispose();
				}		
				else
				{
					lblNewLabel_5.setVisible(true);
				}
			}
		});
		btnSubmit.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(327, 263, 94, 21);
		frame.getContentPane().add(btnSubmit);
		
		tglbtnNewToggleButton = new JToggleButton();
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tglbtnNewToggleButton.setVisible(false);
				tglbtnNewToggleButton_1.setVisible(true);
                passwordField.setEchoChar((char) 0);
			}
		});
		tglbtnNewToggleButton.setBounds(392, 185, 29, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		tglbtnNewToggleButton_1 = new JToggleButton();
		tglbtnNewToggleButton_1.setVisible(false);
		tglbtnNewToggleButton_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				tglbtnNewToggleButton.setVisible(true);
				tglbtnNewToggleButton_1.setVisible(false);
                passwordField.setEchoChar('*');
			}
		});
		tglbtnNewToggleButton_1.setBounds(392, 185, 29, 23);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		JButton btnSubmit_1 = new JButton("Return");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard dashbard = new Dashboard();
				Dashboard.Dashboard();
				Login2 window = new Login2();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1.setBounds(46, 263, 84, 21);
		frame.getContentPane().add(btnSubmit_1);
		
		lblNewLabel_5 = new JLabel("** Enter your credentials(s) **");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Roboto", Font.PLAIN, 10));
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setBounds(223, 220, 138, 13);
		frame.getContentPane().add(lblNewLabel_5);
	}
}

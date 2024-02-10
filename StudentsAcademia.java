package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentsAcademia {

	private JFrame frame;
	private JTextField textField;
	private String text;
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
	static protected ResultSet result;
	static protected String Progression;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsAcademia window = new StudentsAcademia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Disp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentsAcademia window = new StudentsAcademia();
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
	public StudentsAcademia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 436, 56);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-16, 23, 148, 23);
		panel_1.add(lblNewLabel_4);
		Image image1 = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(image1));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(-191, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image2 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image2));
		
		JLabel lblScores = new JLabel("MARKS");
		lblScores.setForeground(new Color(116, 192, 67));
		lblScores.setFont(new Font("Roboto", Font.BOLD, 30));
		lblScores.setBackground(SystemColor.menu);
		lblScores.setBounds(179, 80, 130, 23);
		frame.getContentPane().add(lblScores);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(119, 68, 50, 49);
		frame.getContentPane().add(lblNewLabel_1);
		Image image3 = new ImageIcon(this.getClass().getResource("/marks.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image3));
		
		JLabel Name = new JLabel("Username:");
		Name.setFont(new Font("Roboto", Font.BOLD, 15));
		Name.setBounds(53, 165, 107, 23);
		frame.getContentPane().add(Name);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(210, 167, 195, 22);
		frame.getContentPane().add(textField);
		text = textField.getText();
		
		JButton btnSubmit_1_1_1 = new JButton("Submit >>");
		btnSubmit_1_1_1.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e)
			{
				try 
				{
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "SELECT * FROM user WHERE Username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			     
			        statement1.setString(1, text);
			        
			        result = statement1.executeQuery();
			        
			        result.next(); 
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

					StudentsResultGUI view = new StudentsResultGUI();
					view.resultslist();
					StudentsAcademia window = new StudentsAcademia();
					window.frame.setVisible(false);
					frame.dispose();
				    }
				    catch (ClassNotFoundException a) 
				    {
						System.out.println(a);
					}
				    catch (SQLException f) {
						System.out.println(f);
					}
					
					
			}
		});
		btnSubmit_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1_1_1.setBounds(163, 215, 103, 21);
		frame.getContentPane().add(btnSubmit_1_1_1);
	}
}

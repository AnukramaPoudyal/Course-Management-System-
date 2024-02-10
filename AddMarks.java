package studentCourseManagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddMarks {

	private JFrame frame;
	private JComponent lblScores;
	private JLabel Name;
	private JPanel panel;
	private JLabel Module1;
	private JLabel Module2;
	private JLabel Module3;
	private JLabel Module4;
	private JLabel Module5;
	private JLabel Module6;
	private JLabel Module7;
	private JLabel Module8;
	private JLabel Module9;
	private JPanel panel_2;
	private JLabel Module25;
	private JLabel Module26;
	private JLabel Module27;
	private JLabel Module28;
	private JLabel Module29;
	private JLabel Module30;
	private JLabel Module31;
	private JLabel Module32;
	private JTextField txt24;
	private JTextField txt27;
	private JTextField txt30;
	private JTextField txt26;
	private JTextField txt29;
	private JTextField txt25;
	private JTextField txt28;
	private JTextField txt31;
	private JPanel panel_3;
	private JLabel Module19;
	private JLabel Module20;
	private JLabel Module22;
	private JLabel Module23;
	private JLabel Module24;
	private JLabel Module21;
	private JTextField txt18;
	private JTextField txt21;
	private JTextField txt19;
	private JTextField txt22;
	private JTextField txt20;
	private JTextField txt23;
	private JPanel panel_4;
	private JLabel Module10;
	private JLabel Module11;
	private JLabel Module12;
	private JLabel Module13;
	private JLabel Module14;
	private JLabel Module15;
	private JLabel Module16;
	private JLabel Module17;
	private JLabel Module18;
	private JTextField txt9;
	private JTextField txt12;
	private JTextField txt15;
	private JTextField txt10;
	private JTextField txt13;
	private JTextField txt16;
	private JTextField txt11;
	private JTextField txt14;
	private JTextField txt17;
	private JTextField txt;
	private JTextField txt3;
	private JTextField txt6;
	private JTextField txt1;
	private JTextField txt4;
	private JTextField txt7;
	private JTextField txt2;
	private JTextField txt5;
	private JTextField txt8;
	private JPanel panel_5;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JButton btnSubmit_1;
	private JLabel lblNewLabel_5_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMarks window = new AddMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void addmarks() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMarks window = new AddMarks();
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
	public AddMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 874, 844);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblScores = new JLabel("ADD MARKS");
		lblScores.setForeground(new Color(255, 128, 128));
		lblScores.setFont(new Font("Roboto", Font.BOLD, 30));
		lblScores.setBackground(SystemColor.menu);
		lblScores.setBounds(344, 83, 220, 23);
		frame.getContentPane().add(lblScores);
		
		Name = new JLabel("Duration:");
		Name.setFont(new Font("Roboto", Font.BOLD, 15));
		Name.setBounds(31, 128, 107, 23);
		frame.getContentPane().add(Name);
		
		panel = new JPanel();
		panel.setBackground(new Color(128, 239, 255));
		panel.setVisible(false);
		panel.setBounds(31, 159, 807, 536);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Module1 = new JLabel("Module 1:");
		Module1.setBounds(0, 10, 103, 18);
		Module1.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module1);
		
		Module2 = new JLabel("Module 2:");
		Module2.setFont(new Font("Roboto", Font.BOLD, 15));
		Module2.setBounds(271, 10, 103, 18);
		panel.add(Module2);
		
		Module3 = new JLabel("Module 3:");
		Module3.setFont(new Font("Roboto", Font.BOLD, 15));
		Module3.setBounds(541, 10, 103, 18);
		panel.add(Module3);
		
		Module4 = new JLabel("Module 4:");
		Module4.setFont(new Font("Roboto", Font.BOLD, 15));
		Module4.setBounds(0, 59, 103, 18);
		panel.add(Module4);
		
		Module5 = new JLabel("Module 5:");
		Module5.setFont(new Font("Roboto", Font.BOLD, 15));
		Module5.setBounds(271, 59, 103, 18);
		panel.add(Module5);
		
		Module6 = new JLabel("Module 6:");
		Module6.setFont(new Font("Roboto", Font.BOLD, 15));
		Module6.setBounds(541, 59, 103, 18);
		panel.add(Module6);
		
		Module7 = new JLabel("Module 7:");
		Module7.setFont(new Font("Roboto", Font.BOLD, 15));
		Module7.setBounds(0, 109, 103, 18);
		panel.add(Module7);
		
		Module8 = new JLabel("Module 8:");
		Module8.setFont(new Font("Roboto", Font.BOLD, 15));
		Module8.setBounds(271, 109, 103, 18);
		panel.add(Module8);
		
		Module9 = new JLabel("Module 9:");
		Module9.setFont(new Font("Roboto", Font.BOLD, 15));
		Module9.setBounds(541, 109, 103, 18);
		panel.add(Module9);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 239, 255));
		panel_2.setBounds(0, 388, 807, 136);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		Module25 = new JLabel("Module 25:");
		Module25.setFont(new Font("Roboto", Font.BOLD, 15));
		Module25.setBounds(0, 21, 103, 18);
		panel_2.add(Module25);
		
		Module26 = new JLabel("Module 26:");
		Module26.setFont(new Font("Roboto", Font.BOLD, 15));
		Module26.setBounds(272, 25, 103, 18);
		panel_2.add(Module26);
		
		Module27 = new JLabel("Module 27:");
		Module27.setFont(new Font("Roboto", Font.BOLD, 15));
		Module27.setBounds(545, 21, 103, 18);
		panel_2.add(Module27);
		
		Module28 = new JLabel("Module 28:");
		Module28.setFont(new Font("Roboto", Font.BOLD, 15));
		Module28.setBounds(0, 72, 88, 18);
		panel_2.add(Module28);
		
		Module29 = new JLabel("Module 29:");
		Module29.setFont(new Font("Roboto", Font.BOLD, 15));
		Module29.setBounds(272, 72, 103, 18);
		panel_2.add(Module29);
		
		Module30 = new JLabel("Module 30:");
		Module30.setFont(new Font("Roboto", Font.BOLD, 15));
		Module30.setBounds(545, 72, 103, 18);
		panel_2.add(Module30);
		
		Module31 = new JLabel("Module 31:");
		Module31.setFont(new Font("Roboto", Font.BOLD, 15));
		Module31.setBounds(0, 119, 103, 18);
		panel_2.add(Module31);
		
		Module32 = new JLabel("Module 32:");
		Module32.setFont(new Font("Roboto", Font.BOLD, 15));
		Module32.setBounds(272, 119, 88, 18);
		panel_2.add(Module32);
		
		txt24 = new JTextField();
		txt24.setColumns(10);
		txt24.setBounds(95, 22, 155, 19);
		panel_2.add(txt24);
		
		txt27 = new JTextField();
		txt27.setColumns(10);
		txt27.setBounds(95, 73, 155, 19);
		panel_2.add(txt27);
		
		txt30 = new JTextField();
		txt30.setColumns(10);
		txt30.setBounds(95, 118, 155, 19);
		panel_2.add(txt30);
		
		txt26 = new JTextField();
		txt26.setColumns(10);
		txt26.setBounds(642, 22, 155, 19);
		panel_2.add(txt26);
		
		txt29 = new JTextField();
		txt29.setColumns(10);
		txt29.setBounds(642, 73, 155, 19);
		panel_2.add(txt29);
		
		txt25 = new JTextField();
		txt25.setColumns(10);
		txt25.setBounds(370, 26, 155, 19);
		panel_2.add(txt25);
		
		txt28 = new JTextField();
		txt28.setColumns(10);
		txt28.setBounds(370, 73, 155, 19);
		panel_2.add(txt28);
		
		txt31 = new JTextField();
		txt31.setColumns(10);
		txt31.setBounds(370, 118, 155, 19);
		panel_2.add(txt31);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 239, 255));
		panel_3.setBounds(0, 291, 807, 98);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		Module19 = new JLabel("Module 19:");
		Module19.setFont(new Font("Roboto", Font.BOLD, 15));
		Module19.setBounds(0, 20, 103, 18);
		panel_3.add(Module19);
		
		Module20 = new JLabel("Module 20:");
		Module20.setFont(new Font("Roboto", Font.BOLD, 15));
		Module20.setBounds(270, 20, 103, 18);
		panel_3.add(Module20);
		
		Module22 = new JLabel("Module 22:");
		Module22.setFont(new Font("Roboto", Font.BOLD, 15));
		Module22.setBounds(0, 70, 103, 18);
		panel_3.add(Module22);
		
		Module23 = new JLabel("Module 23:");
		Module23.setFont(new Font("Roboto", Font.BOLD, 15));
		Module23.setBounds(270, 70, 103, 18);
		panel_3.add(Module23);
		
		Module24 = new JLabel("Module 24:");
		Module24.setFont(new Font("Roboto", Font.BOLD, 15));
		Module24.setBounds(545, 70, 103, 18);
		panel_3.add(Module24);
		
		Module21 = new JLabel("Module 21:");
		Module21.setFont(new Font("Roboto", Font.BOLD, 15));
		Module21.setBounds(545, 20, 103, 18);
		panel_3.add(Module21);
		
		txt18 = new JTextField();
		txt18.setColumns(10);
		txt18.setBounds(94, 21, 155, 19);
		panel_3.add(txt18);
		
		txt21 = new JTextField();
		txt21.setColumns(10);
		txt21.setBounds(94, 71, 155, 19);
		panel_3.add(txt21);
		
		txt19 = new JTextField();
		txt19.setColumns(10);
		txt19.setBounds(369, 21, 155, 19);
		panel_3.add(txt19);
		
		txt22 = new JTextField();
		txt22.setColumns(10);
		txt22.setBounds(369, 71, 155, 19);
		panel_3.add(txt22);
		
		txt20 = new JTextField();
		txt20.setColumns(10);
		txt20.setBounds(642, 21, 155, 19);
		panel_3.add(txt20);
		
		txt23 = new JTextField();
		txt23.setColumns(10);
		txt23.setBounds(642, 69, 155, 19);
		panel_3.add(txt23);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 239, 255));
		panel_4.setBounds(0, 137, 807, 156);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		Module10 = new JLabel("Module 10:");
		Module10.setBounds(0, 20, 103, 18);
		panel_4.add(Module10);
		Module10.setFont(new Font("Roboto", Font.BOLD, 15));
		
		Module11 = new JLabel("Module 11:");
		Module11.setFont(new Font("Roboto", Font.BOLD, 15));
		Module11.setBounds(272, 20, 103, 18);
		panel_4.add(Module11);
		
		Module12 = new JLabel("Module 12:");
		Module12.setFont(new Font("Roboto", Font.BOLD, 15));
		Module12.setBounds(545, 20, 103, 18);
		panel_4.add(Module12);
		
		Module13 = new JLabel("Module 13:");
		Module13.setFont(new Font("Roboto", Font.BOLD, 15));
		Module13.setBounds(0, 69, 103, 18);
		panel_4.add(Module13);
		
		Module14 = new JLabel("Module 14:");
		Module14.setFont(new Font("Roboto", Font.BOLD, 15));
		Module14.setBounds(272, 69, 103, 18);
		panel_4.add(Module14);
		
		Module15 = new JLabel("Module 15:");
		Module15.setFont(new Font("Roboto", Font.BOLD, 15));
		Module15.setBounds(545, 69, 103, 18);
		panel_4.add(Module15);
		
		Module16 = new JLabel("Module 16:");
		Module16.setFont(new Font("Roboto", Font.BOLD, 15));
		Module16.setBounds(0, 120, 103, 18);
		panel_4.add(Module16);
		
		Module17 = new JLabel("Module 17:");
		Module17.setFont(new Font("Roboto", Font.BOLD, 15));
		Module17.setBounds(272, 120, 103, 18);
		panel_4.add(Module17);
		
		Module18 = new JLabel("Module 18:");
		Module18.setFont(new Font("Roboto", Font.BOLD, 15));
		Module18.setBounds(545, 120, 103, 18);
		panel_4.add(Module18);
		
		txt9 = new JTextField();
		txt9.setColumns(10);
		txt9.setBounds(95, 21, 155, 19);
		panel_4.add(txt9);
		
		txt12 = new JTextField();
		txt12.setColumns(10);
		txt12.setBounds(95, 70, 155, 19);
		panel_4.add(txt12);
		
		txt15 = new JTextField();
		txt15.setColumns(10);
		txt15.setBounds(95, 121, 155, 19);
		panel_4.add(txt15);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		txt10.setBounds(367, 21, 155, 19);
		panel_4.add(txt10);
		
		txt13 = new JTextField();
		txt13.setColumns(10);
		txt13.setBounds(367, 70, 155, 19);
		panel_4.add(txt13);
		
		txt16 = new JTextField();
		txt16.setColumns(10);
		txt16.setBounds(367, 121, 155, 19);
		panel_4.add(txt16);
		
		txt11 = new JTextField();
		txt11.setColumns(10);
		txt11.setBounds(642, 21, 155, 19);
		panel_4.add(txt11);
		
		txt14 = new JTextField();
		txt14.setColumns(10);
		txt14.setBounds(642, 70, 155, 19);
		panel_4.add(txt14);
		
		txt17 = new JTextField();
		txt17.setColumns(10);
		txt17.setBounds(642, 121, 155, 19);
		panel_4.add(txt17);
		
		
		txt = new JTextField();
		txt.setBounds(93, 11, 155, 19);
		panel.add(txt);
		txt.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(93, 60, 155, 19);
		panel.add(txt3);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(93, 109, 155, 19);
		panel.add(txt6);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(364, 11, 155, 19);
		panel.add(txt1);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(364, 60, 155, 19);
		panel.add(txt4);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(364, 110, 155, 19);
		panel.add(txt7);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(630, 10, 155, 19);
		panel.add(txt2);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(630, 59, 155, 19);
		panel.add(txt5);
		
		txt8 = new JTextField();
		txt8.setColumns(10);
		txt8.setBounds(630, 109, 155, 19);
		panel.add(txt8);
		
		panel_5 = new JPanel();
		panel_5.setBounds(128, 128, 58, 23);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 55, 22);
		panel_5.add(menuBar);
		
		mnNewMenu = new JMenu("Select");
		mnNewMenu.setFont(new Font("Roboto", Font.PLAIN, 15));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("1");
		mntmNewMenuItem.setFont(new Font("Roboto", Font.PLAIN, 12));
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				panel.setVisible(true);
				panel_4.setVisible(false);
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				Module9.setVisible(false);
				txt8.setVisible(false);				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("2");
		mntmNewMenuItem_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				panel.setVisible(true);
				panel_4.setVisible(true);
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				Module17.setVisible(false);
				Module18.setVisible(false);
				txt16.setVisible(false);				
				txt17.setVisible(false);
				Module9.setVisible(true);
				txt8.setVisible(true);	

			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("3");
		mntmNewMenuItem_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				panel.setVisible(true);
				panel_4.setVisible(true);
				panel_3.setVisible(true);
				panel_2.setVisible(false);
				Module17.setVisible(true);
				Module18.setVisible(true);
				txt16.setVisible(true);				
				txt17.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("4");
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				panel.setVisible(true);
				panel_4.setVisible(true);
				panel_3.setVisible(true);
				panel_2.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		
		btnSubmit_1 = new JButton("Return");
		btnSubmit_1.setBounds(36, 754, 84, 21);
		frame.getContentPane().add(btnSubmit_1);
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.Dashboard();
				AddMarks window = new AddMarks();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		
		lblNewLabel_5_1 = new JLabel("** Added Successfully **");
		lblNewLabel_5_1.setVisible(false);
		lblNewLabel_5_1.setForeground(new Color(116, 192, 67));
		lblNewLabel_5_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(386, 759, 174, 13);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		lblNewLabel_5 = new JLabel("** Numerical Entries in Modular Fields|Alphabets in progression **");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(207, 782, 526, 13);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel = new JLabel("** Wrong Username **");
		lblNewLabel.setVisible(false);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setBounds(366, 753, 304, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnSubmit_1_1 = new JButton("Next Page");
		btnSubmit_1_1.addActionListener(new ActionListener() 
		{
			
			private ResultSet result;
			private String username;

			public void actionPerformed(ActionEvent e) 
			{
				
				
				lblNewLabel_5_1.setVisible(false);
				lblNewLabel_5.setVisible(false);
	    		lblNewLabel.setVisible(false);
	    		

				
				String m1 = txt.getText();
				String m2 = txt1.getText();
				String m3 = txt2.getText();
				String m4 = txt3.getText();
				String m5 = txt4.getText();
				String m6 = txt5.getText();
				String m7 = txt6.getText();
				String m8 = txt7.getText();
				String m9 = txt8.getText();
				String m10 = txt9.getText();
				String m11 = txt10.getText();
				String m12 = txt11.getText();
				String m13 = txt12.getText();
				String m14 = txt13.getText();
				String m15 = txt14.getText();
				String m16 = txt15.getText();
				String m17 = txt16.getText();
				String m18 = txt17.getText();
				String m19 = txt18.getText();
				String m20 = txt19.getText();
				String m21 = txt20.getText();
				String m22 = txt21.getText();
				String m23 = txt22.getText();
				String m24 = txt23.getText();
				String m25 = txt24.getText();
				String m26 = txt25.getText();
				String m27 = txt26.getText();
				String m28 = txt27.getText();
				String m29 = txt28.getText();
				String m30 = txt29.getText();
				String m31 = txt30.getText();
				String m32 = txt31.getText();
				String course = textField_1.getText();
				String description = textField.getText();
				
				try 
				{
				
			        Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "SELECT Username FROM user WHERE Username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			     
			        statement1.setString(1, course);
			        
			        result = statement1.executeQuery();
			        
			        if (result.next() && result.getString("Username").equals(course)) 
			        {
			        	username = result.getString("Username");
						lblNewLabel.setVisible(true);
						
					} 
			        else 
					{
			    		lblNewLabel.setVisible(true);
			        }
				}
				catch (ClassNotFoundException a) 
			    {
			        System.out.println(a);
			    }
			    catch (SQLException f) 
			    {
			    	System.out.println(f);
			    }
				
				if (mntmNewMenuItem.getText() == "1") 
				{			
				if (Pattern.matches("^(100|[1-9][0-9]?|0)$", m1) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m2) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m3) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m4) && 
						Pattern.matches("^(100|[1-9][0-9]?|0)$", m5) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m6) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m7) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m8) 
						&& Pattern.matches("^[a-zA-Z .,()]{3,}$", description) && course.length() > 0)
				{
					StudentsList list = new StudentsList();
					list.DatabaseConnect("root");	
					System.out.println(mntmNewMenuItem.getText());
					try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "UPDATE user SET Module1 = ?, Module2 = ?, Module3 = ?, Module4 = ?, Module5 = ?, Module6 = ?, Module7 = ?, Module8 = ?, Progression = ? WHERE username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			       					
			    
			        statement1.setInt(1, Integer.parseInt(m1));
			        statement1.setInt(2, Integer.parseInt(m2));
			        statement1.setInt(3, Integer.parseInt(m3));
			        statement1.setInt(4, Integer.parseInt(m4));
			        statement1.setInt(5, Integer.parseInt(m5));
			        statement1.setInt(6, Integer.parseInt(m6));
			        statement1.setInt(7, Integer.parseInt(m7));
			        statement1.setInt(8, Integer.parseInt(m8));
			        statement1.setString(9, description);
			        statement1.setString(10, course);

			        

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
			    		lblNewLabel.setVisible(true);
			    	}
			    }
					
				}
				else
				{
					lblNewLabel_5.setVisible(true);
					lblNewLabel_5_1.setVisible(false);
				}
				}
				

				if (mntmNewMenuItem.getText() == "2") 
				{				
				if (Pattern.matches("^(100|[1-9][0-9]?|0)$", m1) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m2) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m3) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m4) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m5) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m6) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m7) 
						&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m8) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m9) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m10) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m11) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m12) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m13) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m14) 
						&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m15) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m16) && Pattern.matches("^[a-zA-Z .,()]{3,}$", description) && course.length() > 0)
				{
					StudentsList list = new StudentsList();
					list.DatabaseConnect("root");
					System.out.println(mntmNewMenuItem.getText());
					try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "UPDATE user SET Module1 = ?, Module2 = ?, Module3 = ?, Module4 = ?, Module5 = ?, Module6 = ?, Module7 = ?, Module8 = ?, Module9 = ?, Module10 = ?, Module11 = ?, Module12 = ?, Module13 = ?, Module14 = ?, Module15 = ?, Module16 = ?, Progression = ? WHERE username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			       
								
			    
			        statement1.setInt(1, Integer.parseInt(m1));
			        statement1.setInt(2, Integer.parseInt(m2));
			        statement1.setInt(3, Integer.parseInt(m3));
			        statement1.setInt(4, Integer.parseInt(m4));
			        statement1.setInt(5, Integer.parseInt(m5));
			        statement1.setInt(6, Integer.parseInt(m6));
			        statement1.setInt(7, Integer.parseInt(m7));
			        statement1.setInt(8, Integer.parseInt(m8));
			        statement1.setInt(9, Integer.parseInt(m9));
			        statement1.setInt(10, Integer.parseInt(m10));
			        statement1.setInt(11, Integer.parseInt(m11));
			        statement1.setInt(12, Integer.parseInt(m12));
			        statement1.setInt(13, Integer.parseInt(m13));
			        statement1.setInt(14, Integer.parseInt(m14));
			        statement1.setInt(15, Integer.parseInt(m15));
			        statement1.setInt(16, Integer.parseInt(m16));
			        statement1.setString(17, description);
			        statement1.setString(18, course);
			        


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
			    		lblNewLabel.setVisible(true);
			    	}
			    }
					
				}
				else
				{
					lblNewLabel_5_1.setVisible(false);
					lblNewLabel_5.setVisible(true);
				}
				
				}
				
				
				
				
				if (mntmNewMenuItem.getText() == "3") 
				{		
					if (Pattern.matches("^(100|[1-9][0-9]?|0)$", m1) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m2) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m3) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m4) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m5) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m6) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m7) 
							&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m8) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m9) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m10) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m11) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m12) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m13) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m14) 
							&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m15) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m16) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m17) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m18) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m19) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m20) && 
							Pattern.matches("^(100|[1-9][0-9]?|0)$", m21) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m22) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m23) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m24) && Pattern.matches("^[a-zA-Z .,()]{3,}$", description) && course.length() > 0)
				{
						StudentsList list = new StudentsList();
					list.DatabaseConnect("root");
					System.out.println(mntmNewMenuItem.getText());
					try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "UPDATE user SET Module1 = ?, Module2 = ?, Module3 = ?, Module4 = ?, Module5 = ?, Module6 = ?, Module7 = ?, Module8 = ?, Module9 = ?, Module10 = ?, Module11 = ?, Module12 = ?, Module13 = ?, Module14 = ?, Module15 = ?, Module16 = ?, Module17 = ?, Module18 = ?, Module19 = ?, Module20 = ?, Module21 = ?, Module22 = ?, Module23 = ?, Module24 = ?, Progression = ? WHERE username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			       					
			        statement1.setInt(1, Integer.parseInt(m1));
			        statement1.setInt(2, Integer.parseInt(m2));
			        statement1.setInt(3, Integer.parseInt(m3));
			        statement1.setInt(4, Integer.parseInt(m4));
			        statement1.setInt(5, Integer.parseInt(m5));
			        statement1.setInt(6, Integer.parseInt(m6));
			        statement1.setInt(7, Integer.parseInt(m7));
			        statement1.setInt(8, Integer.parseInt(m8));
			        statement1.setInt(9, Integer.parseInt(m9));
			        statement1.setInt(10, Integer.parseInt(m10));
			        statement1.setInt(11, Integer.parseInt(m11));
			        statement1.setInt(12, Integer.parseInt(m12));
			        statement1.setInt(13, Integer.parseInt(m13));
			        statement1.setInt(14, Integer.parseInt(m14));
			        statement1.setInt(15, Integer.parseInt(m15));
			        statement1.setInt(16, Integer.parseInt(m16));
			        statement1.setInt(17, Integer.parseInt(m17));
			        statement1.setInt(18, Integer.parseInt(m18));
			        statement1.setInt(19, Integer.parseInt(m19));
			        statement1.setInt(20, Integer.parseInt(m20));
			        statement1.setInt(21, Integer.parseInt(m21));
			        statement1.setInt(22, Integer.parseInt(m22));
			        statement1.setInt(23, Integer.parseInt(m23));
			        statement1.setInt(24, Integer.parseInt(m24));
			        statement1.setString(25, description);
			        statement1.setString(26, course);




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
			    		lblNewLabel.setVisible(true);
			    	}
			    }
					
				}
					else
					{
						lblNewLabel_5_1.setVisible(false);
						lblNewLabel_5.setVisible(true);
					}
				}
				
				if (mntmNewMenuItem.getText() == "4") 
				{				
				if (Pattern.matches("^(100|[1-9][0-9]?|0)$", m1) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m2) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m3) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m4) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m5) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m6) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m7) 
						&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m8) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m9) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m10) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m11) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m12) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m13) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m14) 
						&& Pattern.matches("^(100|[1-9][0-9]?|0)$", m15) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m16) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m17) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m18) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m19) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m20) && 
						Pattern.matches("^(100|[1-9][0-9]?|0)$", m21) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m22) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m23) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m24) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m25) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m26) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m27) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m28) && 
						Pattern.matches("^(100|[1-9][0-9]?|0)$", m29) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m30) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m31) && Pattern.matches("^(100|[1-9][0-9]?|0)$", m32) && Pattern.matches("^[a-zA-Z .,()]{3,}$", description) && course.length() > 0)
				{
					StudentsList list = new StudentsList();
				list.DatabaseConnect("root");
					System.out.println(mntmNewMenuItem.getText());
					try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
			        Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			        
			        
			        String queryString2 = "UPDATE user SET Module1 = ?, Module2 = ?, Module3 = ?, Module4 = ?, Module5 = ?, Module6 = ?, Module7 = ?, Module8 = ?, Module9 = ?, Module10 = ?, Module11 = ?, Module12 = ?, Module13 = ?, Module14 = ?, Module15 = ?, Module16 = ?, Module17 = ?, Module18 = ?, Module19 = ?, Module20 = ?, Module21 = ?, Module22 = ?, Module23 = ?, Module24 = ?, Module25 = ?, Module26 = ?, Module27 = ?, Module28 = ?, Module29 = ?, Module30 = ?, Module31 = ?, Module32 = ? Progression = ? WHERE username = ?";
			           
			        PreparedStatement statement1 = Connect.prepareStatement(queryString2);
			        
			        statement1.setInt(1, Integer.parseInt(m1));
			        statement1.setInt(2, Integer.parseInt(m2));
			        statement1.setInt(3, Integer.parseInt(m3));
			        statement1.setInt(4, Integer.parseInt(m4));
			        statement1.setInt(5, Integer.parseInt(m5));
			        statement1.setInt(6, Integer.parseInt(m6));
			        statement1.setInt(7, Integer.parseInt(m7));
			        statement1.setInt(8, Integer.parseInt(m8));
			        statement1.setInt(9, Integer.parseInt(m9));
			        statement1.setInt(10, Integer.parseInt(m10));
			        statement1.setInt(11, Integer.parseInt(m11));
			        statement1.setInt(12, Integer.parseInt(m12));
			        statement1.setInt(13, Integer.parseInt(m13));
			        statement1.setInt(14, Integer.parseInt(m14));
			        statement1.setInt(15, Integer.parseInt(m15));
			        statement1.setInt(16, Integer.parseInt(m16));
			        statement1.setInt(17, Integer.parseInt(m17));
			        statement1.setInt(18, Integer.parseInt(m18));
			        statement1.setInt(19, Integer.parseInt(m19));
			        statement1.setInt(20, Integer.parseInt(m20));
			        statement1.setInt(21, Integer.parseInt(m21));
			        statement1.setInt(22, Integer.parseInt(m22));
			        statement1.setInt(23, Integer.parseInt(m23));
			        statement1.setInt(24, Integer.parseInt(m24));
			        statement1.setInt(25, Integer.parseInt(m25));
			        statement1.setInt(26, Integer.parseInt(m26));
			        statement1.setInt(27, Integer.parseInt(m27));
			        statement1.setInt(28, Integer.parseInt(m28));
			        statement1.setInt(29, Integer.parseInt(m29));
			        statement1.setInt(30, Integer.parseInt(m30));
			        statement1.setInt(31, Integer.parseInt(m31));
			        statement1.setInt(32, Integer.parseInt(m32));
			        statement1.setString(33, description);
			        statement1.setString(34, course);



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
			    		lblNewLabel.setVisible(true);
			    	}
			    }
					
				}
				else
				{
					lblNewLabel_5_1.setVisible(false);
					lblNewLabel_5.setVisible(true);
				}
				}
				
			}
		});
		
		btnSubmit_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1_1.setBounds(742, 754, 96, 21);
		frame.getContentPane().add(btnSubmit_1_1);
		
		JLabel lblShortDescription = new JLabel("Overall:");
		lblShortDescription.setFont(new Font("Roboto", Font.BOLD, 15));
		lblShortDescription.setBounds(31, 705, 142, 18);
		frame.getContentPane().add(lblShortDescription);
		
		textField = new JTextField();
		textField.setBounds(160, 705, 174, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCourseName = new JLabel("Username:");
		lblCourseName.setFont(new Font("Roboto", Font.BOLD, 15));
		lblCourseName.setBounds(358, 125, 107, 23);
		frame.getContentPane().add(lblCourseName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(475, 125, 320, 23);
		frame.getContentPane().add(textField_1);
			
		
		}

	}



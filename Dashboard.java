package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Dashboard extends Login1{

	private JFrame frame;
	CardLayout card = new CardLayout();
	static protected JLayeredPane layeredPane_1;
	private JPanel panel_2;

	/**
	 * Launch the application.
	 */
	public static void Dashboard() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	void Switch_screen(JPanel panel)
	{
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}
	/**
	 * Create the application.
	 */
	
	public Dashboard() {
		initialize();
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	protected void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 806, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("COURSE MANAGEMENT SYSTEM");
		lblNewLabel_5.setBackground(new Color(255, 128, 128));
		lblNewLabel_5.setForeground(new Color(68, 68, 69));
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, ३०));
		lblNewLabel_5.setBounds(176, 25, 493, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(187, 113, 605, 547);
		frame.getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 197, 253));
		layeredPane_1.add(panel_2, "name_605218713019400");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(248, 73, 100, 100);
		panel_2.add(lblNewLabel_2_2);
		
		JTextArea txtrThisIsA = new JTextArea();
		txtrThisIsA.setForeground(new Color(68, 68, 69));
		txtrThisIsA.setEditable(false);
		txtrThisIsA.setBackground(new Color(240, 240, 240));
		txtrThisIsA.setFont(new Font("Roboto", Font.PLAIN, 15));
		txtrThisIsA.setText("\r\nThis is a course management system for Herald College Kathmandu in\r\n\r\nwhich one can access numerous academic features using the menubar \r\n\r\nand the buttons present in different locations of this window as per your \r\n\r\naccessibility.\r\n\r\n\r\nYou can expect yourself to stay updated about every academic activity \r\n\r\nof yours on the back of this system.");
		txtrThisIsA.setBounds(64, 214, 500, 308);
		panel_2.add(txtrThisIsA);
		
		JPanel panel_4 = new JPanel();
		layeredPane_1.add(panel_4, "name_605218725898800");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 255));
		panel.setBounds(0, 204, 188, 456);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton_1 = new JButton("DASHBOARD");
		btnNewButton_1.setBounds(0, 47, 198, 32);
		btnNewButton_1.setBackground(new Color(68, 68, 69));
		btnNewButton_1.setForeground(new Color(116, 192, 67));
		btnNewButton_1.setFont(new Font("Roboto", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_2);
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("STUDENTS");
		btnNewButton_1_1.setBounds(0, 147, 188, 32);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentsInfoGUI c = new StudentsInfoGUI();
				StudentsInfoGUI.studenttable();
				Dashboard window = new Dashboard();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1_1.setForeground(new Color(116, 192, 67));
		btnNewButton_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		btnNewButton_1_1.setBackground(new Color(68, 68, 69));
		
		JButton btnNewButton_1_1_1 = new JButton("INSTRUCTORS");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeachersInfoGUI t = new TeachersInfoGUI();
				TeachersInfoGUI.Teacher();
				Dashboard d = new Dashboard();
				d.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnNewButton_1_1_1.setBounds(0, 257, 188, 32);
		btnNewButton_1_1_1.setForeground(new Color(116, 192, 67));
		btnNewButton_1_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		btnNewButton_1_1_1.setBackground(new Color(68, 68, 69));
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("ELECTIVES");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnNewButton_1_1_1_1_1.setBounds(0, 367, 188, 32);
		btnNewButton_1_1_1_1_1.setForeground(new Color(116, 192, 67));
		btnNewButton_1_1_1_1_1.setFont(new Font("Roboto", Font.BOLD, 15));
		btnNewButton_1_1_1_1_1.setBackground(new Color(68, 68, 69));
		panel.setLayout(null);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton_1_1);
		panel.add(btnNewButton_1_1_1);
		panel.add(btnNewButton_1_1_1_1_1);
		Image image2 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(116, 192, 67));
		panel_3.setBounds(385, 83, 264, 31);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(116, 192, 67));
		panel_3.add(menuBar, "name_561657935012200");
		JMenu file = new JMenu("Courses");
		file.setBackground(new Color(64, 197, 253));
		file.setFont(new Font("Roboto", Font.PLAIN, 12));
		JMenuItem item1 = new JMenuItem("Details");
		item1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				CoursesList oc2 = new CoursesList();
				CoursesList.course();
				Dashboard d = new Dashboard();
				d.frame.setVisible(false);
				frame.dispose();
			}
		});
		item1.setFont(new Font("Roboto", Font.PLAIN, 12));
		JMenuItem item2 = new JMenuItem("Add Courses");
		item2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				AddCourses add = new AddCourses();
				AddCourses.acourse();
				Dashboard d = new Dashboard();
				d.frame.setVisible(false);
				frame.dispose();
			}
		});
		item2.setFont(new Font("Roboto", Font.PLAIN, 12));
		JMenuItem item3 = new JMenuItem("Cancel Courses");
		item3.setFont(new Font("Roboto", Font.PLAIN, 12));
		JMenuItem item4 = new JMenuItem("Delete Courses");
		item4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				CoursesRemoval del = new CoursesRemoval();
				CoursesRemoval.delcourse();
				Dashboard d = new Dashboard();
				d.frame.setVisible(false);
				frame.dispose();
			}
		});
		item4.setFont(new Font("Roboto", Font.PLAIN, 12));

		file.add(item1);
		file.add(item2);
		file.add(item3);
		file.add(item4);
		
		menuBar.add(file);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Change Courses' Name");
		mntmNewMenuItem_12.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				ChangeCourse name = new ChangeCourse();
				ChangeCourse.modulechange();
				Dashboard d = new Dashboard();
				d.frame.setVisible(false);
				frame.dispose();
			}
		});
		mntmNewMenuItem_12.setFont(new Font("Roboto", Font.PLAIN, 12));
		file.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu = new JMenu("Modules");
		mnNewMenu.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("List");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				CourseInfoViewer view = new CourseInfoViewer();
			CourseInfoViewer.View();
			Dashboard window = new Dashboard();
			window.frame.setVisible(false);
			frame.dispose();
			}
		});
		mntmNewMenuItem.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Change modules' name");
		mntmNewMenuItem_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Results");
		mnNewMenu_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("See Your Scores");
		mntmNewMenuItem_4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				Login2 login2 = new Login2();
				Login2.ValidLogin();
				Dashboard dashboard = new Dashboard();
				dashboard.frame.setVisible(false);
				frame.dispose();
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Add Marks");
		mntmNewMenuItem_5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				AddMarks addmarks = new AddMarks();
				AddMarks.addmarks();
				Dashboard dashboard = new Dashboard();
				dashboard.frame.setVisible(false);
				frame.dispose();
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("View Marks");
		mntmNewMenuItem_6.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				StudentsAcademia a = new StudentsAcademia();
				StudentsAcademia.Disp();
				Dashboard dashboard = new Dashboard();
				dashboard.frame.setVisible(false);
				frame.dispose();
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("Improvements");
		mnNewMenu_2.setFont(new Font("Roboto", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Add Instructors");
		mntmNewMenuItem_10.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				new TeacherStudentRegistry();
				Dashboard window = new Dashboard();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		mntmNewMenuItem_10.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Remove People");
		mntmNewMenuItem_11.setFont(new Font("Roboto", Font.PLAIN, 12));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JButton btnNewButton = new JButton(" Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login1 l = new Login1();
				Login1.Login();
				frame.setVisible(false);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(698, 85, 84, 29);
		frame.getContentPane().add(btnNewButton);

	}
}

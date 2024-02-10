package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTextArea;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;

public class CoursesOverview {

	private JFrame frame;
	private static JLayeredPane layeredPane;
	private Register register;
	
	

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesOverview window = new CoursesOverview();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	void Switch_screen(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the application.
	 */
	public CoursesOverview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 520, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(115, 56, 321, 172);
		frame.getContentPane().add(layeredPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 240, 240));
		panel_2.setBounds(0, 0, 347, 244);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea txtrHeraldCollegeKathmandu = new JTextArea();
		txtrHeraldCollegeKathmandu.setEditable(false);
		txtrHeraldCollegeKathmandu.setBackground(new Color(240, 240, 240));
		txtrHeraldCollegeKathmandu.setText("Herald College Kathmandu offers compre\r\n-hensive undergraduate and post-graduate\r\nprogrammes with our BSc (Hons) in \r\nComputer Science, BSc (Hons) in \r\nInternational Business Management and\r\nInternational MBA courses. Please, enter ins\r\n-ide the app for new courses if added any.\r\n");
		txtrHeraldCollegeKathmandu.setBounds(10, 10, 327, 195);
		txtrHeraldCollegeKathmandu.setFont(new Font("Roboto", Font.PLAIN, 15));
		panel_2.add(txtrHeraldCollegeKathmandu);
		
		final JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(240, 240, 240));
		panel_2_1.setBounds(0, 0, 321, 207);
		layeredPane.add(panel_2_1);
		
		JTextArea txtrHeraldCollegeKathmandu_1 = new JTextArea();
		txtrHeraldCollegeKathmandu_1.setText("The course aims to produce software\r\ndevelopers who master the \r\nNextGenTechs i.e. ABC (Artificial \r\nIntelligence, Big Data & Cloud \r\nComputing).\r\n");
		txtrHeraldCollegeKathmandu_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		txtrHeraldCollegeKathmandu_1.setEditable(false);
		txtrHeraldCollegeKathmandu_1.setBackground(new Color(240, 240, 240));
		txtrHeraldCollegeKathmandu_1.setBounds(10, 39, 301, 139);
		panel_2_1.add(txtrHeraldCollegeKathmandu_1);
		
		final JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(240, 240, 240));
		panel_2_1_1.setBounds(0, 0, 321, 207);
		layeredPane.add(panel_2_1_1);
		
		JTextArea txtrHeraldCollegeKathmandu_1_1 = new JTextArea();
		txtrHeraldCollegeKathmandu_1_1.setText("One of the phenomena of the 21st century \r\nhas been that of globalization. This course\r\nwill equip you with the knowledge and \r\nexpertise to manage within this global \r\nframework related to business.\r\n");
		txtrHeraldCollegeKathmandu_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		txtrHeraldCollegeKathmandu_1_1.setEditable(false);
		txtrHeraldCollegeKathmandu_1_1.setBackground(new Color(240, 240, 240));
		txtrHeraldCollegeKathmandu_1_1.setBounds(10, 39, 301, 139);
		panel_2_1_1.add(txtrHeraldCollegeKathmandu_1_1);
		
		final JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBackground(new Color(240, 240, 240));
		panel_2_1_1_1.setBounds(0, 0, 321, 207);
		layeredPane.add(panel_2_1_1_1);
		
		JTextArea txtrHeraldCollegeKathmandu_1_1_1 = new JTextArea();
		txtrHeraldCollegeKathmandu_1_1_1.setText("The International MBA is developed to \r\nprovide pre-experience applicants with a\r\npost-grad general business qualification\r\nwhich will develop skills and knowledge\r\nin the management of business at national \r\nand international levels.\r\n");
		txtrHeraldCollegeKathmandu_1_1_1.setFont(new Font("Roboto", Font.PLAIN, 15));
		txtrHeraldCollegeKathmandu_1_1_1.setEditable(false);
		txtrHeraldCollegeKathmandu_1_1_1.setBackground(new Color(240, 240, 240));
		txtrHeraldCollegeKathmandu_1_1_1.setBounds(10, 39, 301, 139);
		panel_2_1_1_1.add(txtrHeraldCollegeKathmandu_1_1_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 56, 113, 207);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnNewButton = new JButton("BIT");
		btnNewButton.setFont(new Font("Roboto", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_2_1);
			}
		});
		btnNewButton.setBounds(10, 29, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BIBM");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_2_1_1);
			}
		});
		btnNewButton_1.setFont(new Font("Roboto", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 80, 85, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("IMBA");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch_screen(panel_2_1_1_1);
			}
		});
		btnNewButton_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		btnNewButton_1_1.setBounds(10, 130, 85, 21);
		panel.add(btnNewButton_1_1);
		
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
		lblNewLabel_3.setBounds(-202, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image2 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image2));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.setBounds(125, 221, 321, 37);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register.RegisterScreen();
				CoursesOverview oc = new CoursesOverview();
				oc.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSignup.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSignup.setBounds(217, 5, 94, 21);
		panel_3.add(btnSignup);
		btnSignup.setBackground(Color.LIGHT_GRAY);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnLogin.setBounds(113, 5, 94, 21);
		panel_3.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login1 Login = new Login1();
				Login1.Login();
				CoursesOverview oc = new CoursesOverview();
				oc.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnLogin.setBackground(Color.LIGHT_GRAY);
		
		JButton btnSubmit_1 = new JButton("<< Back\r\n");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Courses courses = new Courses();
				courses.courses();
				CoursesOverview window = new CoursesOverview();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1.setBounds(10, 5, 84, 21);
		panel_3.add(btnSubmit_1);
		
	}
	
    
}

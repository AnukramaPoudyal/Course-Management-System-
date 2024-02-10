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
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Results {

	static private JFrame frame;
	private JLabel Module1Value;
	Login1 login = new Login1();
	static private JPanel panel_2;
	static private JPanel panel_3;
	static private JPanel panel_4;
	static private JLabel Module9;
	static private JLabel Module9Value;
	static private JLabel Module17;
	static private JLabel Module17Value;
	static private JLabel Module18;
	static private JLabel Module18Value;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void Results() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results window = new Results();
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
	public Results() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 806, 785);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 792, 56);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-6, 23, 148, 23);
		panel_1.add(lblNewLabel_4);
		Image img = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(152, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image1 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image1));
		
		
		JLabel lblScores = new JLabel("MARKS");
		lblScores.setForeground(new Color(116, 192, 67));
		lblScores.setFont(new Font("Roboto", Font.BOLD, 30));
		lblScores.setBackground(SystemColor.menu);
		lblScores.setBounds(386, 83, 130, 23);
		frame.getContentPane().add(lblScores);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(326, 66, 50, 49);
		frame.getContentPane().add(lblNewLabel_1);
		Image image2 = new ImageIcon(this.getClass().getResource("/marks.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image2));
		
		JLabel Name = new JLabel("Full Name:");
		Name.setFont(new Font("Roboto", Font.BOLD, 15));
		Name.setBounds(31, 128, 107, 23);
		frame.getContentPane().add(Name);
		
		JLabel NameValue = new JLabel(Login1.firstname + " " + Login1.lastname);
		NameValue.setFont(new Font("Roboto", Font.BOLD, 15));
		NameValue.setBounds(139, 128, 225, 23);
		frame.getContentPane().add(NameValue);
		
		JLabel Course = new JLabel("Course:");
		Course.setFont(new Font("Roboto", Font.BOLD, 15));
		Course.setBounds(544, 128, 107, 23);
		frame.getContentPane().add(Course);
		
		JLabel CourseValue = new JLabel(Login1.course);
		CourseValue.setFont(new Font("Roboto", Font.BOLD, 15));
		CourseValue.setBounds(645, 128, 107, 23);
		frame.getContentPane().add(CourseValue);
		
		JPanel panel = new JPanel();
		panel.setBounds(31, 159, 726, 686);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Module1 = new JLabel("Module 1:");
		Module1.setBounds(0, 10, 103, 18);
		Module1.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module1);
		
		
		Module1Value = new JLabel(Integer.toString(Login1.module1));
		Module1Value.setBounds(105, 10, 103, 18);
		Module1Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module1Value);
		
		JLabel Module2 = new JLabel("Module 2:");
		Module2.setBounds(271, 10, 103, 18);
		Module2.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module2);
		
		JLabel Module2Value = new JLabel(Integer.toString(Login1.module2));
		Module2Value.setBounds(384, 10, 103, 18);
		Module2Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module2Value);
		
		JLabel Module3 = new JLabel("Module 3:");
		Module3.setBounds(568, 10, 103, 18);
		Module3.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module3);
		
		JLabel Module3Value = new JLabel(Integer.toString(Login1.module3));
		Module3Value.setBounds(681, 10, 88, 18);
		Module3Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module3Value);
		
		JLabel Module4 = new JLabel("Module 4:");
		Module4.setBounds(0, 59, 103, 18);
		Module4.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module4);
		
		JLabel Module4Value = new JLabel(Integer.toString(Login1.module4));
		Module4Value.setBounds(105, 59, 103, 18);
		Module4Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module4Value);
		
		JLabel Module5 = new JLabel("Module 5:");
		Module5.setBounds(271, 59, 103, 18);
		Module5.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module5);
		
		JLabel Module5Value = new JLabel(Integer.toString(login.module5));
		Module5Value.setBounds(384, 59, 103, 18);
		Module5Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module5Value);
		
		JLabel Module6 = new JLabel("Module 6:");
		Module6.setBounds(568, 59, 103, 18);
		Module6.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module6);
		
		JLabel Module6Value = new JLabel(Integer.toString(Login1.module6));
		Module6Value.setBounds(681, 59, 88, 18);
		Module6Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module6Value);
		
		JLabel Module7 = new JLabel("Module 7:");
		Module7.setBounds(0, 109, 103, 18);
		Module7.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module7);
		
		JLabel Module7Value = new JLabel(Integer.toString(Login1.module7));
		Module7Value.setBounds(105, 109, 103, 18);
		Module7Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module7Value);
		
		JLabel Module8 = new JLabel("Module 8:");
		Module8.setBounds(271, 109, 103, 18);
		Module8.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module8);
		
		JLabel Module8Value = new JLabel(Integer.toString(Login1.module8));
		Module8Value.setBounds(384, 109, 103, 18);
		Module8Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module8Value);
		
		Module9 = new JLabel("Module 9:");
		Module9.setBounds(568, 109, 103, 18);
		Module9.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module9);
		
	    Module9Value = new JLabel(Integer.toString(Login1.module9));
	    Module9Value.setBounds(681, 109, 103, 18);
		Module9Value.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Module9Value);
		
		panel_2 = new JPanel();
		panel_2.setBounds(0, 388, 740, 136);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel Module25 = new JLabel("Module 25:");
		Module25.setFont(new Font("Roboto", Font.BOLD, 15));
		Module25.setBounds(0, 21, 103, 18);
		panel_2.add(Module25);
		
		JLabel Module25Value = new JLabel(Integer.toString(Login1.module25));
		Module25Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module25Value.setBounds(106, 21, 103, 18);
		panel_2.add(Module25Value);
		
		JLabel Module26 = new JLabel("Module 26:");
		Module26.setFont(new Font("Roboto", Font.BOLD, 15));
		Module26.setBounds(272, 25, 103, 18);
		panel_2.add(Module26);
		
		JLabel Module26Value = new JLabel(Integer.toString(Login1.module26));
		Module26Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module26Value.setBounds(385, 25, 103, 18);
		panel_2.add(Module26Value);
		
		JLabel Module27 = new JLabel("Module 27:");
		Module27.setFont(new Font("Roboto", Font.BOLD, 15));
		Module27.setBounds(569, 25, 103, 18);
		panel_2.add(Module27);
		
		JLabel Module27Value = new JLabel(Integer.toString(Login1.module27));
		Module27Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module27Value.setBounds(685, 25, 55, 18);
		panel_2.add(Module27Value);
		
		JLabel Module28 = new JLabel("Module 28:");
		Module28.setFont(new Font("Roboto", Font.BOLD, 15));
		Module28.setBounds(0, 72, 88, 18);
		panel_2.add(Module28);
		
		JLabel Module28Value = new JLabel(Integer.toString(Login1.module28));
		Module28Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module28Value.setBounds(106, 72, 88, 18);
		panel_2.add(Module28Value);
		
		JLabel Module29 = new JLabel("Module 29:");
		Module29.setFont(new Font("Roboto", Font.BOLD, 15));
		Module29.setBounds(272, 72, 103, 18);
		panel_2.add(Module29);
		
		JLabel Module29Value = new JLabel(Integer.toString(Login1.module29));
		Module29Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module29Value.setBounds(385, 72, 103, 18);
		panel_2.add(Module29Value);
		
		JLabel Module30 = new JLabel("Module 30:");
		Module30.setFont(new Font("Roboto", Font.BOLD, 15));
		Module30.setBounds(569, 72, 103, 18);
		panel_2.add(Module30);
		
		JLabel Module30Value = new JLabel(Integer.toString(Login1.module30));
		Module30Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module30Value.setBounds(685, 72, 88, 18);
		panel_2.add(Module30Value);
		
		JLabel Module31 = new JLabel("Module 31:");
		Module31.setFont(new Font("Roboto", Font.BOLD, 15));
		Module31.setBounds(0, 119, 103, 18);
		panel_2.add(Module31);
		
		JLabel Module31Value = new JLabel(Integer.toString(Login1.module31));
		Module31Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module31Value.setBounds(106, 119, 103, 18);
		panel_2.add(Module31Value);
		
		JLabel Module32 = new JLabel("Module 32:");
		Module32.setFont(new Font("Roboto", Font.BOLD, 15));
		Module32.setBounds(272, 119, 88, 18);
		panel_2.add(Module32);
		
		JLabel Module32Value = new JLabel(Integer.toString(Login1.module32));
		Module32Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module32Value.setBounds(385, 119, 103, 18);
		panel_2.add(Module32Value);
		
		panel_3 = new JPanel();
		panel_3.setBounds(0, 291, 763, 98);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel Module19 = new JLabel("Module 19:");
		Module19.setFont(new Font("Roboto", Font.BOLD, 15));
		Module19.setBounds(0, 20, 103, 18);
		panel_3.add(Module19);
		
		JLabel Module19Value = new JLabel(Integer.toString(Login1.module19));
		Module19Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module19Value.setBounds(104, 20, 103, 18);
		panel_3.add(Module19Value);
		
		JLabel Module20 = new JLabel("Module 20:");
		Module20.setFont(new Font("Roboto", Font.BOLD, 15));
		Module20.setBounds(270, 20, 103, 18);
		panel_3.add(Module20);
		
		JLabel Module20Value = new JLabel(Integer.toString(Login1.module20));
		Module20Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module20Value.setBounds(383, 20, 103, 18);
		panel_3.add(Module20Value);
		
		JLabel Module22 = new JLabel("Module 22:");
		Module22.setFont(new Font("Roboto", Font.BOLD, 15));
		Module22.setBounds(0, 70, 103, 18);
		panel_3.add(Module22);
		
		JLabel Module22Value = new JLabel(Integer.toString(Login1.module22));
		Module22Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module22Value.setBounds(104, 70, 103, 18);
		panel_3.add(Module22Value);
		
		JLabel Module23 = new JLabel("Module 23:");
		Module23.setFont(new Font("Roboto", Font.BOLD, 15));
		Module23.setBounds(270, 70, 103, 18);
		panel_3.add(Module23);
		
		JLabel Module23Value = new JLabel(Integer.toString(Login1.module23));
		Module23Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module23Value.setBounds(383, 70, 103, 18);
		panel_3.add(Module23Value);
		
		JLabel Module24 = new JLabel("Module 24:");
		Module24.setFont(new Font("Roboto", Font.BOLD, 15));
		Module24.setBounds(571, 70, 103, 18);
		panel_3.add(Module24);
		
		JLabel Module21Value = new JLabel(Integer.toString(Login1.module21));
		Module21Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module21Value.setBounds(684, 20, 88, 18);
		panel_3.add(Module21Value);
		
		JLabel Module21 = new JLabel("Module 21:");
		Module21.setFont(new Font("Roboto", Font.BOLD, 15));
		Module21.setBounds(571, 20, 103, 18);
		panel_3.add(Module21);
		
		JLabel Module24Value = new JLabel(Integer.toString(Login1.module24));
		Module24Value.setBounds(684, 70, 88, 18);
		panel_3.add(Module24Value);
		Module24Value.setFont(new Font("Roboto", Font.BOLD, 15));
		
		panel_4 = new JPanel();
		panel_4.setBounds(0, 137, 746, 156);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel Module10 = new JLabel("Module 10:");
		Module10.setBounds(0, 20, 103, 18);
		panel_4.add(Module10);
		Module10.setFont(new Font("Roboto", Font.BOLD, 15));
		
		JLabel Module10Value = new JLabel(Integer.toString(Login1.module10));
		Module10Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module10Value.setBounds(105, 20, 103, 18);
		panel_4.add(Module10Value);
		
		JLabel Module11 = new JLabel("Module 11:");
		Module11.setFont(new Font("Roboto", Font.BOLD, 15));
		Module11.setBounds(272, 20, 103, 18);
		panel_4.add(Module11);
		
		JLabel Module11Value = new JLabel(Integer.toString(Login1.module11));
		Module11Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module11Value.setBounds(385, 20, 103, 18);
		panel_4.add(Module11Value);
		
		JLabel Module12 = new JLabel("Module 12:");
		Module12.setFont(new Font("Roboto", Font.BOLD, 15));
		Module12.setBounds(571, 20, 103, 18);
		panel_4.add(Module12);
		
		JLabel Module12Value = new JLabel(Integer.toString(login.module12));
		Module12Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module12Value.setBounds(684, 20, 62, 18);
		panel_4.add(Module12Value);
		
		JLabel Module13 = new JLabel("Module 13:");
		Module13.setFont(new Font("Roboto", Font.BOLD, 15));
		Module13.setBounds(0, 69, 103, 18);
		panel_4.add(Module13);
		
		JLabel Module13Value = new JLabel(Integer.toString(Login1.module13));
		Module13Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module13Value.setBounds(105, 69, 103, 18);
		panel_4.add(Module13Value);
		
		JLabel Module14Value = new JLabel(Integer.toString(Login1.module14));
		Module14Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module14Value.setBounds(385, 69, 103, 18);
		panel_4.add(Module14Value);
		
		JLabel Module14 = new JLabel("Module 14:");
		Module14.setFont(new Font("Roboto", Font.BOLD, 15));
		Module14.setBounds(272, 69, 103, 18);
		panel_4.add(Module14);
		
		JLabel Module15 = new JLabel("Module 15:");
		Module15.setFont(new Font("Roboto", Font.BOLD, 15));
		Module15.setBounds(571, 69, 103, 18);
		panel_4.add(Module15);
		
		JLabel Module15Value = new JLabel(Integer.toString(Login1.module15));
		Module15Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module15Value.setBounds(684, 69, 88, 18);
		panel_4.add(Module15Value);
		
		JLabel Module16 = new JLabel("Module 16:");
		Module16.setFont(new Font("Roboto", Font.BOLD, 15));
		Module16.setBounds(0, 120, 103, 18);
		panel_4.add(Module16);
		
		JLabel Module16Value = new JLabel(Integer.toString(Login1.module16));
		Module16Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module16Value.setBounds(105, 120, 103, 18);
		panel_4.add(Module16Value);
		
		Module17 = new JLabel("Module 17:");
		Module17.setFont(new Font("Roboto", Font.BOLD, 15));
		Module17.setBounds(272, 120, 103, 18);
		panel_4.add(Module17);
		
		Module17Value = new JLabel(Integer.toString(Login1.module17));
		Module17Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module17Value.setBounds(385, 120, 103, 18);
		panel_4.add(Module17Value);
		
		Module18 = new JLabel("Module 18:");
		Module18.setFont(new Font("Roboto", Font.BOLD, 15));
		Module18.setBounds(571, 120, 103, 18);
		panel_4.add(Module18);
		
		Module18Value = new JLabel(Integer.toString(Login1.module18));
		Module18Value.setFont(new Font("Roboto", Font.BOLD, 15));
		Module18Value.setBounds(684, 120, 88, 18);
		panel_4.add(Module18Value);
		
		JLabel Result = new JLabel("Progression:");
		Result.setBounds(271, 555, 88, 18);
		Result.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(Result);
		
		JLabel ResultValue = new JLabel(Login1.Progression);
		ResultValue.setBounds(384, 555, 103, 18);
		ResultValue.setFont(new Font("Roboto", Font.BOLD, 15));
		panel.add(ResultValue);
		
		JButton btnSubmit_1 = new JButton("<< Back\r\n");
		btnSubmit_1.setBounds(0, 555, 84, 21);
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.Dashboard();
				Results window = new Results();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		panel.add(btnSubmit_1);
		
		JButton btnSubmit_1_1 = new JButton("Modules >>");
		btnSubmit_1_1.setBounds(623, 554, 103, 21);
		btnSubmit_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CourseInfoViewer view = new CourseInfoViewer();
				view.View();
				Results window = new Results();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1_1.setBackground(Color.LIGHT_GRAY);
		panel.add(btnSubmit_1_1);
	}
	
	
}

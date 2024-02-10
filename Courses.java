package studentCourseManagement;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Courses {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courses window = new Courses();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void courses()
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courses window = new Courses();
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
	public Courses() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.getContentPane().setEnabled(false);
		frame.setBounds(100, 100, 640, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("HERALD COLLEGE KATHMANDU");
		lblNewLabel.setBackground(new Color(116, 192, 67));
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 17));
		lblNewLabel.setBounds(162, 99, 320, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("OUR COURSES");
		lblNewLabel_1.setForeground(new Color(116, 192, 67));
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 37));
		lblNewLabel_1.setBounds(162, 152, 320, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/0.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(28, 99, 100, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 56);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-16, 23, 148, 23);
		panel.add(lblNewLabel_4);
		Image image = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(image));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(-202, 10, 617, 36);
		panel.add(lblNewLabel_3);
		Image image1 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image1));
		
		
		JButton btnNewButton = new JButton("Next >>");
		btnNewButton.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CoursesOverview o = new CoursesOverview();
				o.NewScreen();
				Courses course = new Courses();
				course.frame.setVisible(false);
				frame.dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(220, 242, 94, 21);
		frame.getContentPane().add(btnNewButton);
	}
}

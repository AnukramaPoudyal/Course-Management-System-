package studentCourseManagement;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CoursesList {

	private JFrame frame;
	private java.sql.Statement stmt;
	private ResultSet rs;
	private JTable table_3;
	private JScrollPane scrollPane_3;
	Object[] row = new Object[2];
	private Dimension size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesList window = new CoursesList();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void course() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesList window = new CoursesList();
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
	public CoursesList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1516, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel year4 = new JPanel();
		year4.setBounds(10, 595, 1454, 158);
		frame.getContentPane().add(year4);
		year4.setLayout(null);
		
		JScrollPane scrollPane_3_1 = new JScrollPane();
		scrollPane_3_1.setBounds(0, 144, 1502, 124);
		scrollPane_3_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane_3_1);
		
		table_3 = new JTable();
		table_3.setFillsViewportHeight(true);
		table_3.setFont(new Font("Roboto", Font.PLAIN, 12));
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Course", "Description"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_3.getColumnModel().getColumn(0).setPreferredWidth(5);
		table_3.getColumnModel().getColumn(0).setMinWidth(5);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(1).setMinWidth(115);

		scrollPane_3_1.setViewportView(table_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 2, 1524, 56);
		panel_1.setLayout(null);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-6, 23, 148, 23);
		panel_1.add(lblNewLabel_4);
		Image img = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(863, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image1 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image1));
		
		JButton btnSubmit_1 = new JButton("<< Back\r\n");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard d = new Dashboard();
				d.Dashboard();
				CoursesList window = new CoursesList();
				window.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnSubmit_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnSubmit_1.setBackground(Color.LIGHT_GRAY);
		btnSubmit_1.setBounds(20, 303, 84, 21);
		frame.getContentPane().add(btnSubmit_1);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(596, 68, 50, 49);
		frame.getContentPane().add(lblNewLabel_1);
		Image image2 = new ImageIcon(this.getClass().getResource("/marks.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(image2));
		
		JLabel lblCourses = new JLabel("COURSES");
		lblCourses.setForeground(new Color(116, 192, 67));
		lblCourses.setFont(new Font("Roboto", Font.BOLD, 30));
		lblCourses.setBackground(SystemColor.menu);
		lblCourses.setBounds(667, 84, 153, 23);
		frame.getContentPane().add(lblCourses);
		
		DefaultTableModel Model = (DefaultTableModel) table_3.getModel();
		
		   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		    Connection con;
			
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/records", "root", "");
			

		    stmt = con.createStatement();

		    rs = stmt.executeQuery("SELECT Course_Name, Description FROM Courses");

		    DefaultTableModel model = new DefaultTableModel();
		    
		    while (rs.next()) {
		      row[0] = rs.getObject("Course_Name");
		      row[1] = rs.getObject("Description");
		      model.addRow(row);
		    }

		    Object tbData[] = {row[0],row[1]};
            Model.addRow(tbData);
           

		   } catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		   catch (SQLException e) {
				e.printStackTrace();
			}
		  }
}

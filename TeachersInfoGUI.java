package studentCourseManagement;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TeachersInfoGUI {

	private JFrame frame;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private ResultSetMetaData rsmd;
	private String role;
	private PreparedStatement statement;
	private ResultSet res;
	private String name;
	private String year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachersInfoGUI window = new TeachersInfoGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void Teacher() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeachersInfoGUI window = new TeachersInfoGUI();
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
	public TeachersInfoGUI() {
		initialize();
		try {
			Course();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 396);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setBounds(10, 132, 426, 196);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 426, 236);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"Year", "Course", "Student"
		}
		) {
		boolean[] columnEditables = new boolean[] {
		false, false, true
		};
		public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
		}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 436, 56);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(-16, 23, 148, 23);
		panel_1.add(lblNewLabel_4);
		Image img1 = new ImageIcon(this.getClass().getResource("/uowlogo.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(-202, 10, 617, 36);
		panel_1.add(lblNewLabel_3);
		Image image2 = new ImageIcon(this.getClass().getResource("/h.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(image2));
		
		JLabel lblStudents = new JLabel("STUDENTS");
		lblStudents.setForeground(new Color(116, 192, 67));
		lblStudents.setFont(new Font("Roboto", Font.BOLD, 30));
		lblStudents.setBackground(SystemColor.menu);
		lblStudents.setBounds(139, 79, 220, 29);
		frame.getContentPane().add(lblStudents);
		
		}
		
		void Course() throws ClassNotFoundException {
			StudentsList list = new StudentsList();
			 for (int i = 1; i <= list.Database("jdbc:mysql://localhost:3306/records","root",""); i++) {
			  try {
			     Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");
			     String sql = "SELECT * FROM user where id = ? AND Designation = ?";
			     PreparedStatement statement = Connect.prepareStatement(sql);
			     statement.setInt(1, i);
			     statement.setString(2, "Teacher");


			     ResultSet rs = statement.executeQuery();
			     ResultSetMetaData rsmd = rs.getMetaData();

			     while(rs.next()) {
			    	year = String.valueOf(rs.getInt("Level"));
			        role= rs.getString("Designation");
			        name= rs.getString("Username");
			        

			        Object tbData[] = {year, role, name};
			        DefaultTableModel Model = (DefaultTableModel) table.getModel();
			        Model.addRow(tbData);
			        table.updateUI();
			     } }catch (SQLException e) {
			     System.out.println(e);
			  }
			}
		}	
}


package studentCourseManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class CourseInfoViewer {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private int Duration;
	private java.sql.Statement Statement;
	private ResultSetMetaData rsmd;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseInfoViewer window = new CourseInfoViewer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void View() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseInfoViewer window = new CourseInfoViewer();
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
	public CourseInfoViewer() {
		initialize();
		Firstyear();
		Secondyear();
		Thirdyear();
		Fourthyear();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setResizable(false);
		frame.setBounds(50, 0, 1478, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
				JLabel lblNewLabel_4 = new JLabel("");
				lblNewLabel_4.setBounds(0, 25, 148, 23);
				frame.getContentPane().add(lblNewLabel_4);
		

		JPanel year1 = new JPanel();
		year1.setBackground(new Color(64, 197, 253));
		year1.setBounds(10, 58, 1454, 143);
		frame.getContentPane().add(year1);
		year1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 48, 1455, 171);
		year1.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"Course", "Module1", "Module2", "Module3", "Module4", "Module5", "Module6", "Module7", "Module8"
		}
		) {
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] {
		false, false, false, false, false, false, false, false, false
		};
		public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
		}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(175);
		table.getColumnModel().getColumn(0).setMinWidth(115);
		table.getColumnModel().getColumn(1).setPreferredWidth(175);
		table.getColumnModel().getColumn(1).setMinWidth(115);
		table.getColumnModel().getColumn(2).setPreferredWidth(175);
		table.getColumnModel().getColumn(2).setMinWidth(115);
		table.getColumnModel().getColumn(3).setPreferredWidth(175);
		table.getColumnModel().getColumn(3).setMinWidth(115);
		table.getColumnModel().getColumn(4).setPreferredWidth(175);
		table.getColumnModel().getColumn(4).setMinWidth(115);
		table.getColumnModel().getColumn(5).setPreferredWidth(175);
		table.getColumnModel().getColumn(5).setMinWidth(115);
		table.getColumnModel().getColumn(6).setPreferredWidth(175);
		table.getColumnModel().getColumn(6).setMinWidth(115);
		table.getColumnModel().getColumn(7).setPreferredWidth(175);
		table.getColumnModel().getColumn(7).setMinWidth(115);
		table.getColumnModel().getColumn(8).setPreferredWidth(175);
		table.getColumnModel().getColumn(8).setMinWidth(115);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setLayout(null);
		panel_1.setBounds(0, -28, 1455, 56);
		year1.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("MODULES");
		lblNewLabel_1.setBackground(new Color(255, 128, 128));
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, १८));
		lblNewLabel_1.setBounds(700, 29, 97, 27);
		panel_1.add(lblNewLabel_1);
		


		JPanel year2 = new JPanel();
		year2.setBackground(new Color(64, 197, 253));
		year2.setBounds(10, 203, 1454, 171);
		frame.getContentPane().add(year2);
		year2.setLayout(null);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 49, 1454, 171);
		year2.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"Course", "Module9", "Module10", "Module11", "Module12", "Module13", "Module14", "Module15", "Module16"
		}
		) {
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] {
		false, false, false, false, false, false, false, false, false
		};
		public boolean isCellEditable(int row, int column) {
		return columnEditables[column];

		}
		});
		table_1.getColumnModel().getColumn(0).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(0).setMinWidth(115);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(1).setMinWidth(115);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(2).setMinWidth(115);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(3).setMinWidth(115);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(4).setMinWidth(115);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(5).setMinWidth(115);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(6).setMinWidth(115);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(7).setMinWidth(115);
		table_1.getColumnModel().getColumn(8).setPreferredWidth(175);
		table_1.getColumnModel().getColumn(8).setMinWidth(115);
		scrollPane_1.setViewportView(table_1);

		JPanel year3 = new JPanel();
		year3.setBackground(new Color(64, 197, 253));
		year3.setBounds(10, 379, 1454, 220);
		frame.getContentPane().add(year3);
		year3.setLayout(null);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 49, 1454, 171);
		year3.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"Course", "Module17", "Module18", "Module19", "Module20", "Module21", "Module22", "Module23", "Module24"
		}
        ) {
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] {
		false, false, false, false, false, false, false, false, false
		};
		public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
		}
		});
		table_2.getColumnModel().getColumn(0).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(0).setMinWidth(115);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(1).setMinWidth(115);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(2).setMinWidth(115);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(3).setMinWidth(115);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(4).setMinWidth(115);
		table_2.getColumnModel().getColumn(5).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(5).setMinWidth(115);
		table_2.getColumnModel().getColumn(6).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(6).setMinWidth(115);
		table_2.getColumnModel().getColumn(7).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(7).setMinWidth(115);
		table_2.getColumnModel().getColumn(8).setPreferredWidth(175);
		table_2.getColumnModel().getColumn(8).setMinWidth(115);
		scrollPane_2.setViewportView(table_2);

		JPanel year4 = new JPanel();
		year4.setBackground(new Color(64, 197, 253));
		year4.setBounds(10, 595, 1454, 158);
		frame.getContentPane().add(year4);
		year4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Scores");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				Results r = new Results();
				r.Results();
				CourseInfoViewer view = new CourseInfoViewer();
				view.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Roboto", Font.PLAIN, 10));
		btnNewButton_2.setBounds(1347, 127, 85, 21);
		year4.add(btnNewButton_2);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1454, 115);
		year4.add(scrollPane_3);

		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"Course", "Module25", "Module26", "Module27", "Module28", "Module29", "Module30", "Module31", "Module32"
		}
		) {
		/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] {
		false, false, false, false, false, false, false, false, false
		};
		public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
		}
		});
		table_3.getColumnModel().getColumn(0).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(0).setMinWidth(115);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(1).setMinWidth(115);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(2).setMinWidth(115);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(3).setMinWidth(115);
		table_3.getColumnModel().getColumn(4).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(4).setMinWidth(115);
		table_3.getColumnModel().getColumn(5).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(5).setMinWidth(115);
		table_3.getColumnModel().getColumn(6).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(6).setMinWidth(115);
		table_3.getColumnModel().getColumn(7).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(7).setMinWidth(115);
		table_3.getColumnModel().getColumn(8).setPreferredWidth(175);
		table_3.getColumnModel().getColumn(8).setMinWidth(115);
		scrollPane_3.setViewportView(table_3);
		
		JButton btnNewButton_1 = new JButton("Return");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) 
			{
				Dashboard d = new Dashboard();
				d.Dashboard();
				CourseInfoViewer view = new CourseInfoViewer();
				view.frame.setVisible(false);
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Roboto", Font.PLAIN, 10));
		btnNewButton_1.setBounds(27, 127, 85, 21);
		year4.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(837, 12, 617, 36);
		frame.getContentPane().add(lblNewLabel_3);

		if(Duration==1) {
		year2.setVisible(false);
		year3.setVisible(false);
		year4.setVisible(false);

		}
		if(Duration==2) {

		year3.setVisible(false);
		year4.setVisible(false);

		}
		if(Duration==3) {


		year4.setVisible(false);

		}

		}
	
	
		 void Firstyear() {
		try {
		Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

		Statement = Connect.createStatement();
		ResultSet rs = Statement.executeQuery("SELECT * FROM Courses");

		    rsmd = rs.getMetaData();
		   		   		   
		            while(rs.next()) {
		         
		            String Course= rs.getString("Course_name");
		            String Module1 = rs.getString("Module1");
		            String Module2 = rs.getString("Module2");
		            String Module3 = rs.getString("Module3");
		            String Module4 = rs.getString("Module4");
		            String Module5 = rs.getString("Module5");
		            String Module6 = rs.getString("Module6");
		            String Module7 = rs.getString("Module7");
		            String Module8 = rs.getString("Module8");
		            Duration = rs.getInt("Duration");
		           		           		           
		            Object tbData[] = {Course,Module1,Module2,Module3,Module4,Module5,Module6,Module7,Module8};
		            DefaultTableModel Model = (DefaultTableModel) table.getModel();
		            Model.addRow(tbData);
		           
		             }
		            } catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);

		 
		 }
		 }
		 
		 void Secondyear() {
		try {
		Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

		Statement = Connect.createStatement();
		ResultSet rs = Statement.executeQuery("SELECT * FROM Courses");

		    ResultSetMetaData rsmd = rs.getMetaData();
		   		   		   
		            while(rs.next()) {
		         
		            String Course= rs.getString("Course_name");  
		            String Module9 = rs.getString("Module9");
		            String Module10 = rs.getString("Module10");
		            String Module11 = rs.getString("Module11");
		            String Module12 = rs.getString("Module12");
		            String Module13 = rs.getString("Module13");
		            String Module14 = rs.getString("Module14");
		            String Module15 = rs.getString("Module15");
		            String Module16 = rs.getString("Module16");
		           
		           
		           
		            Object tbData[] = {Course,Module9,Module10,Module11,Module12,Module13,Module14,Module15,Module16};
		            DefaultTableModel Model = (DefaultTableModel) table_1.getModel();
		            Model.addRow(tbData);
		           
		             }
		            } catch (SQLException e) {
		System.out.println(e);
		 
		 }
		 }
		 void Thirdyear() {
		try {
		Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

		Statement = Connect.createStatement();
		ResultSet rs = Statement.executeQuery("SELECT * FROM Courses");

		    ResultSetMetaData rsmd = rs.getMetaData();
		   
		   
		   
		            while(rs.next()) {
		         

		            String Course= rs.getString("Course_name");
		            String Module17 = rs.getString("Module17");
		            String Module18 = rs.getString("Module18");
		            String Module19 = rs.getString("Module19");
		            String Module20 = rs.getString("Module20");
		            String Module21 = rs.getString("Module21");
		            String Module22 = rs.getString("Module22");
		            String Module23 = rs.getString("Module23");
		            String Module24 = rs.getString("Module24");
		           
		           
		           
		            Object tbData[] = {Course,Module17,Module18,Module19,Module20,Module21,Module22,Module23,Module24};
		            DefaultTableModel Model = (DefaultTableModel) table_2.getModel();
		            Model.addRow(tbData);
		           
		             }
		            } catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);

		 
		 }
		 }
		 void Fourthyear() {
		try {
		Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/records","root","");

		Statement = Connect.createStatement();
		ResultSet rs = Statement.executeQuery("SELECT * FROM Courses");

		    ResultSetMetaData rsmd = rs.getMetaData();
		   
		   
		   
		            while(rs.next()) {
		         

		            String Course= rs.getString("Course_name");  
		            String Module25 = rs.getString("Module25");
		            String Module26 = rs.getString("Module26");
		            String Module27 = rs.getString("Module27");
		            String Module28 = rs.getString("Module28");
		            String Module29 = rs.getString("Module29");
		            String Module30 = rs.getString("Module30");
		            String Module31 = rs.getString("Module31");
		            String Module32 = rs.getString("Module32");
		           
		           
		           
		            Object tbData[] = {Course,Module25,Module26,Module27,Module28,Module29,Module30,Module31,Module32};
		            DefaultTableModel Model = (DefaultTableModel) table_3.getModel();
		            Model.addRow(tbData);
		           
		             }
		            } catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);

		 
		 }
	}
}

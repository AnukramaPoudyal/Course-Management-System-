package studentCourseManagement;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TeacherStudentRemoval {

private JFrame frame;
private JTextField textField;
protected String Coursename;


/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
	TeacherStudentRemoval window = new TeacherStudentRemoval();
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
public TeacherStudentRemoval() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 450, 300);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
frame.setVisible(true);

JPanel panel = new JPanel();
panel.setBounds(0, 0, 450, 272);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblNewLabel = new JLabel("Removing Account");
lblNewLabel.setBounds(24, 10, 209, 20);
lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
panel.add(lblNewLabel);

JLabel lblEnterUsername = new JLabel("Enter Username:");
lblEnterUsername.setBounds(46, 66, 209, 20);
lblEnterUsername.setFont(new Font("Arial", Font.BOLD, 20));
panel.add(lblEnterUsername);

textField = new JTextField();
textField.setBounds(46, 96, 302, 36);
textField.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 16));
panel.add(textField);
textField.setColumns(10);

JButton btnNewButton = new JButton("Remove Account");
btnNewButton.setBounds(56, 158, 221, 52);
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String Username = textField.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursework","root","");
           
            String queryString2 = "SELECT Username FROM user WHERE Username = ?";
           
            PreparedStatement statement1 = Connect.prepareStatement(queryString2);
         
            statement1.setString(1, Username);
           
           ResultSet result = statement1.executeQuery();
           
            if (result.next() && result.getString("Username").equals(Username))
            {
                JOptionPane.showMessageDialog(null, "Deleted!!!", "Success", JOptionPane.INFORMATION_MESSAGE);
             
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Student Not Found", "Error", JOptionPane.ERROR_MESSAGE);
                                   
            }
           
           
           
           
            String queryString3 ="DELETE FROM user WHERE Username= '"+ Username +"'";
            PreparedStatement statement = Connect.prepareStatement(queryString3);
           
             
               statement.executeUpdate();    
               Connect.close();
       
    }catch (ClassNotFoundException f) {
        // TODO Auto-generated catch block
        System.out.println(f);
    }catch (SQLException r) {
        // TODO Auto-generated catch block
    System.out.println(r);
   
         
    }


}
});
btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
panel.add(btnNewButton);

JButton btnBack = new JButton("Back");
btnBack.setBounds(309, 216, 116, 37);
btnBack.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
new Dashboard();
frame.setVisible(false);
}
});
btnBack.setFont(new Font("Arial", Font.PLAIN, 16));
panel.add(btnBack);
}
}
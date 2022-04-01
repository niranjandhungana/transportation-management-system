package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class Resister extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField tname;
	private JTextField temail;
	private static final String regex ="^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
	private JTextField tphone;
	private JPasswordField tpassword;
	private JPasswordField passwordField_1;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Resister r = new Resister();
		r.setVisible(true);
		
	
		
	}

	/**
	 * Create the frame.
	 */
	public Resister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(114, 11, 161, 31);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(28, 66, 100, 31);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("email-id");
		lblNewLabel_2.setBounds(28, 100, 90, 36);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Phone-no");
		lblNewLabel_3.setBounds(28, 166, 90, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("password");
		lblNewLabel_4.setBounds(28, 208, 77, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("conform-password");
		lblNewLabel_5.setBounds(10, 239, 109, 14);
		contentPane.add(lblNewLabel_5);
		
		tname = new JTextField();
		tname.setBounds(128, 71, 88, 20);
		contentPane.add(tname);
		tname.setColumns(10);
		
		temail = new JTextField();
		temail.setColumns(10);
		temail.setBounds(128, 108, 88, 20);
		contentPane.add(temail);
		
		tphone = new JTextField();
		tphone.setColumns(10);
		tphone.setBounds(128, 171, 88, 20);
		contentPane.add(tphone);
		
		tpassword = new JPasswordField();
		tpassword.setBounds(128, 205, 88, 20);
		contentPane.add(tpassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(128, 236, 88, 20);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = tname.getText();
				String email = temail.getText();
				String gender = "male";
				String phoneno = tphone.getText();
				int len = phoneno.length();
				String password = tpassword.getText();
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(email);
				
				if(len !=10) {
					JOptionPane.showMessageDialog(btnNewButton, "Enter a valid phoneno");
				}
				else if (name.isEmpty() || email.isEmpty() || gender.isEmpty() || phoneno.isEmpty() || password.isEmpty()) {
				    JOptionPane.showMessageDialog(btnNewButton, "Invali Entry");	
				}
				else if (!matcher.matches()) {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid Email");
				}
				else {
				try {
					Connection c = DriverManager.getConnection("jdbc:mysql://localhost/transportation", "root" , "igor4u");
					
					
					PreparedStatement st = c.prepareStatement("insert into login (name ,email_id ,gender , phone_no , password)" + "values(? , ?,? ,? ,?)");
					
					
					st.setString(1, name);
					st.setString(2, email);
					
					st.setString(3, gender);
					
					st.setString(4, phoneno);
					
					st.setString(5, password);
					
					
					
					
					int rs = st.executeUpdate();
					if(rs != 0) {
						
						
						JOptionPane.showMessageDialog(btnNewButton,"Login successfull");
						
					}
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				loginpage p = new loginpage();
				p.setVisible(true);
				
				dispose();
				
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(80, 290, 136, 33);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setBounds(28, 133, 86, 20);
		contentPane.add(lblNewLabel_6);
		String Gender[]= {"MALE","FEMALE","OTHERS"};
		JComboBox tcom = new JComboBox(Gender);
		
		tcom.setBounds(128, 140, 88, 20);
		
		contentPane.add(tcom);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\pic trans\\transport pic.jpg"));
		lblNewLabel_7.setBounds(226, 0, 358, 361);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\pic trans\\front.jpg"));
		lblNewLabel_8.setBounds(0, 0, 216, 361);
		contentPane.add(lblNewLabel_8);
		
	}
}

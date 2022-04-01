package transportation;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		loginpage frame = new loginpage();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO TRANSPORTATION SYSTEM ");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(130, 32, 334, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(90, 91, 101, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(90, 138, 101, 22);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(191, 94, 131, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(196, 140, 126, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(221, 205, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Resister r = new Resister();
				r.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportation","root" , "igor4u");
				
				
				
				
				
				String name=textField.getText();
				String password=passwordField.getText();
				
				
				
				PreparedStatement st = c.prepareStatement("select name , password from login where name=? and password=?");
				
				st.setString(1, name);
				st.setString(2,password);
				
				
				ResultSet rs = st.executeQuery();
				
				
				if(rs.next())
				{
					
					JOptionPane.showMessageDialog(btnNewButton,"Login successfull");
					dispose();
					content1 c1=new content1();
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton_1,"sorry");
					
				}
				
				}catch(SQLException el) {
					
					System.out.print(el);
				}
				
				
				
				
				content1 cn = new content1();
				cn.setVisible(true);
				dispose();
			}
		
			}
		
				);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(458, 276, 116, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\NIRANJAN DHUNGANA\\Desktop\\green-wall-mockup-with-green-plant-shelf3d-rendering_41470-4114.jpg"));
		lblNewLabel_3.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel_3);
	}
}


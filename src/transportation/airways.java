package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;

public class airways extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					airways frame = new airways();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public airways() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nepal_Airlines");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(47, 51, 150, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton== btnNewButton)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel = new JLabel("AIRLINES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(262, 22, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ECO  RS 5000/-");
		lblNewLabel_1.setBounds(57, 85, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BUS    RS  10000/-");
		lblNewLabel_2.setBounds(57, 110, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ECO    RS 4000/-");
		lblNewLabel_3.setBounds(396, 87, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Air_India");
		btnNewButton_1.setBounds(383, 51, 133, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton_1== btnNewButton_1)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("BUS    RS17898/-");
		lblNewLabel_4.setBounds(396, 110, 98, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Air_Asia");
		btnNewButton_2.setBounds(47, 200, 150, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton_2== btnNewButton_2)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("ECO     RS 4700/-");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setBounds(57, 234, 88, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("BUS   RS  20000/-");
		lblNewLabel_6.setBounds(57, 265, 88, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_3 = new JButton("Emirates");
		btnNewButton_3.setBounds(383, 200, 133, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton_3== btnNewButton_3)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel_7 = new JLabel("ECO     RS 4000/-");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(396, 240, 98, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("BUS     RS6575/-");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(396, 265, 98, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("      ");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\NIRANJAN DHUNGANA\\Desktop\\istockphoto-1278067350-170667a.jpg"));
		lblNewLabel_9.setBounds(30, 5, 584, 350);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\pic trans\\AAAA - Copy.jpg"));
		lblNewLabel_10.setBounds(-16, 0, 600, 361);
		contentPane.add(lblNewLabel_10);
		
	}
}

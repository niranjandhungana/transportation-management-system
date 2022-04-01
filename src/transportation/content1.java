package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class content1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	
public static void main(String [] args) {
	
	
	content1 c = new content1();
	c.setVisible(true);
}
	/**
	 * Create the frame.
	 */
	public content1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Way Of Travelling");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(195, 40, 197, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Road Ways");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Road_Ways r = new Road_Ways();
				r.setVisible(true);
				
				dispose();
				
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(39, 278, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rail Ways");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(233, 277, 115, 24);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Rail_Ways r = new Rail_Ways();
				r.setVisible(true);
				
				dispose();
				
			
			}
		});
		
		JButton btnNewButton_2 = new JButton("Air Ways");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(431, 278, 121, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				airways r = new airways();
				r.setVisible(true);
				
				dispose();
				
			
			}
		});
		
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\pic trans\\pexels-photo-186537.jpeg"));
		lblNewLabel_3.setBounds(0, 90, 207, 168);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\pic trans\\images (3).jpg"));
		lblNewLabel_1.setBounds(180, 90, 222, 168);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\pic trans\\download (1).jpg"));
		lblNewLabel_2.setBounds(385, 90, 199, 168);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\pic trans\\AAAA - Copy.jpg"));
		lblNewLabel_4.setBounds(0, 0, 584, 350);
		contentPane.add(lblNewLabel_4);
	}
}

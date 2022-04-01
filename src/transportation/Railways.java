package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Railways extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Railways frame = new Railways();
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
	public Railways() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rail Ways");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(256, 11, 71, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Kishnagang Garib Nawaz Express");
		btnNewButton.setBounds(32, 54, 191, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton== btnNewButton)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("128");
		lblNewLabel_1.setBounds(10, 58, 26, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GN");
		lblNewLabel_2.setBounds(10, 83, 26, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("RS 59/-");
		lblNewLabel_3.setBounds(38, 83, 68, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("SL");
		lblNewLabel_4.setBounds(10, 108, 26, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("AC");
		lblNewLabel_5.setBounds(10, 133, 26, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS 123/-");
		lblNewLabel_6.setBounds(38, 108, 68, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("RS 199/-");
		lblNewLabel_7.setBounds(38, 133, 68, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("GN      RS 88/-");
		lblNewLabel_8.setBounds(400, 83, 128, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SL       RS250/-");
		lblNewLabel_9.setBounds(400, 108, 118, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("AC       RS 900/-");
		lblNewLabel_10.setBounds(400, 133, 96, 14);
		contentPane.add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("129          Rajdhani Express");
		btnNewButton_1.setBounds(400, 54, 174, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton_1== btnNewButton_1)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JButton btnNewButton_2 = new JButton("130       Amarpali Express ");
		btnNewButton_2.setBounds(10, 206, 191, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(  btnNewButton_2== btnNewButton_2)
				{
					
					JOptionPane.showMessageDialog(btnNewButton," Successfull Booking");
					
				}
				
			
			}
		});
		
		JLabel lblNewLabel_11 = new JLabel("GN         RS 69/-");
		lblNewLabel_11.setBounds(10, 247, 111, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("SL         RS 400/-");
		lblNewLabel_12.setBounds(10, 272, 96, 20);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("AC         RS 999/-");
		lblNewLabel_13.setBounds(10, 303, 96, 20);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("D:\\pic trans\\AAAA - Copy.jpg"));
		lblNewLabel_14.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel_14);
	}
}

  

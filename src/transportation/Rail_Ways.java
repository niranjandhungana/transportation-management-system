package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

public class Rail_Ways extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rail_Ways frame = new Rail_Ways();
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
	public Rail_Ways() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Rail Ways");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(183, 11, 169, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("My Train");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(203, 68, 149, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Travelling From");
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 193, 136, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Travelling To");
		lblNewLabel_3.setForeground(new Color(245, 255, 250));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(425, 193, 159, 26);
		contentPane.add(lblNewLabel_3);
		
		String data[]= {"Chhatrapati Shivaji Terminus"," Mumbai. Standing Tall ","Ghum, North Bengal. Ghoom Railway Station","Dudhsagar, Goa. Such scenery","Char Bagh, Lucknow","Howrah Station, West Bengal","New Delhi Railway Station","Cuttack, Odisha","Vijayawada, Andhra Pradesh"};
		JComboBox comboBox = new JComboBox(data);
		comboBox.setBounds(10, 230, 159, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(data);
		comboBox_1.setBounds(435, 230, 149, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(239, 315, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Railways r = new Railways();
				r.setVisible(true);
				
				dispose();
				
			
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("DATE");
		lblNewLabel_4.setForeground(new Color(245, 245, 245));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(251, 241, 52, 22);
		contentPane.add(lblNewLabel_4);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(230, 265, 98, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\pic trans\\gettyimages-458132607-612x612.jpg"));
		lblNewLabel_5.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel_5);
		
//		contentPane.setVisible(true);
//		Railways rail =new Railways();
//		rail.setVisible(true);
	}
	
}

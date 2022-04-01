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

import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;

public class Air_ways extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-159,349
	 */
	private final JLabel label = new JLabel("New label");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Air_ways frame = new Air_ways();
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
	public Air_ways() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Air Ways");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(231, 11, 156, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Flight");
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(221, 43, 166, 32);
		contentPane.add(lblNewLabel_1);
		
		String data[]= {" Rajiv Gandhi International Airport ,Hyderabad, Telangana"," Sri Guru Ram Dass Jee International Airport,Amritsar, Punjab","Lokpriya Gopinath Bordoloi International Airport,Guwahati, Assam","Biju Patnaik International Airport,Bhubaneswar, Odisha","Gaya Airport,Gaya, Bihar","Indira Gandhi International Airport,New Delhi, Delhi","Veer Savarkar International Airport,Port Blair, Andaman and Nicobar Islands","Sardar Vallabhbhai Patel International Airport,Ahmedabad, Gujarat","Kempegowda International Airport,Bengaluru, Karnataka","Mangalore International Airport,Mangalore, Karnataka","Cochin International Airport,Kochi, Kerala","Calicut International Airport,Kozhikode, Kerala","Trivandrum International Airport,Thiruvananthapuram, Kerala","Chhatrapati Shivaji Maharaj International Airport,Mumbai, Maharashtra","Dr. Babasaheb Ambedkar International Airport,Nagpur, Maharashtra","Jaipur International Airport,Jaipur, Rajasthan","Chennai International Airport,Chennai, Tamil Nadu","Tiruchirappalli International Airport,Tiruchirappalli, Tamil Nadu","Chaudhary Charan Singh International Airport,Lucknow, Uttar Pradesh","Lal Bahadur Shastri International Airport,Varanasi, Uttar Pradesh","Netaji Subhas Chandra Bose International Airport,Kolkata, West Bengal","Kannur International Airport,Kannur, Kerala","Surat Airport,Surat, Gujarat"

};
		JComboBox comboBox = new JComboBox(data);
		comboBox.setBounds(36, 137, 107, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(data);
		comboBox_1.setBounds(421, 137, 114, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Travelling From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(42, 104, 101, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Travelling To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(421, 104, 133, 22);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(231, 258, 89, 22);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				airways r = new airways();
				r.setVisible(true);
				
				dispose();
				
			
			}
		});
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(221, 213, 107, 22);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(253, 190, 55, 22);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("      ");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\pic trans\\aircraft-jet-landing-cloud-46148.jpeg"));
		lblNewLabel_5.setBounds(36, 11, 640, 339);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\pic trans\\AAAA.jpg"));
		lblNewLabel_6.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel_6);
	}
}

package transportation;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;

public class Road_Ways extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Road_Ways frame = new Road_Ways();
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
	public Road_Ways() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Road Ways");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(196, 11, 152, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bus Search");
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD, 17));
		lblNewLabel_1.setBounds(206, 55, 130, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Travelling From");
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 108, 132, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Travelling To");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(405, 108, 111, 29);
		contentPane.add(lblNewLabel_3);
		String data[]= {"Delhi","Pune","Manali","Vadodara Bus Station, Vadodara","Kempegowda Bus Station, Bangalore","Chennai Mofussil Bus Terminus, Chennai\r\n"
				+ "Chennai Mofussil Bus Terminus, Chennai"," Inter State Bus Terminals, Kashmiri Gate, Delhi\r\n"
						+ "Mahatma Gandhi Bus Station, Hyderabad","Pandit Nehru Bus Station, Vijayawada"," NTR Bus Station, Guntur","KSRTC Bus Stand, Hassan\r\n"
								+ "Arapalayam Bus Terminus, Madurai\r\n"
								+ "Inter State Bus Terminals, Anand Vihar, Delhi"};
		JComboBox comboBox = new JComboBox(data);
		comboBox.setBounds(20, 137, 164, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(data);
		comboBox_1.setBounds(389, 137, 164, 22);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				Bus_Service b=new Bus_Service();
				b.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(247, 274, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Date");
		lblNewLabel_4.setForeground(new Color(240, 255, 240));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(275, 216, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(247, 231, 101, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_6 = new JLabel("600");
		lblNewLabel_6.setBounds(196, 141, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\pic trans\\gettyimages-1163570320-612x612.jpg"));
		lblNewLabel_5.setBounds(0, 0, 584, 361);
		contentPane.add(lblNewLabel_5);
		
	}
}

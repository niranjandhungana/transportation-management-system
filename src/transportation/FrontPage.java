package transportation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JProgressBar;


public class FrontPage extends JFrame {

	/**
	 * Launch the application.
	 * 
	 * 
	 */
	
	private JProgressBar progressBar;
	public static void main(String[] args) {
		
		FrontPage g = new FrontPage();
		g.setVisible(true);
		for(int i =0 ;i <= 100 ; i++) {
			
			
			try {
				Thread.sleep(100);
				
				g.progressBar.setValue(i);
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		loginpage l = new loginpage();
		l.setVisible(true);
		g.dispose();
		
		
	}

	/**
	 * Create the frame.
	 */
	public FrontPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TRANSPORTATION MANAGEMENT");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(94, 11, 393, 60);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SYSTEM");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1.setBounds(212, 64, 135, 27);
		getContentPane().add(lblNewLabel_1);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(183, 208, 190, 14);
		getContentPane().add(progressBar);
		
		JLabel lblNewLabel_2 = new JLabel("Loading");
		lblNewLabel_2.setForeground(new Color(255, 255, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(245, 182, 75, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\pic trans\\gettyimages-1138098965-612x612.jpg"));
		lblNewLabel_3.setBounds(0, 0, 584, 361);
		getContentPane().add(lblNewLabel_3);
	}
}

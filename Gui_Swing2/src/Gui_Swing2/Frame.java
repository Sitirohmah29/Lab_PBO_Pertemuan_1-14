package Gui_Swing2;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Frame extends JFrame {
	Frame() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,500);
		setTitle("Contoh No Layout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUIFrame(this);
	}
	
	public static void main(String[] args) {
		new FlowLayoutSample();
	}
	
	private void GenerateUIFrame(Frame frame) {
		JButton button1 = new JButton();
//		JButton button2 = new JButton();
//		JButton button3 = new JButton();
		
		button1.setText("Hello");
//		button2.setText("ทุกคน");
//		button3.setText("IBIK");
//		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
			}
		});
		button1.setBounds(50,50,60,60);
		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
		frame.setLayout(null);
	}
	
//		JButton button1 = new JButton();
//		
//		button1.setText("Klik Saya");
//	
////	button1.setIcon(new ImageIcon("C:\\rocket_univers_galaxia_stars_moon_rocketman_astronaut_icon_141228.png"));
//		
//		//memberi aksi event click
//		button1.addActionListener(new ActionListener() {
//			@Override			
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
//			}
//		});
//		
//		button1.setBounds(50,50,60,60);
//		frame.add(button1);
//		frame.setLayout(null);
	
}
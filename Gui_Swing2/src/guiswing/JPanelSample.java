package guiswing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JPanelSample extends JFrame {
	JPanelSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		ExpPanel(this);
	}
	public static void main(String[] args) {
		new JPanelSample();
	}
	
	private void ExpPanel(JPanelSample frame) {
		JPanel mainPanel = new JPanel(); 
		
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		mainPanel.add(panel1,BorderLayout.NORTH);
		
		JButton button1 = new JButton();
		button1.setBounds(10,20, 475, 200);
		button1.setIcon(new ImageIcon("C://Users/Irvan/OneDrive/Pictures/touch.png"));
		button1.setText("Klik Button");
		panel1.add(button1);
		
		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);
		
		frame.add(panel1);
		}
	
}
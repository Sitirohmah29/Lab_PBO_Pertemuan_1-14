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

public class FlowLayoutSample extends JFrame {
	FlowLayoutSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,500);
		setTitle("Contoh No Layout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	
	public static void main(String[] args) {
		new FlowLayoutSample();
	}
	
	private void GenerateUI(FlowLayoutSample frame) {
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.setLayout(new FlowLayout());
	}
	
//	private void GenerateUIBorder(FlowLayoutSample frame) {
//		JButton button1 = new JButton("Button 1");
//		JButton button2 = new JButton("Button 2");
//		JButton button3 = new JButton("Button 3");
//		JButton button4 = new JButton("Button 4");
//		JButton button5 = new JButton("Button 5");
//		
//		frame.add(button1, BorderLayout.NORTH);
//		frame.add(button2, BorderLayout.SOUTH);
//		frame.add(button3, BorderLayout.EAST);
//		frame.add(button4, BorderLayout.WEST);
//		frame.add(button5, BorderLayout.CENTER);
//	}
	
//	private void GenerateUIGrid(FlowLayoutSample frame) {
//		JButton button1 = new JButton("Button 1");
//		JButton button2 = new JButton("Button 2");
//		JButton button3 = new JButton("Button 3");
//		JButton button4 = new JButton("Button 4");
//		JButton button5 = new JButton("Button 5");
//		
//		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
//		frame.add(button4);
//		frame.add(button5);
//
//		frame.setLayout(new GridLayout(2,2,1,1));
//	}
//	
//	private void GenerateUINo(FlowLayoutSample frame) {
//		JButton button1 = new JButton("Button 1");
//		JButton button2 = new JButton("Button 2");
//		JButton button3 = new JButton("Button 3");
//		JButton button4 = new JButton("Button 4");
//				
//		button1.setBounds(25,30,100,50);
//		button2.setBounds(250,200,100,50);
//		button3.setBounds(200,30,100,50);
//		button4.setBounds(25,100,100,50);
//
//		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
//		frame.add(button4);
//		frame.setLayout(null);
//	}
	
//	private void GenerateUIJButton(FlowLayoutSample frame) {
//		JButton button1 = new JButton();
//		
//		button1.setText("Klik Saya");
	
//	button1.setIcon(new ImageIcon("C:\\rocket_univers_galaxia_stars_moon_rocketman_astronaut_icon_141228.png"));
//		
//		//memberi aksi event click
//		button1.addActionListener(new ActionListener() {
//			@Override
//			
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
//			}
//		});
//		
//		button1.setBounds(50,50,60,60);
//		frame.add(button1);
//		frame.setLayout(null);
//	}
//	private void GenerateUI(App frame) {
//		JLabel label1 = new JLabel("IBI Kesatuan"); label1.setBounds(10,20, 150,50);
//		
//		JLabel label2 = new JLabel();
//		label2.setText("Teknologi Informasi");
//		label2.setBounds(10, 70, 150, 50);
//	}
//	private void ExpPanel(App frame) {
//		JPanel mainPanbel = new JPanel(); mainPanel.setLayout(new BorderLayout());
//		frame.setContentPane(mainPanel);
//		
//		JPanel panel1 = new JPanel();
//		panel1.setLayout(null);
//		mainPanel.add(panel, BorderLayout.NORTH);
//		
//		JButton button1 = new JButton();
//		button1.setBounds(10, 20, 475, 200);
//		button1.setIcon(null);
//		panel1.add(button1);
//		
//		JLabel IbICopyright = new Jlabel("", SwingConstants.CENTER);
//		
//		IbICopyright.setBackground(null);
//		mainPanel.add(IbICopyright, BorderLayout.SOUTH);
//		
//		frame.add(panel1);
//	}
}
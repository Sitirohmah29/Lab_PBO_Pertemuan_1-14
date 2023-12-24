package com.ibik.pbo.Pembelajaran;

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

public class No2 extends JFrame {
	No2() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,500);
		setTitle("Contoh No Layout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUIJButton(this);
	}
	  
	public static void main(String[] args) {
		new No2();
	}
	private void GenerateUIJButton(No2 frame) {
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		
		button1.setText("ハロー"); 
		button2.setText("ทุกคน"); 
		button3.setText("IBIK"); 
	
//	button1.setIcon(new ImageIcon("C:\\rocket_univers_galaxia_stars_moon_rocketman_astronaut_icon_141228.png"));
		
		//memberi aksi event click
		button1.addActionListener(new ActionListener() {
//			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ハロー is a word for 'Hello'", "you just clik ハロー", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button1.setBounds(100,50,100,50);
		frame.add(button1);
		frame.setLayout(null);
		
		button2.addActionListener(new ActionListener() {
//			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ทุกคน is a word for 'Everyone'", "you just clik ทุกคน", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button2.setBounds(200,50,100,50);
		frame.add(button2);
		frame.setLayout(null);
		
		button3.addActionListener(new ActionListener() {
//			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IBIK  is an acronym for 'Institut Bisnis dan Informasi Kesatuan'", "you just clik IBIK", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button3.setBounds(150,100,100,50);
		frame.add(button3, BorderLayout.SOUTH);
		frame.setLayout(null);
}
}
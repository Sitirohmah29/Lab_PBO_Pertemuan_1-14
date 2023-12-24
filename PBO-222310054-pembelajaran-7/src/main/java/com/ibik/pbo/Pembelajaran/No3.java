package com.ibik.pbo.Pembelajaran;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class No3 extends JFrame {
	No3() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	public static void main(String[] args) {
		new No3();
	}
	
	private void GenerateUI(No3 frame) {
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
				 
		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setBounds(22, 23, 80, 16);
		panel1.add(lblFullname);
				 
		JTextField textFullname = new JTextField(); 
		textFullname.setBounds(105, 18,169, 30); 
		textFullname.setEditable(true);
//		 textFullname.setText("Siti Rohmah");//buat default
//		textFullname.setBackground(Color.LIGHT_GRAY);
		panel1.add(textFullname);
				 
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(22, 69, 61, 16);
		panel1.add(lblEmail);
		 
		JTextField textEmail = new JTextField(); 
		textEmail.setBounds(105,64, 169, 30); 
		panel1.add(textEmail);
				 
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(22, 109, 61, 16);
		panel1.add(lblPhone);
			 
		JTextField txtPhone = new JTextField(); 
		txtPhone.setBounds(105,104,169, 30); 
		panel1.add(txtPhone);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(22,139,169,30);
		panel1.add(lblGender);
					
		JRadioButton radioGender1 = new JRadioButton("Female"); 
		radioGender1.setBounds(105,140,100,30);
		panel1.add(radioGender1);
		JRadioButton radioGender2 = new	JRadioButton("Male"); 
		radioGender2.setBounds(200,140,100,30);
		panel1.add(radioGender2);
			
		ButtonGroup bg=new ButtonGroup();
		bg.add(radioGender1);
		bg.add(radioGender2);
		
		JLabel lblCityzen= new JLabel("Citizenship");
		lblCityzen.setBounds(22,179,169,30);
		panel1.add(lblCityzen);
		String country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"};
		JComboBox selectCitizen = new JComboBox(country); 
		selectCitizen.setBounds(105,184,169,30);
		panel1.add(selectCitizen);
			
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(105,224,169,30);
		btnSubmit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Check if any of the required fields is empty
				if (textFullname.getText().isEmpty() || textEmail.getText().isEmpty() || txtPhone.getText().isEmpty()) {
					JOptionPane.showMessageDialog(frame, "Data tidak boleh kosong. Silakan periksa kembali isian anda.",
	                           "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						// If all fields are filled, display information in a JOptionPane
	                    String gender = radioGender1.isSelected() ? "Female" : "Male";
	                    String message = "Fullname: " + textFullname.getText() + "\n" +
	                            "Email: " + textEmail.getText() + "\n" +
	                            "Phone: " + txtPhone.getText() + "\n" +
	                            "Gender: " + gender + "\n" +
	                            "Citizenship: " + selectCitizen.getSelectedItem();
	                    JOptionPane.showMessageDialog(frame, message, "Information", JOptionPane.INFORMATION_MESSAGE);
	                }
	            }
	        });
		panel1.add(btnSubmit);
					
		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE); 
		lblCopyright.setSize(500,600);
		panel1.add(lblCopyright,BorderLayout.SOUTH);
			
		frame.add(panel1);
	}
}
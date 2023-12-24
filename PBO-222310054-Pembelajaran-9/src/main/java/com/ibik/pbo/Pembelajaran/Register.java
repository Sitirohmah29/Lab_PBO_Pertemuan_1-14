package com.ibik.pbo.Pembelajaran;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textNpm;
	private JTextField textFullname;
	private JTextField textEmail;
	private JTextField textPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNpm = new JLabel("Npm");
		lblNpm.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblNpm.setBounds(10, 31, 61, 17);
		contentPane.add(lblNpm);
		
		textNpm = new JTextField();
		textNpm.setBounds(81, 27, 198, 20);
		contentPane.add(textNpm);
		textNpm.setColumns(10);
		
		JLabel lblFullname = new JLabel("Fullname");
		lblFullname.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblFullname.setBounds(10, 63, 61, 17);
		contentPane.add(lblFullname);
		
		textFullname = new JTextField();
		textFullname.setColumns(10);
		textFullname.setBounds(81, 59, 198, 20);
		contentPane.add(textFullname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblEmail.setBounds(10, 95, 61, 17);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(81, 91, 198, 20);
		contentPane.add(textEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblGender.setBounds(10, 157, 61, 17);
		contentPane.add(lblGender);
		
		JLabel lblEmail_1_1 = new JLabel("Citizenship");
		lblEmail_1_1.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblEmail_1_1.setBounds(10, 185, 74, 17);
		contentPane.add(lblEmail_1_1);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(81, 152, 109, 23);
		contentPane.add(rdbtnFemale);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(192, 152, 109, 23);
		contentPane.add(rdbtnMale);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Indonesia", "U.S.A", "India", "New Zealand", "Korea"}));
		comboBox.setBounds(81, 180, 198, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Calibri Light", Font.BOLD, 12));
		btnNewButton.setBounds(133, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Calibri Light", Font.BOLD, 13));
		lblPhone.setBounds(10, 123, 61, 17);
		contentPane.add(lblPhone);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(81, 122, 198, 20);
		contentPane.add(textPhone);
	}
}

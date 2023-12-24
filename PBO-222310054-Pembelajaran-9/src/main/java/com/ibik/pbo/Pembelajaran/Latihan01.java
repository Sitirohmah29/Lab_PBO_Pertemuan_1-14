package com.ibik.pbo.Pembelajaran;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;


public class Latihan01 extends JFrame {

	private JPanel contentPane;
	private JTextField textEMail;
	private JTextField textNpm;
	private JTextField textEmail;
	private JTextField textFullname;
	private JTextField textGender;
	private JTextField textCity;
	private JTextField textPhone;
	private final JButton btnNewButton = new JButton("Register");
	private JPasswordField passwordField;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan01 frame = new Latihan01();
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
	public Latihan01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setTitle("Login");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEmail.setBounds(10, 71, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(10, 106, 71, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 104, 162, 24);
		contentPane.add(passwordField);
		
		textEMail = new JTextField();
		textEMail.setBounds(112, 69, 162, 24);
		contentPane.add(textEMail);
		textEMail.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(112, 166, 85, 24);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame registerFrame = new JFrame("Register");
                registerFrame.setSize(300, 300);
                JPanel registerPanel = new JPanel();
                registerPanel.setLayout(null);
                registerFrame.getContentPane().add(registerPanel);
                
                JLabel lblNpm = new JLabel("Npm");
        		lblNpm.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblNpm.setBounds(10, 31, 61, 17);
        		registerPanel.add(lblNpm);
        		
        		textNpm = new JTextField();
        		textNpm.setBounds(81, 27, 198, 20);
        		registerPanel.add(textNpm);
        		textNpm.setColumns(10);
        		
        		JLabel lblFullname = new JLabel("Fullname");
        		lblFullname.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblFullname.setBounds(10, 63, 61, 17);
        		registerPanel.add(lblFullname);
        		
        		textFullname = new JTextField();
        		textFullname.setColumns(10);
        		textFullname.setBounds(81, 59, 198, 20);
        		registerPanel.add(textFullname);
        		
        		JLabel lblEmail = new JLabel("Email");
        		lblEmail.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblEmail.setBounds(10, 95, 61, 17);
        		registerPanel.add(lblEmail);
        		
        		textEmail = new JTextField();
        		textEmail.setColumns(10);
        		textEmail.setBounds(81, 91, 198, 20);
        		registerPanel.add(textEmail);
        		
        		JLabel lblPhone = new JLabel("Phone");
        		lblPhone.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblPhone.setBounds(10, 123, 61, 17);
        		registerPanel.add(lblPhone);
        		
        		textPhone = new JTextField();
        		textPhone.setColumns(10);
        		textPhone.setBounds(81, 122, 198, 20);
        		registerPanel.add(textPhone);
        		
        		JLabel lblGender = new JLabel("Gender");
        		lblGender.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblGender.setBounds(10, 157, 61, 17);
        		registerPanel.add(lblGender);
        		
        		textGender = new JTextField();
        		textGender.setColumns(10);
        		textGender.setBounds(81, 152, 198, 20);
        		registerPanel.add(textGender);
        		
        		JLabel lblCity = new JLabel("Citizenship");
        		lblCity.setFont(new Font("Calibri Light", Font.BOLD, 13));
        		lblCity.setBounds(10, 185, 74, 17);
        		registerPanel.add(lblCity);
        		
        		textCity = new JTextField();
        		textCity.setColumns(10);
        		textCity.setBounds(81, 180, 198, 20);
        		registerPanel.add(textCity);
        		
        		JButton btnSubmit = new JButton("Submit");
        		btnSubmit.setFont(new Font("Calibri Light", Font.BOLD, 12));
        		btnSubmit.setBounds(133, 209, 89, 23);
        		btnSubmit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	ValidatorForm();
                    	String registrationData = "Full Name: " + textFullname.getText()+
                                "\nEmail: " + textEmail.getText() +
                                "\nPhone: " + textPhone.getText() +
                                "\nGender: " + textGender.getText() +
                                "\nCitizenship: " + textCity.getText();

                        JOptionPane.showMessageDialog(btnSubmit, "Data Anda adalah:\n" + registrationData, "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
//                        registerFrame.dispose();
                    	dispose(); // Menutup frame registrasi
                        setVisible(true);
                    }
                });
                registerPanel.add(btnSubmit);
                registerFrame.setVisible(true); 
		}
		});
		contentPane.add(btnRegister);
		
		JRadioButton rdbtnRememberPassword = new JRadioButton("Remember Password");
		rdbtnRememberPassword.setBounds(112, 135, 162, 23);
		contentPane.add(rdbtnRememberPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(207, 166, 85, 24);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    String enteredEmail = textEMail.getText();
			    char[] enteredPasswordChars = passwordField.getPassword();
			    String enteredPassword = new String(enteredPasswordChars);

			    try {
			        if (isValidLogin(enteredEmail, enteredPassword)) {
			            JOptionPane.showMessageDialog(null, "Login successful!");
			            dispose(); // Menutup frame login
			        } else {
			            JOptionPane.showMessageDialog(null, "Invalid username or password");
			        }
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(null, "Error during login: " + ex.getMessage());
			        ex.printStackTrace();
			    }
			}

      });
		contentPane.add(btnLogin);
		
		JLabel lblIbik = new JLabel("Copyright IBIK @2023");
		lblIbik.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIbik.setLabelFor(contentPane);
		lblIbik.setHorizontalAlignment(SwingConstants.CENTER);
		lblIbik.setBounds(126, 373, 148, 14);
		contentPane.add(lblIbik);
		
		
		
	}
	
	private boolean isValidLogin(String enteredEmail, String enteredPassword) throws Exception {
	    // Retrieve user data from the database based on the entered email
	    StudentsDao stdDao = new StudentsDao();
	    Students students = stdDao.getByEmail(enteredEmail);

	    // Check if the user exists and the entered password matches the stored NPM
	    return students != null && enteredPassword.equals(students.getNpm());
	}

	
	private void ValidatorForm() {
        if (textNpm.getText().isEmpty() || textFullname.getText().isEmpty() || textEmail.getText().isEmpty() || textPhone.getText().isEmpty() || textGender.getText().isEmpty() || textCity.getText().isEmpty()) {
            Object message = "Please fill up the form correctly";
            JOptionPane.showMessageDialog(null, message);
        } else {
            try {
                Insert2database();
                JOptionPane.showMessageDialog(null, "Successfully saved");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed save. Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
	
	private void Insert2database() throws Exception {
	    Students students = new Students();
	    students.setNpm(textNpm.getText());
	    students.setFullname(textFullname.getText());
	    students.setEmail(textEmail.getText());
	    students.setPhone(textPhone.getText());
	    students.setGender(textGender.getText());
	    students.setCitizenship(textCity.getText());
	    
	    
	    StudentsDao stdDao = new StudentsDao();
	    stdDao.saved(students);
	    
//	    StudentsDao updte = new StudentsDao();
//	    updte.updated(students);
	}
}
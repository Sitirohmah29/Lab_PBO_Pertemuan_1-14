package com.ibik.pbo.Pembelajaran;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class RegisterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textNPM;
	private JTextField textFirstname;
	private final JButton btnNewButton = new JButton("Register");
	private JTextField textMiddleName;
	private JTextField textLastname;
	private JTextField textEmail;
	private JTextField textBirthdate;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterGUI frame = new RegisterGUI();
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
	public RegisterGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NPM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 106, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		textNPM = new JTextField();
		textNPM.setBounds(112, 69, 272, 20);
		contentPane.add(textNPM);
		textNPM.setColumns(10);
		
		textFirstname = new JTextField();
		textFirstname.setBounds(112, 104, 272, 20);
		contentPane.add(textFirstname);
		textFirstname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("REGISTER FORM");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(139, 21, 144, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(154, 319, 120, 31);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ValidatorForm();
		}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Middle Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 143, 85, 14);
		contentPane.add(lblNewLabel_3);
		
		textMiddleName = new JTextField();
		textMiddleName.setBounds(112, 141, 272, 20);
		contentPane.add(textMiddleName);
		textMiddleName.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("last Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 185, 71, 14);
		contentPane.add(lblNewLabel_4);
		
		textLastname = new JTextField();
		textLastname.setBounds(112, 183, 272, 20);
		contentPane.add(textLastname);
		textLastname.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 228, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Birthdate");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 267, 85, 14);
		contentPane.add(lblNewLabel_6);
		
		textEmail = new JTextField();
		textEmail.setBounds(112, 226, 272, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textBirthdate = new JTextField();
		textBirthdate.setBounds(112, 265, 272, 20);
		contentPane.add(textBirthdate);
		textBirthdate.setColumns(10);
	}
	private void ValidatorForm() {
        if (textNPM.getText().isEmpty() || textFirstname.getText().isEmpty() || textMiddleName.getText().isEmpty() || textLastname.getText().isEmpty() || textEmail.getText().isEmpty() || textBirthdate.getText().isEmpty()) {
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
	    students.setNpm(textNPM.getText());
	    students.setFirstname(textFirstname.getText());
	    students.setMiddlename(textMiddleName.getText());
	    students.setLastname(textLastname.getText());
	    students.setEmail(textEmail.getText());
	    students.setBirthdate(textBirthdate.getText());
	    
	    StudentsDao stdDao = new StudentsDao();
	    stdDao.saved(students);
	    
//	    StudentsDao updte = new StudentsDao();
//	    updte.updated(students);
	}

}
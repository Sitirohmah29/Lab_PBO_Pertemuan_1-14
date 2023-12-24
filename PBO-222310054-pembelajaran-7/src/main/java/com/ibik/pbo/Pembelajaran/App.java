package com.ibik.pbo.Pembelajaran;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    App() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(500, 300);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        generateUI(this);
    }

    public static void main(String[] args) {
        new App();
    }

    private void generateUI(App frame) {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        frame.setContentPane(mainPanel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);

        mainPanel.add(panel1, BorderLayout.NORTH);
        JLabel lblUsername = new JLabel("Email");
        lblUsername.setBounds(22, 23, 80, 16);
        panel1.add(lblUsername);
        JTextField textUsername = new JTextField();
        textUsername.setBounds(105, 23, 169, 30);
        panel1.add(textUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(22, 64, 80, 16);
        panel1.add(lblPassword);
        JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(105, 64, 169, 30);
        panel1.add(textPassword);

        JCheckBox chkRemember = new JCheckBox("Remember password ?", true);
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(105, 150, 95, 40);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open a new frame for user registration
                JFrame registerFrame = new JFrame("Register");
                registerFrame.setSize(300, 300);
                JPanel registerPanel = new JPanel();
                registerPanel.setLayout(null);
                registerFrame.add(registerPanel);

                JLabel lblFullname = new JLabel("Fullname");
                lblFullname.setBounds(22, 23, 80, 16);
                registerPanel.add(lblFullname);
                JTextField textFullname = new JTextField();
                textFullname.setBounds(105, 18, 169, 30);
                registerPanel.add(textFullname);

                JLabel lblEmail = new JLabel("Email");
        		lblEmail.setBounds(22, 69, 61, 16);
        		registerPanel.add(lblEmail);
        		JTextField textEmail = new JTextField(); 
        		textEmail.setBounds(105,64, 169, 30); 
        		registerPanel.add(textEmail);
        				 
        		JLabel lblPhone = new JLabel("Phone");
        		lblPhone.setBounds(22, 109, 61, 16);
        		registerPanel.add(lblPhone); 
        		JTextField txtPhone = new JTextField(); 
        		txtPhone.setBounds(105,104,169, 30); 
        		registerPanel.add(txtPhone);

        		JLabel lblGender = new JLabel("Gender");
        		lblGender.setBounds(22,139,169,30);
        		registerPanel.add(lblGender);
        					
        		JRadioButton radioGender1 = new JRadioButton("Female"); 
        		radioGender1.setBounds(105,140,100,30);
        		registerPanel.add(radioGender1);
        		JRadioButton radioGender2 = new	JRadioButton("Male"); 
        		radioGender2.setBounds(200,140,100,30);
        		registerPanel.add(radioGender2);
        			
        		ButtonGroup bg=new ButtonGroup();
        		bg.add(radioGender1);
        		bg.add(radioGender2);
        		
        		JLabel lblCityzen= new JLabel("Citizenship");
        		lblCityzen.setBounds(22,179,169,30);
        		registerPanel.add(lblCityzen);
        		String country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"};
        		JComboBox selectCitizen = new JComboBox(country); 
        		selectCitizen.setBounds(105,184,169,30);
        		registerPanel.add(selectCitizen);

                JButton btnRegisterSubmit = new JButton("Submit");
                btnRegisterSubmit.setBounds(105, 224, 169, 30);
                btnRegisterSubmit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Display registration data message
                        String registrationData = "Full Name: " + textFullname.getText()+
                                "\nEmail: " + textEmail.getText() +
                                "\nPhone: " + txtPhone.getText() +
                                "\nGender: " + (radioGender1.isSelected() ? "Female" : "Male") +
                                "\nCitizenship: " + selectCitizen.getSelectedItem();

                        JOptionPane.showMessageDialog(frame, "Data Anda adalah:\n" + registrationData, "Registrasi Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        registerFrame.dispose(); // Close the registration frame
                    }
                });
                registerPanel.add(btnRegisterSubmit);

                registerFrame.setVisible(true);
            }
        });
        panel1.add(btnRegister);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(215, 150, 95, 40);
        panel1.add(btnLogin);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}

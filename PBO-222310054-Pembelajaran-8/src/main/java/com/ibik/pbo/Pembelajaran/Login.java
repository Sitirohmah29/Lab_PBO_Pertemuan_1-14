package com.ibik.pbo.Pembelajaran;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Login extends JFrame {
    Login() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(500, 300);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new Login();
        
        
        
    }

    private void GenerateUI(Login frame) {
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

        JButton btnSubmit = new JButton("Register");
        btnSubmit.setBounds(105, 150, 95, 40);
        JButton btnRegister = new JButton("Login");
        btnRegister.setBounds(215,150, 95, 40);
        panel1.add(btnSubmit);
        panel1.add(btnRegister);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}

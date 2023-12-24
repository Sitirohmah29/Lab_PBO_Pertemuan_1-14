package Chat_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

import java.security.MessageDigest;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Starter extends JFrame {

    private JPanel contentPane;
    private JTextField textUserName;
    private JPasswordField passwordField;
    private JButton btnLogin;
    private JButton btnRegister;
    private JTextField textInput;
    private JFrame chatAppFrame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Starter frame = new Starter();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Starter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 426);
        setTitle("Login");
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Chat Application");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Calibri Light", Font.BOLD, 16));
        lblTitle.setBounds(139, 52, 155, 24);
        contentPane.add(lblTitle);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Calibri Light", Font.PLAIN, 13));
        lblUsername.setBounds(10, 131, 92, 24);
        contentPane.add(lblUsername);

        textUserName = new JTextField();
        textUserName.setFont(new Font("Calibri Light", Font.PLAIN, 11));
        textUserName.setBounds(86, 132, 272, 24);
        contentPane.add(textUserName);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Calibri Light", Font.PLAIN, 13));
        lblPassword.setBounds(10, 181, 92, 24);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(86, 181, 272, 24);
        contentPane.add(passwordField);

        btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        btnLogin.setBounds(86, 230, 120, 31);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = textUserName.getText();
                char[] enteredPasswordChars = passwordField.getPassword();
                String enteredPassword = new String(enteredPasswordChars);

                try {
                    if (isValidLogin(enteredUsername, enteredPassword)) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        openChatAppFrame(); // Menampilkan frame baru
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

        btnRegister = new JButton("Register");
        btnRegister.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        btnRegister.setBounds(238, 230, 120, 31);
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementasi registrasi di sini
                // Anda dapat menambahkan logika untuk menyimpan data ke database
                JOptionPane.showMessageDialog(null, "Registration logic here");
            }
        });

        contentPane.add(btnRegister);
    }

    private void openChatAppFrame() {
        // Implementasi frame chat di sini
        // Anda dapat menambahkan komponen dan logika sesuai kebutuhan
        JOptionPane.showMessageDialog(null, "Chat Application Frame");
    }

    private boolean isValidLogin(String enteredUsername, String enteredPassword) throws Exception {
        // Implementasi validasi login di sini
        // Anda dapat menambahkan logika untuk memeriksa username dan password ke database
        return true; // Contoh sederhana, selalu mengembalikan true
    }
}

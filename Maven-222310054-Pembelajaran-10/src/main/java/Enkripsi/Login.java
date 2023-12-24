//package Enkripsi;
//
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
////import java.security.MessageDigest;
//import java.sql.*;
//import javax.swing.*;
//import javax.swing.event.*;
//
//public class Login {
//
//    private JFrame frame;
//    private JTextField txtUsername;
//    private JPasswordField txtPassword;
//    private JButton btnLogin;
//
//    public Login() {
//        frame = new JFrame("Login");
//        frame.setSize(300, 200);
//        frame.setLayout(new FlowLayout());
//
//        txtUsername = new JTextField(20);
//        frame.add(txtUsername);
//
//        txtPassword = new JPasswordField(20);
//        frame.add(txtPassword);
//
//        btnLogin = new JButton("Login");
//        btnLogin.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Ambil username dan password yang dimasukkan
//                String username = txtUsername.getText();
//                String password = new String(txtPassword.getPassword());
//
//                // Koneksikan ke database
//                Connection connection = null;
//                try {
//                    Class.forName("com.mysql.jdbc.Driver");
//                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat_app", "root", "");
//                } catch (ClassNotFoundException | SQLException e1) {
//                    e1.printStackTrace();
//                }
//
//                // Query database untuk mencari username dan password yang sesuai
//                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
//                PreparedStatement preparedStatement = null;
//                try {
//                    preparedStatement = connection.prepareStatement(query);
//                    preparedStatement.setString(1, username);
//                    preparedStatement.setString(2, password);
//
//                    ResultSet resultSet = preparedStatement.executeQuery();
//
//                    // Jika username dan password ditemukan, enkripsi password dan masukkan ke dalam database
//                    if (resultSet.next()) {
//                        // Enkripsi password
//                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
//                        byte[] bytes = password.getBytes();
//                        messageDigest.update(bytes);
//                        byte[] encryptedPassword = messageDigest.digest();
//
//                        // Masukkan password yang telah dienkripsi ke dalam database
//                        query = "UPDATE users SET password = ? WHERE username = ?";
//                        preparedStatement = connection.prepareStatement(query);
//                        preparedStatement.setBytes(1, encryptedPassword);
//                        preparedStatement.setString(2, username);
//                        preparedStatement.executeUpdate();
//
//                        JOptionPane.showMessageDialog(frame, "Login berhasil!");
//                        frame.dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(frame, "Username dan password salah!");
//                    }
//                } catch (SQLException e1) {
//                    e1.printStackTrace();
//                } catch (NoSuchAlgorithmException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//            }
//        });
//
//        frame.add(btnLogin);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Login();
//    }
//}

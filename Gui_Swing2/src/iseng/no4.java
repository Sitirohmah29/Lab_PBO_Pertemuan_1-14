package iseng;
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

public class no4 extends JFrame {
    no4() {
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setSize(500, 300);
        setTitle("Contoh JLabel");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GenerateUI(this);
    }

    public static void main(String[] args) {
        new no4();
    }

    private void GenerateUI(no4 frame) {
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

        JCheckBox chkRemember = new JCheckBox("Remember account ?", true);
        chkRemember.setBounds(105, 100, 169, 40);
        panel1.add(chkRemember);

        JButton btnSubmit = new JButton("Login");
        btnSubmit.setBounds(105, 150, 169, 40);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textUsername.getText();
                String password = new String(textPassword.getPassword());

                // Check if any field is empty
                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Silahkan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!email.equals("strohmah@gmail.com") || !password.equals("222310054")) {
                    // Check if the email and password match the specified values
                    JOptionPane.showMessageDialog(frame, "Data yang anda masukan salah", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // If all conditions are met, display a welcome message
                    JOptionPane.showMessageDialog(frame, "Selamat Datang " + email, "Welcome", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel1.add(btnSubmit);

        JLabel lblCopyright = new JLabel("copyright IBIK @ 2022", SwingConstants.CENTER);
        lblCopyright.setBackground(Color.BLUE);
        lblCopyright.setSize(300, 50);
        mainPanel.add(lblCopyright, BorderLayout.SOUTH);

        frame.add(panel1);
    }
}

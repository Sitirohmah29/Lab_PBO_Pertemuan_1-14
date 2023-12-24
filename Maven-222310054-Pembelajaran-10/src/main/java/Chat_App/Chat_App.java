package Chat_App;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Chat_App extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Register");
	private JTextField textInput;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat_App frame = new Chat_App();
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
	public Chat_App() {
	 	setForeground(new Color(0, 0, 0));
	 	setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setTitle("Room Chat");
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRoomchat = new JLabel("Room Chat");
        lblRoomchat.setHorizontalAlignment(SwingConstants.CENTER);
        lblRoomchat.setFont(new Font("Times New Roman", Font.BOLD, 13));
        lblRoomchat.setBounds(151, 11, 116, 31);
        contentPane.add(lblRoomchat);
        
        
		final JTextArea textOutput = new JTextArea();
		textOutput.setEnabled(false);
		textOutput.setEditable(false);
		textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textOutput.setForeground(new Color(0, 0, 0));
		textOutput.setBackground(new Color(248, 248, 255));
		textOutput.setBounds(10, 53, 414, 234);
		contentPane.add(textOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textInput.setBackground(new Color(248, 248, 255));
		textInput.setBounds(10, 288, 315, 31);
		contentPane.add(textInput);
		textInput.setColumns(10);
		
		JButton btnSend = new JButton();
		btnSend.setBackground(new Color(248, 248, 255));
		btnSend.setBounds(326, 288, 98, 31);
		btnSend.setIcon(new ImageIcon("C:\\send_121135.png"));
		btnSend.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get text from textInput
                String message = textInput.getText();

                // Append the original message to textOutput
                textOutput.append("Original Message: " + message + "\n");

                // Encrypt the message using SHA-256
                String encryptedMessage = encryptSHA256(message);
                textOutput.append("Encrypted Message (SHA-256): " + encryptedMessage + "\n");

                // Clear the textInput
                textInput.setText("");
            }
        });
        contentPane.add(btnSend);
        
        
    }

    private String encryptSHA256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedhash = digest.digest(input.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder(2 * encodedhash.length);
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
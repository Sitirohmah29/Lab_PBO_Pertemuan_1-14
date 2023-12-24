package Enkripsi;
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
import java.security.NoSuchAlgorithmException;

import com.ibik.pbo.Pembelajaran.Students;
import com.ibik.pbo.Pembelajaran.StudentsDao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.border.EmptyBorder;






public class Starter extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textUserName;
	private JTextField textPassword;
	private final JButton btnLogin = new JButton("Login");
	private JPasswordField passwordField;
	private final JButton btnRegister = new JButton("Register");
	private JTextField textInput;
	private JFrame chatAppFrame;
	private String selectedContact;
	private String selectedContact1;
	private String selectedContact2;

	/**
	 * Launch the application.
	 */
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

	 /**
	 * Create the frame.
	 */
	
	public Starter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 426);
		setTitle("Login");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Chat Aplication");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Calibri Light", Font.BOLD, 16));
		lblTitle.setBounds(86, 11, 272, 40);
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
		
		JButton btnLogin = new JButton("Login");
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
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		btnRegister.setBounds(238, 230, 120, 31);
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame registerFrame = new JFrame("Register");
                registerFrame.setSize(300, 300);
                JPanel registerPanel = new JPanel();
                registerPanel.setLayout(null);
                registerFrame.getContentPane().add(registerPanel);

                JLabel lblUsername = new JLabel("Username");
                lblUsername.setFont(new Font("Calibri Light", Font.PLAIN, 12));
                lblUsername.setBounds(22, 23, 80, 16);
                registerPanel.add(lblUsername);
                
                textUsername = new JTextField();
                textUsername.setBounds(105, 18, 169, 30);
                textUsername.setFont(new Font("Calibri Light", Font.PLAIN, 12));
                registerPanel.add(textUsername);
                textUsername.setColumns(10);

                JLabel lblPassword = new JLabel("Password");
                lblPassword.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        		lblPassword.setBounds(22, 69, 61, 16);
        		registerPanel.add(lblPassword);
        		
        		textPassword = new JTextField(); 
        		textPassword.setBounds(105,64, 169, 30); 
        		textPassword.setFont(new Font("Calibri Light", Font.PLAIN, 12));
        		registerPanel.add(textPassword);
        		textPassword.setColumns(10);
        		
        		JButton btnSubmit = new JButton("Submit");
        		btnSubmit.setFont(new Font("Calibri Light", Font.PLAIN, 12));
                btnSubmit.setBounds(105, 120, 169, 30);
                btnSubmit.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    	ValidatorForm();
                    	dispose(); // Menutup frame registrasi
                        setVisible(true);
                    }
                });
                registerPanel.add(btnSubmit);
                registerFrame.setVisible(true); 
		}
		});
		contentPane.add(btnRegister);
	}
	
	private void openChatAppFrame() {
	    chatAppFrame = new JFrame("Chat Application");
	    chatAppFrame.setBounds(100, 100, 450, 426);
	    chatAppFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	    JPanel chatPanel = new JPanel();
	    chatPanel.setLayout(null);
	    chatAppFrame.getContentPane().add(chatPanel);

	    JLabel lblTitle = new JLabel("Room Chat");
	    lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
	    lblTitle.setFont(new Font("Arial", Font.BOLD, 13));
	    lblTitle.setBounds(118, 11, 191, 23);
	    chatPanel.add(lblTitle);

	    JButton btnSophie = new JButton("Sophie");
	    btnSophie.setHorizontalAlignment(SwingConstants.LEFT);
	    btnSophie.setFont(new Font("Arial", Font.BOLD, 12));
	    btnSophie.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnSophie.setBackground(Color.WHITE);
	    btnSophie.setBounds(10, 45, 414, 50);
	    btnSophie.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            openChatAppFrame1();
	            selectedContact = "Sophie";
	        }
	    });
	    chatPanel.add(btnSophie);

	    JButton btnMoon = new JButton("Moon");
	    btnMoon.setHorizontalAlignment(SwingConstants.LEFT);
	    btnMoon.setFont(new Font("Arial", Font.BOLD, 12));
	    btnMoon.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnMoon.setBackground(Color.WHITE);
	    btnMoon.setBounds(10, 116, 414, 50);
	    btnMoon.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            openChatAppFrame1();
	            selectedContact = "Moon";
	        }
	    });
	    chatPanel.add(btnMoon);

	    JButton btnNaila = new JButton("Naila");
	    btnNaila.setHorizontalAlignment(SwingConstants.LEFT);
	    btnNaila.setFont(new Font("Arial", Font.BOLD, 12));
	    btnNaila.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    btnNaila.setBackground(Color.WHITE);
	    btnNaila.setBounds(10, 188, 414, 50);
	    btnNaila.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            openChatAppFrame1();
	            selectedContact = "Naila";
	        }
	    });
	    chatPanel.add(btnNaila);

	    chatAppFrame.setVisible(true);
	}

	private void openChatAppFrame1() {
	

	    chatAppFrame = new JFrame("Chat Application");
	    chatAppFrame.setBounds(100, 100, 450, 426);
	    chatAppFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	    JPanel chatPanel = new JPanel();
	    chatPanel.setLayout(null);
	    chatAppFrame.getContentPane().add(chatPanel);

	    JLabel lblRoomchat = new JLabel(selectedContact + " - Message");
	    lblRoomchat.setIcon(new ImageIcon("C:/user_person_profile_avatar_icon_190943.png"));
	    lblRoomchat.setHorizontalAlignment(SwingConstants.CENTER);
	    lblRoomchat.setFont(new Font("Times New Roman", Font.BOLD, 13));
	    lblRoomchat.setBounds(86, 11, 272, 40);
	    chatPanel.add(lblRoomchat);

		final JTextArea textOutput = new JTextArea();
		textOutput.setEnabled(true);
		textOutput.setEditable(false);
		textOutput.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textOutput.setForeground(new Color(0, 0, 0));
		textOutput.setBackground(new Color(248, 248, 255));
		textOutput.setBounds(10, 53, 414, 234);
		chatPanel.add(textOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textInput.setBackground(new Color(248, 248, 255));
		textInput.setBounds(10, 288, 315, 31);
		chatPanel.add(textInput);
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
                textOutput.append("Plain Text: " + message + "\n");

                // Encrypt the message using SHA-256
                String encryptedMessage = encryptSHA256(message);
                textOutput.append("Hyper Text: " + encryptedMessage + "\n");

                // Clear the textInput
                textInput.setText("");
            }
        });
		chatPanel.add(btnSend);
		chatAppFrame.setVisible(true);
        
        
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
	
	private boolean isValidLogin(String enteredUsername, String enteredPassword) throws Exception{
	    // Retrieve user data from the database based on the entered username
	    Chat_AppDao chtappDao = new Chat_AppDao();
	    Chat_App savedChatApp = chtappDao.getByUsername(enteredUsername, enteredPassword);
	    // Check if the user exists and the entered password matches the stored password
	    return savedChatApp != null;
	}
			
	private void ValidatorForm() {
	        if (textUsername.getText().isEmpty() || textPassword.getText().isEmpty() ) {
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
			Chat_App chat_app = new Chat_App();
			chat_app.setUsername(textUsername.getText());
			chat_app.setPassword(textPassword.getText());
			
			Chat_AppDao chtappDao = new Chat_AppDao();
			chtappDao.saved(chat_app);
		}

}
package com.ibik.pbo.UAS;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatApp extends JFrame {

    private JPanel contentPane;
    private JTextField textUserName;
    private final JButton btnLogin = new JButton("Login");
    private JPasswordField textPassword;
    private JTextField textInput;
    private JFrame chatAppFrame;
    private String selectedContact;
    private HashMap<String, JTextArea> chatHistory;
    private final EncryptSHA256 encryptor;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChatApp frame = new ChatApp();
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
	public ChatApp() {
		
		encryptor = new EncryptSHA256();
		
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
					
			JPasswordField textPassword = new JPasswordField();
			textPassword.setBounds(86, 181, 272, 24);
			contentPane.add(textPassword);
			
			JButton btnLogin = new JButton("Login");
		    btnLogin.setFont(new Font("Calibri Light", Font.PLAIN, 12));
		    btnLogin.setBounds(164, 231, 120, 31);
		    btnLogin.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            String username = textUserName.getText(); 
		            String password = new String(textPassword.getPassword());
		            if (username.isEmpty() || password.isEmpty()) {
		                JOptionPane.showMessageDialog(contentPane, "Silahkan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
		            } else if (!username.equals("siti") || !password.equals("123")) {
		                JOptionPane.showMessageDialog(contentPane, "Data yang anda masukan salah", "Error", JOptionPane.ERROR_MESSAGE);
		            } else {
		                JOptionPane.showMessageDialog(contentPane, "Selamat Datang " + username, "Login Success", JOptionPane.INFORMATION_MESSAGE);
		                openContact();
		            }
		        }
		    });

		    contentPane.add(btnLogin);
		}
			
		private void openContact() {
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
		            openChatAppFrame();
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
		            openChatAppFrame();
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
		            openChatAppFrame();
		            selectedContact = "Naila";
		        }
		    });
		    chatPanel.add(btnNaila);
		   
		    chatAppFrame.setVisible(true);
		    
		    chatHistory = new HashMap<>();
		}

		 private void openChatAppFrame() {
		        chatAppFrame = new JFrame("Message");
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

		        JTextArea textOutput = new JTextArea();
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
		                String message = textInput.getText();
		                textOutput.append("Plain Text: " + message + "\n");

		                String encryptedMessage = encryptor.encryptSHA256(message);
		                System.out.println("Hashed Text: " + encryptedMessage + "\n");

		                // Append the chat history for the selected contact
		                JTextArea contactHistory = chatHistory.get(selectedContact);
		                if (contactHistory == null) {
		                    contactHistory = new JTextArea();
		                    chatHistory.put(selectedContact, contactHistory);
		                }
		                contactHistory.append(message + "\n");

		                textInput.setText("");
		            }
		        });
		        chatPanel.add(btnSend);

		        // Display chat history for the selected contact
		        JTextArea contactHistory = chatHistory.get(selectedContact);
		        if (contactHistory != null) {
		            textOutput.setText(contactHistory.getText());
		        }

		        chatAppFrame.setVisible(true);
		    }
}


package guiswing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextSample extends JFrame {
	JTextSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	public static void main(String[] args) {
		new JTextSample();
	}
	
	private void GenerateUI(JTextSample frame) {
		 JPanel panel1 = new JPanel();
		 panel1.setLayout(null);
				 
		 JLabel lblFullname = new JLabel("Fullname");
		 lblFullname.setBounds(22, 23, 80, 16);
		 panel1.add(lblFullname);
				 
		 JTextField textFullname = new JTextField(); 
		 textFullname.setBounds(105, 18,169, 30); 
		 textFullname.setEditable(true);
//		 textFullname.setText("Siti Rohmah");//buat default
		 textFullname.setBackground(Color.LIGHT_GRAY);
		 panel1.add(textFullname);
				 
		 JLabel lblEmail = new JLabel("Email");
		 lblEmail.setBounds(22, 69, 61, 16);
		 panel1.add(lblEmail);
		 
		 JTextField textEmail = new JTextField(); 
		 textEmail.setBounds(105,64, 169, 30); 
		 panel1.add(textEmail);
				 
		 JLabel lblPhone = new JLabel("Phone");
		 lblPhone.setBounds(22, 109, 61, 16);
		 panel1.add(lblPhone);
				 
		 JTextField txtPhone = new JTextField(); 
		 txtPhone.setBounds(105,104, 169, 30); 
		 panel1.add(txtPhone);
				 
		 JButton btnSubmit = new JButton("Submit");
		 btnSubmit.setBounds(105, 152, 169, 40);
		 panel1.add(btnSubmit);
		 
		 frame.add(panel1);
	}
}
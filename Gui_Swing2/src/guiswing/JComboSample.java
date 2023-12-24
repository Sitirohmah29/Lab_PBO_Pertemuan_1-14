package guiswing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JComboSample extends JFrame {
	JComboSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	public static void main(String[] args) {
		new JComboSample();
	}
	
	private void GenerateUI(JComboSample frame) { 
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		frame.setContentPane(mainPanel);
			
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		mainPanel.add(panel1,BorderLayout.NORTH);
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 23, 80, 16);
		panel1.add(lblUsername);
		JTextField textUsername = new JTextField();
		textUsername.setBounds(105, 23, 169, 30);
		panel1.add(textUsername);
		
		mainPanel.add(panel1,BorderLayout.NORTH);
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 64, 80, 16);
		panel1.add(lblPassword);
		JPasswordField textPassword = new JPasswordField();
		textPassword.setBounds(105, 64, 169, 30);
		panel1.add(textPassword);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(22, 100, 61, 16);
		panel1.add(lblGender);
				
		JRadioButton radioGender1 = new JRadioButton("Female"); 
		radioGender1.setBounds(105, 100, 100,30); 
		panel1.add(radioGender1);
		JRadioButton radioGender2 = new	JRadioButton("Male"); 
		radioGender2.setBounds(200,100, 100, 30); 
		panel1.add(radioGender2);
				
		ButtonGroup bg=new ButtonGroup();
		bg.add(radioGender1);
		bg.add(radioGender2);
		 
		JLabel lblCityzen= new JLabel("Citizenship");
		lblCityzen.setBounds(22, 150, 61, 16);
		panel1.add(lblCityzen);
		String country[]={"Indonesia","India","Aus","U.S.A","England","Newzealand"};
		JComboBox selectCitizen = new JComboBox(country); 
		selectCitizen.setBounds(105, 150, 169, 30); 
		panel1.add(selectCitizen);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(105, 200, 169, 40);
		panel1.add(btnSubmit);
				
		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE); 
		lblCopyright.setSize(300, 50);
		mainPanel.add(lblCopyright,BorderLayout.SOUTH);
		
		frame.add(panel1);
	}
}
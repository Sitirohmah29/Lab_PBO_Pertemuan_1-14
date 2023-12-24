package guiswing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JtextAreaSample extends JFrame {
	JtextAreaSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	public static void main(String[] args) {
		new JtextAreaSample();
	}
	
	private void GenerateUI(JtextAreaSample frame) { 
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		
		frame.setContentPane(mainPanel);
		JLabel lblWord = new JLabel("Masukan kalimat:");
		mainPanel.add(lblWord, BorderLayout.NORTH);
		String word = "Hai";
		
		JTextArea textWord = new JTextArea(); textWord.setText(word);
		textWord.insert(" kamu nanya?", word.length()); 
		textWord.append("\nBertanyatanya"); 
		mainPanel.add(textWord, BorderLayout.CENTER);
		
		JLabel lblCopyright = new JLabel("copyright IBIK @ 2022",SwingConstants.CENTER);
		lblCopyright.setBackground(Color.BLUE);
		mainPanel.add(lblCopyright, BorderLayout.SOUTH);
	}
	
}
package praktikum9;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class SampleKeyListener extends JFrame implements KeyListener {
	private JLabel labelChar, labelCode;
	
	SampleKeyListener() {
		setVisible(true);
		pack();
		setTitle("Contoh Key Listener");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300,300);
		setLayout(new GridLayout());
		initialize(this);
	}
	
	public static void main(String[] args) {
		new SampleKeyListener();
	}
	
	private void initialize(SampleKeyListener frame) {
		BorderLayout bl = new BorderLayout();
		frame.setLayout(bl);
		JPanel panel =new JPanel();
		panel.setLayout(new FlowLayout());
		labelChar = new JLabel("Char :");
		panel.add(labelChar);
		labelCode = new JLabel("Code :");
		panel.add(labelCode);
		frame.add(panel, bl.NORTH);
		JTextArea textarea = new JTextArea();
		textarea.addKeyListener(this);
		frame.add(textarea, bl.CENTER);
	}
	
	public void keyTyped(KeyEvent e) {
		char letter = e.getKeyChar();
		String word = "Char : "+letter;
		labelChar.setText(word);
	}
	
	public void keyPressed(KeyEvent e) {
		int letter_code = e.getKeyCode();
		String word = "Code : "+letter_code;
		labelCode.setText(word);
	}
	
	public void keyReleased(KeyEvent e) {
		
	}
	
}
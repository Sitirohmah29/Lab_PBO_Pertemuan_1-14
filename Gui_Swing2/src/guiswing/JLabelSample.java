package guiswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JLabelSample extends JFrame {
	JLabelSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(300,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	
	public static void main(String[] args) {
		new JLabelSample();
	}
	
	private void GenerateUI(JLabelSample frame) {
		JLabel label1 = new JLabel("IBI Kesatuan"); 
		label1.setBounds(10,20, 150,50);
		
		JLabel label2 = new JLabel();
		label2.setText("Teknologi Informasi");
		label2.setBounds(10,70, 150, 50);
		
		frame.add(label1);
		frame.add(label2);
	}
}
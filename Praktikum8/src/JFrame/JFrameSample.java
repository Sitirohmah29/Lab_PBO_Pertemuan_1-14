package JFrame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameSample {

	JFrameSample (){
			JFrameSample frame = new JFrameSample();
			
			frame.setVisible(true);
			
			frame.pack();
			frame.setLocationRelativeTo(null);
			
			frame.setSize(300, 300);
			
			frame.setTitle("Contoh Window Frame");
			
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		public static void main(String[] args) {
			new JFrameSample();
		}
	}


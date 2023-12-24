package Gui_Swing2;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App2 extends JFrame {
		App2(){
			setVisible(true);
			pack();
			setLocationRelativeTo(null);
			setSize(300,300);
			setTitle("Contoh Window Frame");
			setBackground(Color.black);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
		public static void main(String[] args) {
			new App2();
		}
}

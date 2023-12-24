 package guiswing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class JMenuSample extends JFrame {
	JMenuSample(){
		setVisible(true); 
		setSize(500,200);
		setTitle("Contoh JMenu");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		GenerateUI(this);
	}
		
	public static void main(String[] args) { 
		new JMenuSample();
	}
		
	private void GenerateUI(JMenuSample frame) {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File"); 
		JMenu editMenu = new JMenu("Edit"); 
		JMenu helpMenu = new JMenu("Help");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		JMenuItem item1 = new JMenuItem("New"); 
		JMenuItem item2 = new JMenuItem("Save"); 
		JMenuItem item3	= new JMenuItem("Exit");
		
		fileMenu.add(item1);
		fileMenu.add(item2);
		fileMenu.add(item3);
		
		frame.setJMenuBar(menuBar);
	}		

}
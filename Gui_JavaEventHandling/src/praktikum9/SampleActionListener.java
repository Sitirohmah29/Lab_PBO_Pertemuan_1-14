package praktikum9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.*;

public class SampleActionListener extends JFrame implements ActionListener {
	private JButton btn;
	
	SampleActionListener(){
		setVisible(true);
		pack();
		setTitle("Contoh Action Listener pada Button");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		btn = new JButton("Click Me");
		btn.addActionListener(this);
		add(btn);
	}
	
	public static void main(String[] args) {
		new SampleActionListener();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn) {
			OtherWindow othFrame = new OtherWindow();
			othFrame.setVisible(true);
			dispose();
		}
	}
	
	private class OtherWindow extends JFrame{
		OtherWindow(){
			setTitle("Other Window");
			setSize(300,300);
			
			JLabel label =  new JLabel("Ini window setelah button di Klik");
			add(label);
		}
	}
}

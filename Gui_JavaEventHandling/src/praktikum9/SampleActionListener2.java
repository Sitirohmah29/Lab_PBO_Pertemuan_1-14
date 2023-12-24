package praktikum9;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.*;

public class SampleActionListener2 extends JFrame {
	private JButton btn;
	
	SampleActionListener2() {
		setVisible(true);
		pack();
		setTitle("Contoh Action Listener pada Button");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300,300);
		setLayout(new FlowLayout());
		
		btn = new JButton("click me");
		btn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				OtherWindow othFrame = new OtherWindow();
				othFrame.setVisible(true);
				dispose();
			}
		});
		
		add(btn);
	}
	
	public static void main(String[] args) {
		new SampleActionListener2();
	}
	
	private class OtherWindow extends JFrame {
        OtherWindow() {
            setTitle("Other Window");
            setSize(300, 300);

            JLabel label = new JLabel("Ini Window setelah button di klik");
            add(label);
        }
    }
}
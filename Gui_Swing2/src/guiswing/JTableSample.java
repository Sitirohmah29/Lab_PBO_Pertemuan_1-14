package guiswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class JTableSample extends JFrame {
	JTableSample() {
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
		setSize(500,300);
		setTitle("Contoh JLabel");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GenerateUI(this);
	}
	
	public static void main(String[] args) {
		new JTableSample();
	}
	
	private void GenerateUI(JTableSample frame) {
		String data[][]={ 
			{"222310075","NOVA SATRIA","B"},
			{"222310009","VINCENT ALBERT FALENSIUS","C"},
			{"222310054","SITI ROHMAH","A"}
		};
		String column[]={"Student ID","Name","Score"};
		
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);
		
		JScrollPane sp=new JScrollPane(jt);
		frame.add(sp);
	}
}
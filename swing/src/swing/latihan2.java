package swing;
import javax.swing.JOptionPane;

public class latihan2 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		jop.showMessageDialog(null, "this is a sample of message dialog");
		
		jop.showMessageDialog(null, "Pesan dengan INFORMATION MESSAGE", "Pesan Informasi", jop.INFORMATION_MESSAGE);
		
		jop.showMessageDialog(null, "Pesan dengan WARNING MESSAGE", "Pesan Warning", jop.WARNING_MESSAGE);
		
		jop.showMessageDialog(null, "Pesan dengan ERROR MESSAGE", "Pesan Error", jop.ERROR_MESSAGE);
		
		jop.showMessageDialog(null, "Pesan dengan QUESTION MESSAGE", "Pesan Pertanyaan", jop.QUESTION_MESSAGE);
	}
}
package swing;
import javax.swing.JOptionPane;

public class latihan3 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama = jop.showInputDialog(null, "masukan nama anda: ");
		System.out.println(nama);		
	}
}
package swing;

import javax.swing.JOptionPane;

public class latihan4 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int confirm = jop.showConfirmDialog(null, "Apakah ini kelas PBO ?", "Konfirmasi", jop.YES_NO_CANCEL_OPTION);
		if(confirm == 1) {
			jop.showMessageDialog(null, "Anda memilih NO");
		}else if(confirm == 0 ) {
			jop.showMessageDialog(null, "Anda memilih YES");
		}else {
			jop.showMessageDialog(null, "Anda memilih CANCEL");
		}
		
	}
}
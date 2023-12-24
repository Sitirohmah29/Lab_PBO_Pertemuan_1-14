import javax.swing.JOptionPane;

public class main {
static mybio mybiodata = new mybio ();
	
	public static void main (String [] args) {
		JOptionPane jop = new JOptionPane ();
		
////input dialog 1 pertanyaan 1 kotak dialog
//		String fullname = jop.showInputDialog(null, "Masukkan nama Anda: ");
//		System.out.println(fullname);
//		String name = mybiodata.ShowName (fullname);
//		
//		String usia = jop.showInputDialog(null, "Masukkan usia anda sekarang: ");
//		System.out.println(usia);
//		int Umur = Integer.parseInt(usia);
//		int umur = mybiodata.ShowUsia (Umur);
//		
//		String alamat = jop.showInputDialog(null, "Masukkan Alamat rumah anda: ");
//		System.out.println(alamat);
//		String addres = mybiodata.ShowAlamat(alamat);
//	

//input dialog dengan 3 input dalam 1 kotak dialog (namun tetap satu pertanyaan)
 String input1 = jop.showMessageDialog(null, "Masukkan nama Anda: , Masukkan usia anda sekarang: , Masukkan Alamat rumah anda :");
        String[] inputs = input1.split(",");
        String input2 = inputs[0].trim();
        String input3 = inputs[1].trim();
        String input4 = inputs[2].trim();
		
		jop.showMessageDialog(null,"Nama Anda: " +input2 +"\nUmur Anda: " +input3 +"\nUmur Anda: " +input4);
				
	}

}


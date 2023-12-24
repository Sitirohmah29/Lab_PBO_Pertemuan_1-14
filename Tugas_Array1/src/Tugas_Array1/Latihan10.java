package Tugas_Array1;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan10 {

	    public static void main(String[] args) {
	        JOptionPane jop = new JOptionPane();
	        ArrayList<String> fields = new ArrayList<>();
	        
	        fields.add(jop.showInputDialog(null, "Masukkan Nama Lengkap anda: "));
	        System.out.println(fields.get(0));
	        
	        fields.add(jop.showInputDialog("Masukkan Alamat anda: "));
	        System.out.println(fields.get(1));
	        
	        fields.add(jop.showInputDialog("Masukkan No Telp anda: "));
	        System.out.println(fields.get(2));

	        StringBuilder message = new StringBuilder();
	        message.append("Nama Lengkap: ").append(fields.get(0)).append("\n");
	        message.append("Alamat: ").append(fields.get(1)).append("\n");
	        message.append("No Telp: ").append(fields.get(2)).append("\n");

	        JOptionPane.showMessageDialog(null, message.toString());
	    }
	}



package Review;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Rohmah {
	public static void main(String[] args) {
		ArrayList<String> ListName = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		JOptionPane jop = new JOptionPane();
//		int jml;
//		String Name; 
		
//		System.out.print("Masukan jumlah data= ");
//		int jml = input.nextInt();
//		input.nextLine();
//		
//		for(int i = 0; i <= jml; i++) {
//			System.out.println("Masukan nama anda: ");
//			String Name = input.nextLine();
//			ListName.add(Name);
//		}
//		for(int a = 0; a <= jml; a++) {
//			System.out.println("Data nama ke-" +(a+1)+ ": " +ListName.get(a));
//		}
		
//		int i = 0;
		
		while(true) {
			String Name = jop.showInputDialog("Masukan nama anda: ");
//			Name = input.nextLine();
			if(Name.equalsIgnoreCase("Selesai")) {
				break;
			}
			ListName.add(Name);
		}
		jop.showMessageDialog(null,ListName);	
	}
}
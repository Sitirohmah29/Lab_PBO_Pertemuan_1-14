package tugas_runtunan;

import java.util.Scanner;

public class latihan06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan usia: ");
		int usia = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Masukan first name: ");
		String firstname = scanner.nextLine(); 
		
		System.out.print("Masukan last name: ");
		String lastname = scanner.nextLine(); 
		
		System.out.print("Masukan NMP: ");
		String npm = scanner.nextLine(); 
		
		String output = usia + firstname + lastname + npm;
		
		System.out.println("Output: "+output);
		
		scanner.close();
	}
}

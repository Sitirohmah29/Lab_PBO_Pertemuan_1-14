package selection;

import java.util.Scanner;

public class selectionif {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String merek = "Samsung";
		Integer battery = 10;//buat ada value
		int stock;
		Boolean isSell = false;
		
		System.out.print("Enter name of tipe phone: ");
		String tipe = input.nextLine();
		
		System.out.print("Enter color of phone: ");
		String color = input.nextLine();
		
		System.out.print("Enter battery health: ");;
		battery = input.nextInt();
		
		if(color.equals("red")) {
			stock = 5; isSell = true;
		}
		else if(color.equals("blue")) {
			stock = 2; isSell = true;
		}
		else {
			stock = 0;
		}
		
		System.out.println("\n======"+merek+"-"+tipe+"======");
		System.out.println("Baterai "+battery+"% ");
		if(battery < 20) {
			System.out.print("(need charging)");
		}
		System.out.println("color "+color+"\nstock: "+stock);
		System.out.println("======"+((isSell) ? "for sale" : "sold").toUpperCase() + "======");
		
		input.close();
	}
}

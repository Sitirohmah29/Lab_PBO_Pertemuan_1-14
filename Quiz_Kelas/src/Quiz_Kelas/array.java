package Quiz_Kelas;
import java.util.Scanner;
import java.util.ArrayList;

public class array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> umur = new ArrayList<Integer>();
		
		for(int i = 0; i < 3; i++) {
			int number; 
			System.out.println("Masukan umur");
			number = input.nextInt();
			umur.add(number);
		}
		for(int i= 0; i < umur.size(); i++) {
			System.out.println("["+i+"]="+umur.get(i));
		}
		input.close(); 
	}
}

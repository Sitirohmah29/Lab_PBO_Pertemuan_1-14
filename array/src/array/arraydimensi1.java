package array;

public class arraydimensi1 {
	public static void main(String[] args) {
		int[] ages = new int[5];
		
		ages [0] = 10;
		ages [1] = 12;
		ages [2] = 5;
		ages [3] = 20;
		ages [4] = 1;
		
		System.out.println("=Value by index=");
		System.out.println("ages[2]="+ ages[2]); 
		System.out.println(" ages[0]="+ ages[0]); 
		
		System.out.println("\n=Use Loop=");
		for (int i = 0; i < 5; i++) {
			System.out.println("ages["+i+"]="+ages[i]);
		}
		  String days[] = {"Mon", "True", "Wed", "Thu", "Fri", "Sat", "Sun"
	};
		for(int d = 0; d < days.length; d++) {
			System.out.print(days[d]);
		}
	}
}

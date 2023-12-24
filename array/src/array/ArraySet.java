package array;

import java.util.ArrayList;

public class ArraySet {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(20);
		ages.add(24);
		ages.add(18);
		ages.add(39);
		
		System.out.println("=Valeu index 2 original=");
		System.out.println("ages[2]="+ages.get(2));
		
		ages.set(2,28);
		
		System.out.println("\n=Use Loop=");
		for(int i = 0; i <ages.size(); i++) {
			System.out.println("age ["+i+"]="+ages.get(i));
		}
	}
}

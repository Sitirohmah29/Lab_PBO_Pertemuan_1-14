package array;

import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(20);
		ages.add(24);
		ages.add(18);
		ages.add(39);
		
		System.out.println(ages);
		
		System.out.println("\n=Value by index=");
		System.out.println("ages[2]="+ages.get(2));
		System.out.println("\n=Use Loop=");
		for(int i = 0; i< ages.size(); i++) {
			System.out.println("age["+i+"]="+ages.get(i));
		}
		System.out.println("\n=Valeu index 2 original=");
		System.out.println("ages[2]="+ages.get(2));
		
		ages.set(2,28);
		System.out.println("\n=Use Loop=");
		for(int i = 0; i <ages.size(); i++) {
			System.out.println("age ["+i+"]="+ages.get(i));
		}
		ages.remove(2);
		System.out.println("\n=Use Loop Remove=");
		for(int i = 0; i <ages.size(); i++) {
			System.out.println("age ["+i+"]="+ages.get(i));
		}
		ages.clear();
		System.out.println("\nArray ages = \n"+ages);
		}
	
	} 


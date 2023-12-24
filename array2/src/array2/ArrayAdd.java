package array2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAdd {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> x = new ArrayList<ArrayList<Integer>>();
		
		x.add(new ArrayList<Integer>());
		x.get(0).add(0, 3);
		//collections
		//cara menambahkan value 
		x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
		
		x.get(1).add(0, 336);
		x.get(1).add(4, 576);
		x.add(2, new ArrayList<Integer>(Arrays.asList(3, 84)));
		
		x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));
		
		x.add(new ArrayList<>(Arrays.asList(8)));
		x.get(4).addAll(Arrays.asList(9, 10, 11));
		
		x.get(1).addAll(3, Arrays.asList(22, 1000));
		
		System.out.println(x);
		
		System.out.print("Array x [1][0] =");
		System.out.println(x.get(1).get(0));
		
		System.out.print("Nilai baru x[1][0] =");
		x.get(1).set(0, 23);
		
		System.out.println(x.get(1).get(0));
		
		x.get(1).remove(2);
		System.out.println(x.get(1));
		
		x.clear();
		System.out.println(x);
		
		
	}
}

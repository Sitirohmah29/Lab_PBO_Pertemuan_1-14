package Review;
import java.util.ArrayList;

public class arrayl {
	public static void main(String[] args) {
		ArrayList<String> ListName =  new ArrayList<String>();
		ListName.add("rohmah");
		ListName.add("andin");
		ListName.add("sophie");
		ListName.add("naila");
		ListName.add("risma");
		
		ListName.set(2, "iki");
		
		System.out.println(ListName);
		System.out.println("nama index-2 setelah diubah: "+ListName.get(2)); 
	}
}

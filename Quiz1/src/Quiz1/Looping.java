package Quiz1;
import java.util.Scanner; 

public class Looping {
	  public static void main(String args[]){
		  Scanner input = new Scanner(System.in);
		  System.out.println("##  Program Java Belah Ketupat Bintang  ##");
		  System.out.println("==========================================");
		  System.out.println();
		  
		  int lebar_belah_ketupat,i,j,k;
		  System.out.print("Input lebar belah ketupat: ");
	      lebar_belah_ketupat = input.nextInt();
	      System.out.println();
	      for(i=1; i<=lebar_belah_ketupat; i++) {
	    	  for(j=1; j<=lebar_belah_ketupat-i; j++) {
	    		  System.out.print(" ");
	      }
	    	  for(k=1; k<=i; k++) {
	    		  System.out.print(" *");
	      }
	    	  System.out.println();
	    }
	      for(i=1; i<lebar_belah_ketupat; i++) {
	    	  for(j=1; j<=i; j++) {
	    		  System.out.print(" ");
	      }
	    	  for(k=1; k<=lebar_belah_ketupat-i; k++) {
	    		  System.out.print(" *");
	      }
	    	  System.out.println();
	    }    
	     input.close(); 
	  }
	}


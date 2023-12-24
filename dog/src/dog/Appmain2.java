package dog;

import java.util.Scanner;

public class Appmain2 {
static Dog mydog = new Dog();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer age = mydog.showAge();
		System.out.println("Age of my dog is "+age);
		
		System.out.print("enter the height of dog: ");
		int height = scanner.nextInt();
		Float weight = mydog.showWeight(height);
		System.out.println("weight of my dog is "+weight);
		
		System.out.print("enter the gender of dog: ");
		char gender = scanner.next().charAt(0);
		String genderName = mydog.showGender(gender);
		System.out.println("gender of my dog is  "+genderName);
		
		scanner.close();
	}

}

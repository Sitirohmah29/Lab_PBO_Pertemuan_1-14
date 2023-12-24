package dog;

public class AppMain {
	static Dog mydog = new Dog();
	
	public static void main(String[] args) {
		Integer age = mydog.showAge();
		System.out.println("Age of my dog is "+age);
		int height = 20;
		Float weight = mydog.showWeight(height);
		System.out.println("weight of my dog is "+weight);
		
		char gender = 'F';
		String genderName = mydog.showGender(gender);
		System.out.println("enter the gender of dog: "+genderName);
	}
}

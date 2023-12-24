package dog;

public class Dog {
	int Age= 10;
	String Gender;
	
	void barking() {
		System.out.println("woof..woof..");
	}
	Integer showAge() {
		return Age;
	}
	Float showWeight(int height) {
		Float weight = (float) ((height-100)-((height-100)*100));
		return weight;
	}
	String showGender(char value) {
		Gender = "Female";
		if(value == 'M') {
			Gender = "Male";
		}
		return Gender;
	}
}

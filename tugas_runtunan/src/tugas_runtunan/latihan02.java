package tugas_runtunan; 

import java.util.Scanner;

public class latihan02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukan suhu dalam celsius:");
		double celsius = scanner.nextDouble();
		double fahrenheit = KonversiDariCelsiusKeFahrenheit(celsius);
		double reamur = KonversiDariCelsiusKeReamur(celsius);
		double kelvin = KonversiDariCelsiusKeKelvin(celsius);
		
		System.out.println(celsius+"Celsius="+fahrenheit+"Fahrenheit");
		System.out.println(celsius+"Celsius="+reamur+ "Reamur");
		System.out.println(celsius+"Celsius="+kelvin+"Kelvin");
		
		scanner.close();
	}
	private static double KonversiDariCelsiusKeFahrenheit(double celsius) {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
	}
	private static double KonversiDariCelsiusKeReamur(double celsius) {
		return celsius * 4/5;
	}
	private static double KonversiDariCelsiusKeKelvin(double celsius) {
		return celsius + 273.15;
	}
}

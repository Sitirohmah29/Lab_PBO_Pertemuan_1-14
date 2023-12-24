package latihan09;

import java.util.Scanner;

public class appmain {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student NPM: ");
        int NPM = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Full Name: ");
        String FullName = scanner.nextLine();

        System.out.print("Enter Class Name: ");
        String ClassName = scanner.nextLine();

        System.out.print("Enter Semester: ");
        int Semester = scanner.nextInt();

        System.out.print("Enter GPA: ");
        float GPA = scanner.nextFloat();

        scanner.close();
    }
}

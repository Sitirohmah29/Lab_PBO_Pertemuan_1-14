package tugas_runtunan;

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

       latihan09 student = new latihan09(NPM, FullName, ClassName, Semester, GPA);

        student.displayStudentInfo();

        scanner.close();
    }
}

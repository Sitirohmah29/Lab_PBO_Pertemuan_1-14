package latihan09;

public class Students {
	private int NPM;
    private String FullName;
    private String ClassName;
    private int Semester;
    private float GPA;

    public Students() {
        this.NPM = NPM;
        this.FullName = FullName;
        this.ClassName = ClassName;
        this.Semester = Semester;
        this.GPA = GPA;
    }

	 public void displayStudentInfo() {
	        System.out.println("Student NPM: " + NPM);
	        System.out.println("Full Name: " + FullName);
	        System.out.println("Class Name: " + ClassName);
	        System.out.println("Semester: " + Semester);
	        System.out.printf("GPA: %.2f%n", GPA);
	 }
}
package introducao_OO;

import java.util.Locale;
import java.util.Scanner;

public class Program_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("NAME: ");
		student.name = sc.nextLine();
		System.out.println("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f POINTS%n", student.finalGrade());
		
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING 8.00 POINTS");
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}

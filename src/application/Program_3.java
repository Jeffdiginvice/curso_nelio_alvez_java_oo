package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product_vetor;

public class Program_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product_vetor[] vect = new Product_vetor[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product_vetor(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICER = %.2f%n", avg);
		
		sc.close();

	}

}

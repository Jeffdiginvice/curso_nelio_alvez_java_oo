package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("QUantas pessoas serão digitadas?");
		int n = sc.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.println("Nome: ");
			nome[i] = sc.next();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + altura[i];
		}
		
		double mediaAltura = soma / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", mediaAltura);
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				cont = cont +1;
			}
		}
		
		double percent = cont * 100.0 / n;
		System.out.printf("Pessoa com menos de 16 anos: %.1f%%%n", percent);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		sc.close();

	}

}

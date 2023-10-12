package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Aula_do_for {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char resp;
		do {
			System.out.println("Digite a temperatura em celsius");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.err.println("Deseja repetir! (s/n)");
			resp = sc.next().charAt(0);
					
		}while(resp != 'n');
		
		System.out.println("Porgrama encerrado!");
		
		sc.close();

	}

}

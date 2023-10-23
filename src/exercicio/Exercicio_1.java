package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currency = new CurrencyConverter();
		
		currency.dollar = sc.nextDouble();
		currency.dollarBought = sc.nextDouble();
		
		System.out.println(currency);
		
		
		sc.close();
		

	}

}

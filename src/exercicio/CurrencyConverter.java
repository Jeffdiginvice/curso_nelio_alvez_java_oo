package exercicio;

public class CurrencyConverter {

	public double dollar;
	public double dollarBought;
	public double dollarInReal;
	
	public double currencyConverter() {
		return dollar * (dollarBought * 6.0 / 100.0);
	}
	
	public String toString() {
		return String.format("%.2f", currencyConverter());
	}
}

package entities;

public class Account_1 {

	private Integer number;
	private String holer;
	protected Double balance;
	
	public Account_1() {
	}
	
	public Account_1(Integer number, String holer, Double balance) {
		this.number = number;
		this.holer = holer;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoler() {
		return holer;
	}

	public void setHoler(String holer) {
		this.holer = holer;
	}

	public Double getBalance() {
		return balance;
	}

	public void withDraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
}

package entities;

public class SavingAccount extends Account_1{

	private Double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(Integer number, String holer, Double balance, Double interestRate) {
		super(number, holer, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void uddateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}
	
}

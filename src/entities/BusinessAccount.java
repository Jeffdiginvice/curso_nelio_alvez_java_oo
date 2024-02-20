package entities;

public class BusinessAccount extends Account_1 {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holer, Double balance, Double loanLimit) {
		super(number, holer, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
}

package application;

import entities.Account_1;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program_10 {

	public static void main(String[] args) {
		
		
		Account_1 acc1 = new Account_1(1001, "Alex", 1000.0);
		acc1.withDraw(200.0);
	    System.out.println(acc1.getBalance());
	    
	    Account_1 acc2 = new SavingAccount(1002, "Maria", 1000.0, 0.01);
	    acc2.withDraw(200.0);
	    System.out.println(acc2.getBalance());
	    
	    Account_1 acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
	    acc3.withDraw(200.0);
	    System.out.println(acc3.getBalance());
		
		/*Account_1 acc = new Account_1(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		// UPCASTING
		
		Account_1 acc1 = bacc;
		Account_1 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account_1 acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING 
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.uddateBalance();
			System.out.println("Update!");
		}
		*/
		
	}

}

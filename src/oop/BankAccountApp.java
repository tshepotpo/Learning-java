package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0554138";
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0554138";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0554138";
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
	}

}

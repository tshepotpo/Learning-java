package oop;

public class BankAccount {
    // Define variables
	String accountNumber;
    static String routingNumber = "05656";
    String name;
    String ssn;
    String accountType;
    
    BankAccount() {
    	System.out.println("NEW ACCOUNT CREATED");
    }
    
    // Overloading
    BankAccount(String accountType) {
    	System.out.println("NEW ACCOUNT: " + accountType);
    	
    }
    
    BankAccount(String accountType, double intDeposit) {
    	System.out.println("NEW ACCOUNT: " + accountType);
    	System.out.println("INITIAL DEPOSIT OF: R" + intDeposit);
    }
    
    // Define methods
    void deposit() {
    	
    }
    
    void withdraw() {
    
    }
    
    void checkBalance() {
    	
    }
    
    void getStatus() {
    	
    }
    
    
}

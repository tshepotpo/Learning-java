package Labs;

public class BankAccountApp {

    public static void main(String[] args) {
       bankaccount acc1 = new bankaccount("6754322368");
       bankaccount acc2 = new bankaccount("0987652451");
       bankaccount acc3 = new bankaccount("9876765657");

       acc1.setName("Tshepo");
       System.out.println(acc1.getName());
       
	}

}
 class bankaccount {
	//Properties of a Bank account
	 private static int iD = 1000;       //internal ID
	 private String accountNumber;       // ID + random 2-digit number + first 2 SSN
	 private static final String routingNumber = "00427";
	 private String name;
	 private String SSN;
	 private double balance;
	 
	 //Constructors 
	 public bankaccount (String SSN) {
		 this.SSN = SSN;
		 iD++;
		 setAccountNumber();
		 
	 }
	 
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("your account number: " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
		
	 }
 }

public class Bank {
	 double currentBalance; // Current Account Balance
	    String accountName; // Account Holder Name

	    public Bank(double balanc, String userName) {
	        //1
	        currentBalance = balanc;
	        accountName = userName;

	    }

	    public Bank(double balanc) {
	        //2
	    }

	    public Bank() {
	        //3
	    }

	    public Bank(int balanc, String userName) {
	        //4
	        currentBalance = balanc;
	        accountName = userName;

	    }

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    void makeWithdraw(double withdrawAmount) { // Withdraw Method
	        currentBalance = currentBalance - withdrawAmount;
	        System.out.println("Current balance = $" + currentBalance);
	        System.out.println("");
	    }

	    void makeDeposit(double depositAmount) { // Deposit Method
	        currentBalance = currentBalance + depositAmount;
	        System.out.println("Current balance = $" + currentBalance);
	        System.out.println("");
	    }

	    void getCurrentBalance(double cur) { // Get Current Balance Method
	        System.out.println("Current balance = $" + currentBalance);
	        System.out.println("");
	    }

	    void printAccountName() { // Print Account Name Method
	        System.out.println("Account holder name = " + accountName);
	        System.out.println("");
	    }

	    public static void main(String[] args) {

	        Bank customer1 = new Bank(10000000.0, "Bill"); // Create customer1 object
	        Bank customer2 = new Bank(10000, "Adrit"); // Create customer2 object
	       
	       
	        Bank con3 = new Bank();
	        Bank con15 = new Bank();
	         Bank con4 = new Bank(14, "userName");

//	        Bank bank1 = new Bank();

	        customer1.accountName = "Bob"; // Account holder 1 name and starting balance
	        customer1.currentBalance = 500.50;

	        customer2.accountName = "Mike"; // Account holder 2 name and starting balance
	        customer2.currentBalance = 1250.25;

	        System.out.println(
	                "Customer Name: " + customer1.accountName + " - Current Balance = " + "$" + customer1.currentBalance);
	        System.out.println("");

	        System.out.println(
	                "Customer Name: " + customer2.accountName + " - Current Balance = " + "$" + customer2.currentBalance);
	        System.out.println("");

	        System.out.println("-----------------------------------------------");

	        System.out.println("Bob deposits $250.00");
	        customer1.makeDeposit(250);
	        System.out.println(
	                "Customer Name: " + customer1.accountName + " - Current Balance = " + "$" + customer1.currentBalance);
	        System.out.println("");

	        System.out.println("Mike withdraws $100.00");
	        customer1.makeWithdraw(100);
	        System.out.println(
	                "Customer Name: " + customer2.accountName + " - Current Balance = " + "$" + customer2.currentBalance);
	        System.out.println("");

	    }
}
	

	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
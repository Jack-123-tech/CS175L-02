import java.util.Scanner;
public class BankaccountTester {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter amount to start the account:");
	double startBal= in.nextDouble();
	System.out.println("Enter Interest rat for this account:");
	double InterstPct= in.nextDouble();
	
	
	
	
	
 	Bankaccount myBankAccount= new Bankaccount(startBal, InterstPct);
 	
 	 
 	 
 	System.out.println("Created new account with:" + startBal); System.out.println("and intrest rate of"  +InterstPct);
 	
 	
 	System.out.println("Enter how much you would like to deposit:");
 	double depositamount= in.nextDouble();
 	
 	myBankAccount.deposit(depositamount);
 	
 	System.out.println("Enter how much you would like to withdraw:");
 	double withdrawamount= in.nextDouble();
 	in.nextLine();
 	myBankAccount.withdraw(withdrawamount);
 	
 	System.out.println("Enter how much you would like to withdraw:");
 	double withdrawamount2=in.nextDouble();
 	in.nextLine();
 	myBankAccount.withdraw(withdrawamount2);
 	System.out.println("Do you want to generate your interest, enter 'Yes'");
 	String response=in.nextLine();
 	
 	if (response.equals("Yes") ) {
 		myBankAccount.calcInterest();
 		System.out.println("This is your total Balance:" +myBankAccount.getBalance());
 			}
 	
 	else  {
 	System.out.println("This is your account without Interest:"+  myBankAccount.getBalance());
 	System.exit(0);
 	}
 
 	



	}


}

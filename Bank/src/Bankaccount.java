
public class Bankaccount {
	/**
	   A bank account has a balance and a mechanism for
	   applying interest or fees at the end of the month.
	*/
	
	
	   private double balance;
	   private double InterestPct;
 
	   /**
	      Constructs a bank account with zero balance.
	   */
	   public  Bankaccount(double amount, double interestRate)
	   {
	       balance = amount;
	       InterestPct=interestRate;
	   }

	   /**
	      Makes a deposit into this account.
	      @param amount the amount of the deposit
	   */
	   public void deposit(double amount)
	   {
	      balance = balance + amount;
	      System.out.println("Deposited:" + amount);
	   }

	   /**
	      Makes a withdrawal from this account, or charges a penalty if
	      sufficient funds are not available.
	      @param amount the amount of the withdrawal
	   */
	   public void withdraw(double amount)
	   {
		   if(amount<=balance) {
		  
	      balance = balance - amount;
	      System.out.println("Withdrew:"+ amount);
	      
		   }
		   else {
			  System.err.println("Insufficient Fund to support withdrawal");
			 
			 	
			 		   }
	   }
	   public void calcInterest() {
		   
		 double  Interest = balance* InterestPct;
		   balance= balance+ Interest;
		   System.out.println("Interest:"+Interest);
	   }
	   
	  
	   
	   public double getBalance()
	   {
	      return balance;
	   }
	}

	
		// TODO Auto-generated method stub
		
	



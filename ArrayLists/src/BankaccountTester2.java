import java.util.ArrayList;

public class BankaccountTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BankAccount gil= new BankAccount("Gil", 500);
	BankAccount joe = new BankAccount("joe",1000);
	BankAccount fred= new BankAccount("Fred",2000);
	BankAccount sally= new BankAccount ("Sally",2500);
	
	
	
	ArrayList<BankAccount> accountList=new ArrayList<>();

	
	accountList.add(gil);
	accountList.add(joe);
	accountList.add(fred);
	
	for(BankAccount account: accountList) {
		System.out.println(account.getAccount());
	}
	
	accountList.add(sally);
	
	
	
	
	
	
	
	
	
	
	//System.out.println(highval);
	
		double highval= accountList.get(0).getBalance();
		int highpos=0;
		
	
	
	for (int i=1; i<accountList.size();i++) {
		if(accountList.get(i).getBalance()>highval) {
			highval=accountList.get(i).getBalance();
			highpos=i;
			
		}
		
		
	}
	System.out.println("This is the highest Balance: ");
	System.out.println(accountList.get(highpos).getAccount());
	
	accountList.remove(sally);
	 highval= accountList.get(0).getBalance();
	 highpos=0;
	for (int i=1; i<accountList.size();i++) {
		if(accountList.get(i).getBalance()>highval) {
			highval=accountList.get(i).getBalance();
			highpos=i;
	
			
		}
		
		
	}
	System.out.println("This is the highest Balance when sally is removed: ");
	System.out.println(accountList.get(highpos).getAccount());
	
	}

}

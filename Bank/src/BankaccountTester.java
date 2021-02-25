import java.util.Scanner;
public class BankaccountTester {


	public static void main(String[] args) {
double startBal=0;
 Bankaccount myBankAccount= new Bankaccount(startBal);

System.out.println("Enter Starting Balance for your account");
 
Scanner in = new Scanner(System.in);

 startBal=in.nextDouble();
System.out.println("Enter how much you would like to withdraw:");
double withdrawamount= in.nextDouble();
myBankAccount.withdraw(withdrawamount);
System.out.println("Enter how much you would like to deposit:");
double depositamount= in.nextDouble();
myBankAccount.deposit(depositamount);

System.out.println(myBankAccount.getBalance());



	}


}

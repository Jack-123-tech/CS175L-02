import java.util.Scanner;

public class Bankthrushold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int months=0;
		double bal=0;
		double interst=0;
		double target=0;
		 Scanner in = new Scanner(System.in);
			//insert start bal
		 System.out.print("Please enter the starting Balance for your account:");
		bal=in.nextDouble();
			//scanner here for bal named inputbal
			//inster interst 
		System.out.print("Please enter your interst for your account:");
		interst=in.nextDouble();
			//scanner input interst
			//instert target 
		System.out.print("Please enter the target balance for your account:");
			
		
			while(in.hasNextDouble()) {
				
				double treshold= in.nextDouble();
					while (bal < treshold )
				{ double  Intt = bal* interst;
				   bal= bal+ Intt;
					months++;}
					System.out.println("This is the amount of months it will take to reach your target:"+months);
					System.out.print("Please enter the target balance for your account or end:");
			}
		
			
				
		
				
		}
	
		
	}
	


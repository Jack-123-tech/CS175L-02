import java.util.Scanner;

public class creditprocess {

	
	
	
	
	
	public static void main(String[] args) {
		

	
		   
		        String creditcardNumber = null;
		        Scanner in = new Scanner(System.in);
		        System.out.println("Please enter the credit card number or -99 to end:");
		        while(in.hasNextLine()){
		            creditcardNumber=in.next();
		            if (creditcardNumber.equals("-99"))
		            {  System.out.print("Goodbye");
		                break; }

		        int i=0;

		        while (i<creditcardNumber.length())
		        {
		            char cc = creditcardNumber.charAt(i);

		            if (cc==' '|| cc=='-') {
		                String before = creditcardNumber.substring(0,i);
		                String after = creditcardNumber.substring(i+1);
		                creditcardNumber=before+after;

		            }
		            else {
		                i++;

		                }
		}
		        System.out.println(creditcardNumber);

		        }
		    }
		    }









	



import java.util.Scanner;


public class romanNumeral {
	static Scanner in = new Scanner(System.in);
	static int inputNumber=0;
	public static void integerToRoman(int num) {
	int[] numvalues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	String[] romannumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

	
	StringBuilder s =new StringBuilder();
	
	 for(int i=0;i<numvalues.length;i++) {
         while(num >= numvalues[i]) {
             num -= numvalues[i];
             s.append(romannumerals[i]);
		}
	}
	System.out.println("Roman:"+ s.toString());
	
 }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number you would like to be converted:");
		inputNumber=in.nextInt();
		integerToRoman(inputNumber);
		

}}

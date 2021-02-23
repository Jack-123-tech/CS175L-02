package mailMerge;

import java.util.Scanner;

public class MailMerge {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	String ReplaceText1=new String("Dear, <firstname> <lastName>");
	String ReplaceText2=new String("Please confirm that your adress is <housenumber> <street>");
	String entername= "Please enter your first name:";
	String enterLastname="Please enter your last name:";
	String enterhousenum= "Please enter your house number:";
	String enterstreet= "Please enter your street:";
	String answerfinal= "Is this address correct:";
	
	System.out.println(entername);
	entername=in.nextLine();
	System.out.println(enterLastname);
	enterLastname=in.nextLine();
	System.out.println(enterhousenum);
	enterhousenum=in.nextLine();
	System.out.println(enterstreet);
	enterstreet=in.nextLine();
	ReplaceText1= ReplaceText1.replace("<firstname>",entername).replace ("<lastName>",enterLastname);
	
	System.out.println(ReplaceText1);
	
	ReplaceText2=ReplaceText2.replace("<housenumber>",enterhousenum).replace("<street>",enterstreet);
	System.out.println(ReplaceText2);
	System.out.println(answerfinal);
	answerfinal=in.nextLine();
	System.out.println(answerfinal + "Goodbye");
	
	
	
	
	
	
	
		
		
		
		
	}

}

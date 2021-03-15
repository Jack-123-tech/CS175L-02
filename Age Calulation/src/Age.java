import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class Age {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		
	        //TODAYS DATE
	        LocalDate now= LocalDate.now();

	        String  pop = JOptionPane.showInputDialog("Enter your Birthdate (MM/DD/YYYY)");
	        int birthMonth =Integer.parseInt(pop.substring(0,2));
	        int dayOfBirth= Integer.parseInt(pop.substring(3,5));
	        int yearOfbirth=Integer.parseInt(pop.substring(6));
	        System.out.println("year " + yearOfbirth + " day " + dayOfBirth + "month " + birthMonth);

	        DateTimeFormatter dTf= DateTimeFormatter.ofPattern("MM/dd/YYYY");
	        String formatted = now.format(dTf); 
	        System.out.println("todays date is: " + formatted); 

	        int yearNow= Integer.parseInt(formatted.substring(6));
	        int dayNow = Integer.parseInt(formatted.substring(3,5));
	        int monthNow=Integer.parseInt(formatted.substring(0,2));
	        System.out.println("year " + yearNow + " day " + dayNow + "month " + monthNow); 

	        int ageOfYears= yearNow-yearOfbirth;
	        int ageByMonth= monthNow-birthMonth;
	        int AgeofDays=dayNow-dayOfBirth;
	        if(monthNow<birthMonth) {
	        	
	        	ageByMonth=ageByMonth+12;
	        	--ageOfYears;
	        	
	        }
	        
	        
	        
	        System.out.println("year " + ageOfYears + " day " + AgeofDays + "month " + ageByMonth); 

	 JOptionPane.showMessageDialog(null, "Your are: "+ageOfYears+ " years " + ageByMonth + " Months "
	               + " and "+ AgeofDays+ " days old");


	    }

	    }
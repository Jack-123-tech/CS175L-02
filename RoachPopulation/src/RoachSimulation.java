import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class RoachSimulation {

	public static void main(String[] args) {
		double population=0;
		
		
		
		
		RouchPopulation bug= new RouchPopulation(population);
		
		
		String  pop = JOptionPane.showInputDialog("Enter the starting population of the Roaches example '30':");
		double startsize= Double.parseDouble(pop);
		
		 JOptionPane.showMessageDialog (null,"This Initial Roach Population is: "+ startsize);
		double breed1=bug.breed(startsize);
		
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 1 breeding is:"+ bug.getRoaches());
		 
		String perc= JOptionPane.showInputDialog("Enter the spray percentage for cycle 1: ");
		double amountEnt=Double.parseDouble(perc);
		
		
		double spray1=bug.spray(breed1,amountEnt);
		DecimalFormat decFormat = new DecimalFormat("0.00");
	      DecimalFormat wholeFormat = new DecimalFormat("00");
	   
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 1:" + amountEnt  +  "  Spraying is:   "  + decFormat.format(spray1));
		 
		 double breed2 =bug.breed(breed1-spray1);
		 
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 2 breeding is:"+ breed2);
	 String perc1=JOptionPane.showInputDialog("Enter the spray percentage for cycle 2: ");
		 double amountEnt1=Double.parseDouble(perc1);
	
		double spray2= bug.spray(breed2,amountEnt1);
		
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 2:" + amountEnt1  +   " Spraying is "  +decFormat.format(spray2));
		 double breed3 =bug.breed(breed2-spray2);
		 System.out.print(breed3);
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 3 breeding is:"+ breed3);
	 String perc2=JOptionPane.showInputDialog("Enter the spray percentage for cycle 3: ");
	 double amountEnt2=Double.parseDouble(perc2);
	
	 double spray3=bug.spray(breed2,amountEnt2);
	
	 JOptionPane.showMessageDialog(null, "The Roach population after cycle 3:" + amountEnt2  +  "  Spraying is "  +decFormat.format(spray3));
		 
	 double breed4 =bug.breed(breed3-spray3);
	 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 4 breeding is:"+ breed4);
	 
	 String perc3=JOptionPane.showInputDialog("Enter the spary percentage for cycle 4: ");
		 double amountEnt3=Double.parseDouble(perc3);
		 double spray4=bug.spray(breed4,amountEnt3);
		
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 4:" + amountEnt3  +  " Spraying is "+  decFormat.format(spray4));
		 
		 
		
		
		
	}

}

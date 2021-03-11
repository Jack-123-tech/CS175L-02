import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class RoachSimulation {

	public static void main(String[] args) {
		
		
		DecimalFormat wholeFormat = new DecimalFormat("0");
		
		
		
		
		
		String  pop = JOptionPane.showInputDialog("Enter the starting population of the Roaches example '30':");
		double startsize= Double.parseDouble(pop);
		RouchPopulation bug= new RouchPopulation(startsize);
		 JOptionPane.showMessageDialog (null,"This Initial Roach Population is: "+ startsize);
		bug.breed();
		
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 1 breeding is:"+  wholeFormat.format(bug.getRoaches()));
		 
		String perc= JOptionPane.showInputDialog("Enter the spray percentage for cycle 1: ");
		double amountEnt=Double.parseDouble(perc);
		
		
		bug.spray(amountEnt);
		DecimalFormat decFormat = new DecimalFormat("0.00");
	      
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 1:" + amountEnt  +  "  Spraying is:   "  + wholeFormat.format(bug.getRoaches()));
		 
		 bug.breed();
		 
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 2 breeding is:"+ wholeFormat.format(bug.getRoaches()));
	 String perc1=JOptionPane.showInputDialog("Enter the spray percentage for cycle 2: ");
		 double amountEnt1=Double.parseDouble(perc1);
	
		 bug.spray(amountEnt1);
		
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 2:" + amountEnt1  +   " Spraying is "  +wholeFormat.format(bug.getRoaches()));
		  bug.breed();
		 
		 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 3 breeding is:"+ wholeFormat.format(bug.getRoaches()));
	 String perc2=JOptionPane.showInputDialog("Enter the spray percentage for cycle 3: ");
	 double amountEnt2=Double.parseDouble(perc2);
	
	 bug.spray(amountEnt2);
	
	 JOptionPane.showMessageDialog(null, "The Roach population after cycle 3:" + amountEnt2  +  "  Spraying is "  +wholeFormat.format(bug.getRoaches()));
		 
	  bug.breed();
	 JOptionPane.showMessageDialog(null,"This is the Roach population After cycle 4 breeding is:"+ wholeFormat.format(bug.getRoaches()));
	 
	 String perc3=JOptionPane.showInputDialog("Enter the spary percentage for cycle 4: ");
		 double amountEnt3=Double.parseDouble(perc3);
		bug.spray(amountEnt3);
		
		 JOptionPane.showMessageDialog(null, "The Roach population after cycle 4:" + amountEnt3  +  " Spraying is "+ wholeFormat.format(bug.getRoaches()));
		 
		 
		
		
		
	}

}

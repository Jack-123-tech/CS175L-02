import java.util.Scanner;

public class HousePaintingclass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
 int Length = 0;
 int Width = 0;
 int Height=0;
 int DoorLength=0;
 int Doorwidth=0;
 int numberofDoors=0;
 int windowLength=0;
 int windowWidth=0;
 double costperSqft=0;
 int Windownumbers=0;
 double SqftwithoutPeak=0;
 double Totalwithpeak=0;
 int DoorTotal=0;
 int WindowsTotal=0;
 int TotalSqFt=0;
 double FinalSQ=0;
 double Lastresult=0;
 
 System.out.println("Please Enter the Length of the house:");
 Length=in.nextInt();
 System.out.println("Please Enter the Width of the house:");
 Width=in.nextInt();
 System.out.println("Please Enter the Height of the house:");
 Height=in.nextInt();
 System.out.println("Please Enter the Length of the Door:");
 DoorLength=in.nextInt();
 System.out.println("Please Enter the width of the Door:");
 Doorwidth=in.nextInt();
 System.out.println("Enter the total amount of Doors:");
 numberofDoors=in.nextInt();
 System.out.println("Please Enter the width of the windows:");
 windowWidth=in.nextInt();
 System.out.println("Please Enter the length of the windows:");
 windowLength=in.nextInt();
 System.out.print("Please enter the amount of windows:");
 Windownumbers=in.nextInt();
 System.out.println("Please Enter the cost per Squre Foot:");
 costperSqft=in.nextDouble();
 SqftwithoutPeak= (Length * Width) * 2.0;
 Totalwithpeak=  (Length * Width + .5 * (Length*(Height-Width))) *2.0;
 DoorTotal= DoorLength * Doorwidth * numberofDoors;
 WindowsTotal= windowLength * windowWidth * Windownumbers;
 FinalSQ= (SqftwithoutPeak + Totalwithpeak) - DoorTotal - WindowsTotal;
 System.out.println(FinalSQ);
 Lastresult= FinalSQ * costperSqft;
 System.out.println("Total cost to paint the House:"+Lastresult);
 
		 
 
 
 
 
 

 
		 
 
 
		 
	}

}

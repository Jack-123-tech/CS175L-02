
public class TestFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("dddddddeeee");
		Fraction f0= new Fraction (4,6);
		System.out.println("~~~~~~~~~~");
		System.out.println(f0);
		
		
		Fraction f1= new Fraction(5,8);
		Fraction f2= new Fraction(1,9);
		Fraction f3= new Fraction();
		
		f3=f3.Add(f1, f2);
		System.out.println( f1 + " + " + f2 + " = " + f3 ); //
		 f3= f3.subtract( f1, f2 ); 
		 System.out.println( f1 + " - " + f2 + " = " + f3 );
		
		f3=f3.multiply(f1, f2);
		System.out.println( f1 + " * " + f2 + " = " + f3 );
		f3=f3.divide(f1, f2);
		System.out.println( f1 + " / " + f2 + " = " + f3 );
		
		
		
		
		
		
	}

}


public class Fraction {
	
		private int numerator;
		private int denominator;
		
		Fraction(int n, int d) {
			
		this.numerator=n;
		this.denominator=d;
		
		reduce();
		}
		
		Fraction() {
			
		this.numerator=0;
		this.denominator=0;
		}
		
	
	private void reduce(){
		int gcf = Math.min(numerator, denominator);
		while(gcf > 1) {
    		if(this.numerator % gcf == 0 && this.denominator % gcf == 0) {
    			break;
    		}
    		
    		gcf--;
	}

		
		this.numerator = this.numerator/gcf;
		this.denominator = this.denominator/gcf;
	
	}
	
	
	public String toString() {
		return this.numerator+"/"+this.denominator;
	}
	
	public Fraction Add(Fraction f1,Fraction f2) {
		int sumNumerator = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
    	int sumDenominator = f1.denominator * f2.denominator;
    	return new Fraction(sumNumerator, sumDenominator);
	}
	
	public Fraction subtract(Fraction f1, Fraction f2) {
		int diffNumerator = f1.numerator * f2.denominator - f1.denominator * f2.numerator;
    	int diffDenominator = f1.denominator * f2.denominator;
    	return new Fraction(diffNumerator, diffDenominator);
	}
	
	
	public Fraction multiply(Fraction f1, Fraction f2) {
		int productNumerator =f1.numerator*f2.numerator;
		int productDenomoinator=f1.denominator*f2.denominator;
		return new Fraction(productNumerator,productDenomoinator);
	}
	
	public Fraction divide(Fraction f1,Fraction f2) {
		int divsNumerator=f1.numerator*f2.denominator;
		int divsDemonmoinator=f2.numerator*f1.denominator;
		return new Fraction (divsNumerator,divsDemonmoinator);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

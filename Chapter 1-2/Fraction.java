public class Fraction {
    private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d){
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments) done
	public Fraction(){
		numerator = 1;
		denominator = 2;
	}
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract() done
	public Fraction subtract(Fraction other){
		int n = this.numerator*other.denominator - this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();

		Fraction result = new Fraction(n,d);
		return result;

	}
	
	// TODO multiply() done
	public Fraction multiply(Fraction other){
		int n = this.numerator*other.denominator * this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO toString() done
	public String toString(){
		String f = numerator + "/" + denominator;
		return f;
	}
	
	// TODO reciprocal() don't need fraction other 
	public Fraction reciprocal(Fraction other){
		int n = this.denominator * other.getDenom();
		int d = this.numerator*other.denominator * this.denominator*other.numerator;

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		System.out.println("3/4 + 4/5 = " + f3);	// print the answer
			
		
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		Fraction f5 = f1.multiply(f2);
		System.out.println(f1 + "*" + f2 + "=" + f5);
		
		Fraction f6 = f1.reciprocal(f1);
		System.out.println(f1 + "/" + f1 + "=" + f6);


		//Add code to multiply f1 and f2 here done
		
		//Add code to call reciprocal here
		
		//create 2 new fractions and add them here.
		
			
		

	}
    
}

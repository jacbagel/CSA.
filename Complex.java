public class Complex {
    private double a;
    private double b;
    public static void main(String[] Args){
        Complex complex1 = new Complex(7,5);
        Complex complex2 = new Complex(5,7);
        System.out.println(complex1.abs());
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.toString());
    } 

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Complex(double a){
        this(a, 0.0);
    }

    public double abs(){
        if(b != 0.0){
            return Math.sqrt(a*a + b*b);
        }
        return b;
    }

    public Complex add(Complex other){ //has a name why its not a constructor 
        return new Complex((a + other.a),(b + other.b));
    }

    public String toString(){
        return a + " + " + b + "i";
    }

    public Complex multiply(Complex other){
        
        
        // i*i= -1 
        // a*other.a + a*other.b +b*other.a + b*other.b 
        return 
    }

}

public class Factorials {
public static void main(String [] args){
    Factorials nF = new Factorials();
    //System.out.println(nF.calcFactorial(4)); //24
    //System.out.println(nF.calcFactorial(8)); //40320
    // for(int a = 1; a <= 10; a++){
    //     System.out.println(nF.calcFactorial(a)); //1,2,6,24,120,720,5040,40320,362880,3628800
    // }
    // for(int a = 1; a <= 20; a++){
    //     System.out.println(nF.calcFactorial(a)); //2.432902 X 10^18
    // }
}

public long calcFactorial(int a){
    // Ex: print sum of (4*3*2*1), going from a to 1
    long sum = 1;
    for(int i = a; i > 1; i--){
        sum = i * sum;
    }
    return sum;
}

public double calcE(double e){
    
}

}


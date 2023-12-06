public class WhileLoops {
    public static void main(String [] args){
        WhileLoops ab = new WhileLoops();
        // System.out.println(ab.addOdds(5));
        // System.out.println(ab.addOdds(37));
        // System.out.println(ab.addOdds(100));

        // System.out.println(ab.sumDigits(5384)); //20
        // System.out.println(ab.sumDigits(12)); //3
        // System.out.println(ab.sumDigits(456)); //15

        // System.out.println(ab.howManyYears(111.2, 120)); //1
        // System.out.println(ab.howManyYears(111.2, 150)); //3
        
        ab.printSum(6); //21
    }
    
    public int addOdds(int n){
        int sum = 1;
        int i = 1;
        while(i>=1 && i<n){
            i = i+2;
            sum = sum + i;
        }
        return sum;    
    }

    public int sumDigits(int t){
        int sum = 0;
        while(t > 0){
            int l = t%10; //gets lastdigit
            sum += l;
            t = t /10; //eliminates last digit
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        // will reutrn x year to get to y population
        // going at a rate of 1.13 per year
        int y = 0;
        while(startpop <= endpop){
            y += 1;
            startpop = startpop * 1.13;
        }
        return y;
    }

    public void printSum(int n){
        // ex: n = 6, would print out 1+2+3+4+5+6=21
        int sum = 1;
        while (n >= 0){
            n -= 1; // correct
            //sum = sum%10;
            sum += 1;
        }
        System.out.println();
    }
}

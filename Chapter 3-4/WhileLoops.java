public class WhileLoops {
    public static void main(String [] args){
        WhileLoops ab = new WhileLoops();
        System.out.println(ab.addOdds(5));
        System.out.println(ab.addOdds(37));
        System.out.println(ab.addOdds(100));

        System.out.println(ab.sumDigits(5384)); //20
        System.out.println(ab.sumDigits(12)); //3
        System.out.println(ab.sumDigits(456)); //15

        System.out.println(ab.howManyYears(111.2, 120)); //7
        System.out.println(ab.howManyYears(111.2, 150)); // 27
        
        ab.printSum(6); //21
        ab.printSum(8); //36

        System.out.println(ab.isPerfectSquare(25)); //true
        System.out.println(ab.isPerfectSquare(24)); //false
        System.out.println(ab.isPerfectSquare(49)); //true
        System.out.println(ab.isPerfectSquare(13)); //false
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
        // will reutrn y year to get to x population
        // going at a rate of 1.13 per year
        int y = 0;
        while(startpop <= endpop){
            y += 1;
            startpop = (startpop * 0.0113) + startpop;
        }
        return y;
    }

    public void printSum(int n){
        // ex: n = 6, would print out 1+2+3+4+5+6=21
        int sum = 0;
        int x = 0;
        while (n > 0){
            n -= 1; 
            sum ++;
            sum = sum + n;
            x++;
            if (n == 0){
                System.out.print(x + " ");
            }
            else{
                System.out.print(x + " + ");
            }
        }
        System.out.println("= " + sum);
    }

    public boolean isPerfectSquare(int n){
        // write perfect suare as a sum of x consecutive odd numbers
        // ex: n=25 so 1+3+5+7+9
        int sum = 0;
        int x = 1;
        while ( sum < n ){
            sum = sum + x;
             x = x + 2;
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
}

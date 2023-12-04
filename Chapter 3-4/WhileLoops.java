public class WhileLoops {
    public static void main(String [] args){
        WhileLoops ab = new WhileLoops();
        System.out.println(ab.addOdds(5));
        System.out.println(ab.addOdds(37));
        System.out.println(ab.addOdds(100));
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
        while(sum){

        }
    }
}

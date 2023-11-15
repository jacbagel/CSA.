public class MoreConditionals{
    public static void main(String[] arg){
        MoreConditionals ab = new MoreConditionals();
        System.out.println(ab.isSooner(1,2,2010,1,2,2011));
    }
    public boolean isLeapYear(int year){
        if ((year / 4) && (year/100 || year/400))
        {
            return true;
        }
        else(){
            return false;
        }
    
    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 > year2){
                return true;
            }
        else if(year1 == year2){
            if (month1 > month2){
                return true;
            }
            else if(month1 == month2){
                if(day1 > day2)
                return true;
            }
        }
        else{
            return false;
        }
    }
    
    public int findBestFit(int space, int size1, int size2){
        if(space <= (size1 + size2)){
            return 3;
        }
        else if(space <= (size1 > size2)){
            return 1;
        }
        else if(space <= (size1 < size2)){
            return 2;
        }
        else if(space == ( size1 || size2)) {
                return 1;
            }
        else{
            return 0;
        }
    }

    public boolean makeBenches(int small, int big, int goal){
        int b = big * 5;
        if ((b+small)<= goal){
            return true:
        }
        
    }
}

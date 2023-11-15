public class mathex {
    public static void main(String [] args){
        int swapper1 = swap(132);
        int swapper2 = swap(231);
        int swapper3 = swap(456);
        System.out.println(swapper1);
        System.out.println(swapper2);
        System.out.println(swapper3);

        timeLeft(1,15,4,36);
        timeLeft(1,34,8,20);

       
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6,22));
        System.out.println(dayOfWeek(5,4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));

    }
    public static int swap(int x){
        int hundred = x/100*100;
        int ten = x%100/10;
        int one = x%100%10*10;
        int result = hundred + ten + one;
        return result;
    }
    
    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
      int mytime = (curHour*60) + curMin;
      int furtime = (depHour*60) + depMin;
      int deptimeh = (furtime - mytime)/60;
      int deptimem = (furtime- mytime)%60;
      System.out.println( deptimeh + " hours and " + deptimem + " minutes");

    }
    public static int dayOfWeek(int pos_jan_1, int date_in_jan){
        // int number_of_weeks = date_in_jan%7;
        // int position = date_in_jan - (7*number_of_weeks);
        int position = (date_in_jan + 6 + pos_jan_1)%7 ;
        return position;

        //day of month(date in jan) % 7 = full weeks untill day of week, take day - 7 * full weeks = answer

    }
}

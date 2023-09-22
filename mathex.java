public class mathex {
    public static void main(String [] args){
        int swapper1 = swap(132);
        int swapper2 = swap(231);
        int swapper3 = swap(456);
        System.out.println(swapper1);
        System.out.println(swapper2);
        System.out.println(swapper3);
    }
    public static int swap(int x){
        int hundred = x/100*100;
        int ten = x%100/10;
        int one = x%100%10*10;
        int result = hundred + ten + one;
        return result;
    }
    
}

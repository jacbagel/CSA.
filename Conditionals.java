public class Conditionals{

    public static void main(String [] arg){
        Conditionals ab = new Conditionals();
        //System.out.println(ab.chimpTrouble(true, true));
        //System.out.println(ab.chimpTrouble(false, false));
        //System.out.println(ab.chimpTrouble(true, false));
        //System.out.println(ab.chimpTrouble(false, true));

        System.out.println(ab.negPos(1,-1,false));
        System.out.println(ab.negPos(-1,1,false));
        System.out.println(ab.negPos(1,1,false));
        System.out.println(ab.negPos(-1,-1,false));
        System.out.println(ab.negPos(-4,-5, true));
        System.out.println(ab.negPos(-4,5,true));
        System.out.println(ab.negPos(4,5,true));
        System.out.println(ab.negPos(4,-5,true));

    }
    public  boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
            return true;
        }
        else{
            return false;
        }
        }

    public boolean negPos(int p, int n, boolean m){
        if (m == true){
            if ((p < 0) && (n < 0)){
            return true;
            }
            else {
            return false;
            }
        }
        else{
            if ((p > 0) && (n < 0) || (p < 0) && (n > 0)){
            return true;
            }
            else{
                return false;
            }
        }
    }
    
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep == true){
            if (isMom == true)
            return true;
            else 
            {
            return false;
            }
        else ()
        }
    }

}


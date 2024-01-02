public class Forloops {
   public static void main(String[] args) {
           Forloops nfl = new Forloops();
           System.out.println(nfl.addEvens(7));
           System.out.println(nfl.addEvens(9));
           System.out.println(nfl.addEvens(11));
           System.out.println();
           nfl.printSquaresBack(8);
           System.out.println();
           nfl.sillyNumbers();
           System.out.println();
           nfl.sillyNumbers2();
           System.out.println();
           nfl.dollarsAndStars();
   }


   public int addEvens(int n){
      int sum = 0;
       for (int i = 0; i <= n; i += 2) {
           sum += i;
           }
       return sum;
   }
   
   public void printSquaresBack(int n) {
       for (int i = n; i > 0; i--) {
           System.out.print(i * i + " ");
           }
   }
  
   public void sillyNumbers() {
       for (int a = 0; a < 3; a++) {
           for (int i = 0; i < 10; i++) {
           System.out.print(" " + i + i + i);
           }
       System.out.println();
       }
   }
   
   public void sillyNumbers2() {
       for (int i = 0; i < 4; i++) {
           for (int j = 9; j > 0; j--) {
               for (int k = 0; k < j; k++) {
                   System.out.print(j);
               }
           }
       System.out.println();
       }
   }
   
   public void dollarsAndStars() {
       for (int i = 0; i < 7; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print("**");
           }
           for (int k = 7; k > i; k--) {
               System.out.print("$");
           }
           for (int l = 7; l > i; l--) {
               System.out.print("**");
           }
           for (int b = 7; b < i; b--) {
               System.out.print("**");
           }
           for (int k = 7; k > i; k--) {
               System.out.print("$");
           }
           for (int y = 0; y < i; y++) {
           System.out.print("**");
           }
           System.out.println();
       }
   }


}


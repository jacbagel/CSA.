public class AdvandcedForloops {
    public static void main(String[] args) {
        AdvandcedForloops afl = new AdvandcedForloops();
//1
        System.out.println();
        System.out.println("eights");
        System.out.println();
        afl.eights();
//2
        System.out.println("alternate");
        System.out.println();
        afl.alternate(5);
        System.out.println();
        afl.alternate(6);
//3
        System.out.println("isosceles");
        System.out.println();
        afl.isosceles(5);
//4
        System.out.println("upsidedown");
        System.out.println();
        afl.upSideDown(9, 5);
        System.out.println();
        afl.upSideDown(8, 6);
    }
    
    public static void eights() {
        for (int i = 8; i > 0; i -= 2) {
            for (int k = 0; k < 8 - i; k += 2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void alternate(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; i % 2 != 0 && j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i; i % 2 == 0 && k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void isosceles(int num) {
        for (int i = 1; i <= num; i++) {
            for (int c = 0; c < num - i; c++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void upSideDown(int num1, int num2) {
        for (int i = 0; i <= num1 - num2; i++) {
            for (int c = 0; c < i; c++) {
                System.out.print(" ");
            }
            for (int j = num1 - i; j >= num2; j--) {
                System.out.print(j);
            }
            for (int k = num2 + 1; k <= num1 - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
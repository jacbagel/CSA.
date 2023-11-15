public class Methods {
    public static void main(String [] args){
        method1(5);
        method1(92);
        int r1 = method2("Arjun", 7);
        System.out.println(r1);
        int r2 = method2("Serena", 8);
        System.out.println(r2);
        System.out.println(method3(4,5.5));
        // int r3 = method3(4,5.5);
        // System.out.println(r3);

    }
    public static double method3(int y, double z){
        double answer = y+6*z-2;
        return answer;

    }
    public static int method2(String name, int x){
        System.out.println("Hello " + name);
        int rem =x%2;
        return rem;

    }
    public static void method1(int x){
        int y = x + 1;
        System.out.println("One more than " + y);

    }
}

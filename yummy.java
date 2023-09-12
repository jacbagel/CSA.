public class yummy {
    public static void main(String [] args){
        System.out.println("Yummy");
        chocolate();
        iceCream();
    }
    public static void chocolate(){
        System.out.print("Chocolate ");
        System.out.println("Cake");
    }
    public static void frenchFries(){
        System.out.println("French Fries with ketchup.");
        chocolate();
        System.out.println("That was yummy.");
    }
    public static void iceCream(){
        System.out.println("Ice");
        frenchFries();
        System.out.println("cream");
    }
}

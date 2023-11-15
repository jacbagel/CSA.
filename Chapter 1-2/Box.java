public class Box {
    private double length;
    private double width;
    private double height;
    private String color;
    private boolean hasALid;

    // constructor - creates/initializes an instance
    // of a class
    public Box(double l, double w, double h, String c, boolean lid){
        length = l;
        width = w;
        height = h;
        color = c;
        hasALid = lid;
    }
    // overload the constructor
    public Box(double l, double w, double h){
        length = l;
        width = w;
        height = h;
        color = "purple";
        hasALid = true;
    }
    // default constructor
    public Box(){
        length = 1.0;
        width = 1.0;
        height = 1.0;
        color = "white";
        hasALid = false;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        if(h>0){
            height = h;
        }
    }

    public double volume(){
        double v = length * width * height;
        return v;
    }
    public String toString(){
        String s = "A box with dimensions " + length + " " + width + " " + height;
        s+= "\nColor is " + color + " has a lid? " + hasALid;
        return s;
    }
    public boolean isTaller(Box other){
        double h = other.getHeight();
        if (height > h) return true;
        return false;
    }
    public static void main(String[] args){
        // create an instance
        Box b1 = new Box(6.5,8.3,9.4,"brown", false);
        Box b2 = new Box(3.6, 2.8,7.4);
        Box b3 = new Box();
        b3.setHeight(5.3);
        System.out.println(b3.getHeight());
        System.out.println(b1.getHeight());
        double v1 = b1.volume();
        System.out.println("The volume of box 1 "+v1);
        double v2 = b2.volume();
        System.out.println("The volume of box 2 "+v2);

        // print the box
        System.out.println(b1);
        System.out.println(b2);

        boolean f = b1.isTaller(b3);
        System.out.println("is b1 taller than b3 " + f);
    }
    
}
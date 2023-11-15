public class Circle {
    private double radius;
    
    public Circle(){
        radius = 1.1;
    }
    public Circle(double b){
        radius = b;
    }
    public double areaCircle(){
        double a = Math.PI * (radius * radius);
        return a;
    }
    public double circumference(){
        double c = 2 * radius * Math.PI;
        return c;
    }

}

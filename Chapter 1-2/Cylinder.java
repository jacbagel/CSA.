public class Cylinder {
    private double height;
    private Circle base;

    public Cylinder(){ //def. cons
        double radius = 1.1;
        height = 1.0;
        base = new Circle(radius);
    }
    public Cylinder(double r, double h){
        base = new Circle(r);
        height = h;
    }
    public double volume(){
        double vol = base.areaCircle() * height;
        return vol;
    }
    public double surfaceArea(){
        double sa = 2 * base.areaCircle() + height * base.circumference();
        return sa;
    }






}

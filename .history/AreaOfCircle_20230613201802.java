import java.util.*;
public class AreaOfCircle {
    public static final double PI = 3.142;// a Constant value
    static final String SHAPE = "Circle";/*A constant string */
    static float radius;
    public void getRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        radius = in.nextFloat();
    }
    public static double Area(){
        double area;
        area = PI*radius*radius;
        return area;
    }
    public static void main(String[] args) {
        AreaOfCircle obj1 = new AreaOfCircle();
        obj1.getRadius();
        System.out.println("Area of "+SHAPE+" is "+AreaOfCircle.Area());
        
    }
}

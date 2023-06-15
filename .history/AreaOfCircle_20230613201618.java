import java.util.*;
public class AreaOfCircle {
    static float radius;
    public static final double PI = 3.142;
    static final String SHAPE = "Circle";
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

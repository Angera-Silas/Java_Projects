import java.util.Scanner;

public class AreaOfCircle {
    static float radius;
    public static final float PI = (22/7);
    static final String SHAPE = "Circle";
    public void getRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        radius = in.nextFloat();
    }
    public static double Area(){
        double area;
        area = PI*radius*radius;
        return area
    }
}

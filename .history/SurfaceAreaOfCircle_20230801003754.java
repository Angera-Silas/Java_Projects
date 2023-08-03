import java.util.Scanner;

interface Crossection{
    public void getRadius();
    public double getArea();
}
interface Curvedsection extends Crossection{
    public void getHeight();
}
class GetDimensions{
    static final double PI = 3.142;
    double radius,height;
    public void getRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CYLINDER");
        radius = in.nextDouble();
    }
    public void getHeight(){
        Scanner inn = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CYLINDER");
        height = inn.nextDouble();
    }
}
public class SurfaceAreaOfCircle extends Get{
    public double getArea(){
        double area;
        area = PI*radius*radius;
        return 0;
    }
}

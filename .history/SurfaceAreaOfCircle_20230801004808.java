import java.util.Scanner;

interface Crossection{
    public void getRadius();
    public double crosSectionArea();
}
interface Curvedsection{
    public void getHeight();
    public double curvedArea();
}
class Dimension implements Crossection,Curvedsection{
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
    public double crosSectionArea(){
        double csa;
        csa = PI*radius*radius;
        return csa;
    }
    public double curvedArea(){
        double cva;
        cva = PI * 2 * radius * height;
        return cva;
    }
}
public class SurfaceAreaOfCircle extends Dimension{
    public double getArea(){
        double area;
        area = crosSectionArea()+cu
        return area;
    }
}

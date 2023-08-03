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
        System.out.println("ENTER THE HEIGHT OF THE CYLINDER");
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
public class SurfaceAreaOfCylinder extends Dimension{
    public double getArea(){
        double area;
        area = crosSectionArea()+curvedArea();
        return area;
    }
    public long getVolume(){
        long volume;
        volume = (long)((long)crosSectionArea() * height);
        return volume;
    }
    public static void main(String[] args) {
        SurfaceAreaOfCylinder obj1 = new SurfaceAreaOfCylinder();
        obj1.getRadius();
        obj1.getHeight();
        System.out.println("AREA OF THE CYLINDER IS: "+obj1.getArea());
        S
    }
}

import java.util.Scanner;

interface Crossection{
    public void getRadius();
    public double getArea();
}
interface Curvedsection extends Crossection{
    public void getHeight();
}
public class SurfaceAreaOfCircle implements Curvedsection{
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
    public double getArea(){
        return 0;
    }
}

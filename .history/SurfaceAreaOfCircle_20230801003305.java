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
        System.out.println("E");
    }
    public void getHeight(){
        Scanner in = new Scanner(System.in);

    }
    public double getArea(){
        return 0;
    }
}

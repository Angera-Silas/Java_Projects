import java.util.Scanner;

interface Crossection{
    public void getRadius();
    public double getArea();
}
interface Curvedsection extends Crossection{
    public void getHeight();
}
public class SurfaceAreaOfCircle implements Curvedsection{
    public double getArea(){
        double area;
        area = PI*radius*radius;
        return 0;
    }
}

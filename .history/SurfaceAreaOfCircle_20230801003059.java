import java.util.Scanner;

interface Crossection{
    public void getRadius();
    public double getArea();
}
interface Curvedsection extends Crossection{
    public void getHeight();
}
public class SurfaceAreaOfCircle implements Curvedsection{
    public void getRadius(){
        Scanner in = new Scanner(System.in)
    }
    public void getHeight(){

    }
    public double getArea(){
        return 0;
    }
}

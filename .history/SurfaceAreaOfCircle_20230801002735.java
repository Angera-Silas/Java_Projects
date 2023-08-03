interface Crossection{
    public void getRadius();
    public double getArea();
}
interface Curvedsection extends Crossection{
    public void getHeight();

}
public class SurfaceAreaOfCircle implements Curvedsection{
    public void getRadius(){

    }
    public void getHeight(){

    }
    public double getArea(){
        
    }
}

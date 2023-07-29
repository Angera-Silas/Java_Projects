import java.util.Scanner;

public class AreaCircle {
    double radius;
    final double PI = 3.142;
    public void GetRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
        radius = in.nextDouble();
    }
    
    public void display(){

    }
}
class AreaRectangle extends AreaCircle{

}

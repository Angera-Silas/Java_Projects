import java.util.Scanner;

public class AreaCircle {
    double radius;
    final double PI = 3.142;
    public void GetRadius(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF THE CIRCLE: ");
        radius = in.nextDouble();
    }

    public void Getarea(){
        double area;
        area = PI*radius*radius;
        System.out.println("Area is "+area);
    }
}
class AreaRectangle extends AreaCircle{
    public void Getdimensions(){
        
        System.out.println("ENTER THE LENGTH AND WIDTH");
        width = in.nextDouble();
        length = in.nextDouble();
    }
    public void Getarea(){
        double area;
        area = length*width;
        System.out.println("Area is "+area);
    }
    public static void main(String[] args) {
        AreaCircle obj1 = new AreaCircle();
        obj1.GetRadius();
        obj1.Getarea();
        AreaRectangle obj2 = new AreaRectangle();
        obj2.Getdimensions();
        obj2.Getarea();
    }
}

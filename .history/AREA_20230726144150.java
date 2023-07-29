import java.util.Scanner;

class AreaCircle{
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
        System.out.println("Area of is "+area);
    }
}
class AreaRectangle extends AreaCircle{
    double width;
    double length;
    public void Getdimensions(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND WIDTH");
        width = in.nextDouble();
        length = in.nextDouble();
    }
    public void Getarea(){
        double area;
        area = length*width;
        System.out.println("Area is "+area);
    }
}
public class AREA{
    public static void main(String[] args) {
        AreaRectangle obj1 = new AreaRectangle();
        obj1.GetRadius();
        obj1.Getdimensions();
        obj1.Getarea();
    }
}
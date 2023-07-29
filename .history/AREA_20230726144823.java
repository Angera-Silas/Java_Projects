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
        System.out.println("Area of Circle is "+area);
    }
}
class AreaRectangle extends AreaCircle{
    double width;
    double length;
    public void Getdimensions(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH public static void main(String[] args) {\n" + //
                "        AreaRectangle obj2 = new AreaRectangle();\n" + //
                "        obj2.Getdimensions();\n" + //
                "        obj2.Getarea();\n" + //
                "    }AND WIDTH");
        width = in.nextDouble();
        length = in.nextDouble();
    }
    public void Getarea(){//overidding this method
        double area;
        area = length*width;//calculating area of a rectangle
        System.out.println("Area of Rectangle is "+area);
        super.Getarea();//we call the method to calculate area of a circle
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
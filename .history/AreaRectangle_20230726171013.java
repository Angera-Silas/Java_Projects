import java.util.Scanner;

class A{
    double l,w,area;
    public void getArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND WIDTH");
        l = in.nextDouble();
        w = in.nextDouble();
        area = l*w;
        System.out.println("Area of rectangle is "+area);
    }
}
public class AreaRectangle extends A{
    public void getArea(){
        area = l*l;
        System.out.println("Area of a square is "+area);
    }
    public static void main(String[] args) {
        AreaRectangle r = new AreaRectangle();
        r.getArea
    }
}

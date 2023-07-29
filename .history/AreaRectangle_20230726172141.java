import java.util.Scanner;
class A {
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
public class AreaRectangle extends A {
    @Override
    public void getArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ONE SIDE");
        l = in.nextDouble();
        area = l*l;
        super.getArea();//calls the method in super class
        System.out.println("Area of a square is "+area);
    }
    public static void main(String[] args) {
        AreaRectangle r = new AreaRectangle();
        r.getArea();//calls the method in subclass
    }
}

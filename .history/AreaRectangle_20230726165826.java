import java.util.Scanner;

class A{
    double l,w,area;
    public void getArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND WIDTH");
        l = in.nextDouble();
        w = in.nextDouble();
        area = l*w;
        System.out.println("Area of rectangle is ");
    }
}
public class AreaRectangle extends A{
    
}

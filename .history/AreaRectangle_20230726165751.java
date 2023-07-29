import java.util.Scanner;

class A{
    double l,w,area;
    public void get(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND WIDTH");
        l = in.nextDouble();
        w = in.nextDouble();
        area = l*w;
    }
}
public class AreaRectangle extends A{
    
}

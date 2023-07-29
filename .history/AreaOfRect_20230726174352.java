import java.util.Scanner;
class A {
    double l;
    double w;
    double area;
    public void getArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND WIDTH");
        l = in.nextDouble();
        w = in.nextDouble();
        area = l*w;
        System.out.println("Area of rectangle is "+area);
    }
}
public class AreaOfRect extends A{
    @Override
    public void getArea(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ONE SIDE");
        l = in.nextDouble();
        area = l*l;
    }
    public void display(){
        super.getArea();//calls the method of the super class
        System.out.println("Area of a square is "+area);
    }
    public static void main(String[] args) {
        AreaOfRect obj1 = new AreaOfRect();
        obj1.getArea();//calling the method of the subclass
        obj1.display()
    }
}

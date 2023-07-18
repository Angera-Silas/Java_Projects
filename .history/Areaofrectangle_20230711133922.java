import java.util.Scanner;

public class Areaofrectangle {
    static float length;
    float width;
    public void dimensions(){
        Scanner in = new Scanner(System.in);
        System.out.println("How long is the length of the rectangle?");
        length = in.nextFloat();
        System.out.println("How long is the width of the rectangle?");
        width = in.nextFloat();
    }
    static void Area(){
        double area;
        area = length * width;
        System.out.println("Area of rectangle is "+area);
    }
    public static void main(String[] args) {
        Areaofrectangle obj1 = new Areaofrectangle();
        obj1.dimensions();
        Area();
    }
}

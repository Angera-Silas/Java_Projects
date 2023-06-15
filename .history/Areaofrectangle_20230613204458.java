import java.util.Scanner;

public class Areaofrectangle {
    float length = 0;
    float width
    public void dimensions(){
        Scanner in = new Scanner(System.in);
        System.out.println("How long is the length of the rectangle?");
        length = in.nextFloat();
        System.out.println("How long is the width of the rectangle?");
        width = in.nextFloat();
    }
    public double Area(){
        double area;
        area = length * width;
        System.out.println(area);
    }
    public static void main(String[] args) {
        Areaofrectangle obj1 = new Areaofrectangle();
        obj1.dimensions();
        obj1.Area();
    }
}

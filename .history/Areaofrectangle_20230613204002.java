import java.util.Scanner;

public class Areaofrectangle {
    public void dimensions(){
        float length;
        float width;
        Scanner in = new Scanner(System.in);
        System.out.println("How long is the length of the rectangle?");
        length = in.nextFloat();
        System.out.println("How long is the width of the rectangle?");
        width = in.nextFloat();
    }
    public void Area(){
        return (length*width);
    }
    public static void main(String[] args) {
        AreaOfCircle obj1 = new Areaofrectangle();
        obj1.dimensions();
        
    }
}

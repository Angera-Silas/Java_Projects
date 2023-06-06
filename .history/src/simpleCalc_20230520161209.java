import java.util.Scanner;
public class simpleCalc {
    long z;
    int x,y;
    public void add()
    {
        z = x+y;
        System.out.println("Sum is "+z);
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            simpleCalc objCalc = new simpleCalc();
            System.out.println("Enter the first value");
            objCalc.x = in.nextInt();
            System.out.println("Enter the second value");
            objCalc.y = in.nextInt();
            objCalc.add();
        }
    }
}

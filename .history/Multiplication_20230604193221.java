import java.util.Scanner;
public class Multiplication {
    float num1;
    float num2;
    float result;
    protected void getvalues(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value");
        num1 = in.nextFloat();
        System.out.println("Enter the second value");
        num2 = in.nextFloat();
        result = num1*num2;
        System.out.println("Product\t"+obj1.result);
    }
    public static void main(String[] args) {
        Multiplication obj1 = new Multiplication();
        obj1.getvalues();
    }
}

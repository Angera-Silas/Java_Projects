import java.util.Scanner;
public class Sum{
    public void getnums(){
        Scanner in = new Scanner(System);
        int num1 ;
        int num2 ;
        System.out.println("Enter the first value\n");
        num1 = in.nextInt();
        System.out.println("Enter the second value\n");
        num2 = in.nextInt();
        int num3 = num1+num2;
        System.out.println("Sum = "+num3);
    }
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        obj1.getnums();
    }
}
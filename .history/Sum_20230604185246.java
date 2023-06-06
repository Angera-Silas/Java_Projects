import java.util.Scanner;
public class Sum{
    public void getnums(){
        int num1 ;
        int num2 ;
        System.out.println("Enter the first value : ");
        int num3 = num1+num2;
        System.out.println("Sum = "+num3);
    }
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        obj1.getnums();
    }
}
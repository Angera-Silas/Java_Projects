import java.util.Scanner;

public class Factorial {
    static int num;
    static int fact = 1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        num = in.nextInt();
        for(int i=num;i>0;i--){
            fact =fact*i;
        }
        System.out.println("Factorial of "+);
    }
}

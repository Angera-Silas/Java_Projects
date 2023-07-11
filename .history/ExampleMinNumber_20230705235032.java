import java.util.Scanner;

public class ExampleMinNumber {
    public static void main(String[] args) {
        int a,b;
        double c,d;
        System.out.println("ENTER THE VALUES OF a AND b");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("ENTER THE VALUES OF c AND d");
        c = in.nextDouble();
        d = in.nextDouble();
        int r1 = minFunction(a,b);
        int r2 = minFunction(c,d);
        System.out.println("Minimum value = "+r1);
        System.out.println("Minimum value = "+r2);
    }
    public static int minFunction(int num1,int num2){
        int min;
        if (num1>num2) {
            min = num2;
        } else {
            min = num1;
        }
        return m
    }
}

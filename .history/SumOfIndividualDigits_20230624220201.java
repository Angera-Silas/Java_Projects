import java.util.Scanner;

public class SumOfIndividualDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Enter a number to find o");
        num = in.nextInt();
        while (num!=0) {
            int digit = num%10;
            sum = sum+digit;
            num/=10;
        }
        System.out.println("Sum is "+sum);
    }
}

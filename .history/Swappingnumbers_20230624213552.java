import java.util.Scanner;

public class Swappingnumbers {
    public static void main(String[] args) {
        float first;
        float second;
        float
        Scanner input = new Scanner(System.in);
        System.out.println("This prgram is meant to swap two numbers entered \nEnter the first number");
        first = input.nextInt();
        System.out.println("Entered the second number");
        second = input.nextInt();
        System.out.println("Before swap:\n First Number = "+first+"\n Second Number = "+second);
        
        System.out.println("After swap:\n First Number = "+first+"\n Second Number = "+second);

    }
}
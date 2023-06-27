import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        float first;
        float second;
        Scanner input = new Scanner(System.in);
        System.out.println("This prgram is meant to swap two numbers entered \nEnter the first number");
        first = input.nextInt();
        System.out.println("Entered the second number");
        second = input.nextInt();
        first = first - second;//This will subtract the second number from the first number
        second = first + second;//we now add the second number to the answer gotten above to make second==first
        first = second - first;//giving the second value to first
        System.out.pri

    }
}

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class SquareRoot {
    static double num,sq;
    static int choice;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("What do you wish to calculate \n1. Square-root \n2. power");
            choice = in.nextInt();
            if (choice == 1){
                System.out.println("Enter a number to find its square root");
                num = in.nextDouble();
                sq = Math.sqrt(num);
                System.out.println("Square root of "+num+ " is ["+sq+"]");
            }
            else if(choice == 2){
                double power;
                System.out.println("Enter a base number to raise it to a power");
                num = in.nextDouble();
                System.out.println("To what power do you want to raise"+num);
                power = in.nextDouble();
                sq = Math.pow(num,power);
                System.out.println("Power of "+num+ " To "+power+" is ["+sq+"]");
            }
            else {
                System.out.println("Invalid choice!.Please try again later");
            }
        } catch (Exception e) {
            System.out.println("Oops Sorry An internal erro");
        }
    }
}

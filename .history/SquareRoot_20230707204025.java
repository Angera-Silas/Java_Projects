import java.util.Scanner;

public class SquareRoot {
    static double num,sq;
    static int choice;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What do you wish to calculate \n1. Square-root \n2. power");
        choice = in.nextInt();
        if (choice == 1){
            System.out.println("Enter a number to find its square root");
            num = in.nextDouble();
            sq = Math.sqrt(num);
            System.out.println("Square root of "+num+ " is ["+sq+"]");
        }
        else if(choice == 2){
            System.out.println("Enter a number to raise it to a po");
            num = in.nextDouble();
            sq = Math.sqrt(num);
            System.out.println("Square root of "+num+ " is ["+sq+"]");
        }
    }
}

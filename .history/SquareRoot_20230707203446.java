import java.util.Scanner;

public class SquareRoot {
    static double num,sq;
    static String choice;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a number to find its square root");
        num = in.nextDouble();
        sq = Math.sqrt(num);
        System.out.println("Square root of "+num+ " is ["+sq+"]");
    }
}

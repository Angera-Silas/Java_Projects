import java.util.*;

public class Calculator {
    static long num1;
    static long num2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long result;
        boolean done;
        done = true;/*
                     * set to true to help the while loop
                     * iterate until the user chooses to quit
                     */
        int opt;/* The int is used to take in options */
        while (done) {
            try {
                System.out.println("What do you wish to do? \n1.add\n2.subtract\n3.multiply\n4.divide\n5.quit");
                opt = in.nextInt();
                if (opt == 1) {
                    System.out.println("Enter the first value");
                    num1 = in.nextInt();
                    System.out.println("Enter the second value");
                    num2 = in.nextInt();
                    result = num1 + num2;
                    System.out.println("Sum is : " + result);
                } else if (opt == 2) {
                    System.out.println("Whats the first value");
                    num1 = in.nextInt();
                    System.out.println("Enter the second value");
                    num2 = in.nextInt();
                    result = num1 - num2;
                    System.out.println("Differnce is : " + result);
                } else if (opt == 3) {
                    System.out.println("Enter the first number");
                    num1 = in.nextInt();
                    System.out.println("Enter the second number");
                    num2 = in.nextInt();
                    result = num1 * num2;
                    System.out.println("Product is " + result);
                } else if (opt == 4) {
                    System.out.println("Enter the Divident");
                    num1 = in.nextInt();
                    System.out.println("Enter the Divisor");
                    num2 = in.nextInt();
                    result = num1 / num2;
                    System.out.println("Quotient is " + result + " & Remainder is " + (num1 % num2));
                } else if (opt == 5) {
                    break;
                } 
                else
                {
                    throw new Exception("Kindly check your inumbers and not alphabets");
                }
            } catch (Exception e) {
                System.out.println("Error"+e);
                done = false;
            }
        }
    }
}

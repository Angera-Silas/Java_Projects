import java.util.*;
public class Calculator {
    static int num1;
    static int num2;
    stalong result;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean done;
        done = true;
        int opt;
        while (done) 
        {
            System.out.println("What do you wish to do? \n1.add\n2.subtract\n3.multiply\n4.divide\n5.quit");
            opt = in.nextInt();
            if (opt == 1) {
                System.out.println("Enter the first value");
                num1 = in.nextInt();
                System.out.println("Enter the second value");
                num2 = in.nextInt();

            }
            else if(opt==2)
            {
                System.out.println("Whats the first value");
                num1 = in.nextInt();
                System.out.println("Enter the second value");
                num2 = in.nextInt();
            }
            else if(opt==3)
            {
                System.out.println("Enter the first number");
                num1 = in.nextInt();
                System.out.println("Enter the second number");
                num2 = in.nextInt();
            }
            else if(opt==4){
                System.out.println("Enter the Divident");
                num1 = in.nextInt();
                System.out.println("Enter the Divisor");
                num2 = in.nextInt();
                result = 
            }
            else if(opt == 5)
            {
                break;
            }
            else
            {
                System.out.println("Enter a valid choice kindly");
            }
        }
    }
}

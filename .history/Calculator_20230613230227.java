import java.util.*;
public class Calculator {
    int num1;
    int num2;
    long result;
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
                num1 = in.nextInt()
                System.out.println("Enter the second value");

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

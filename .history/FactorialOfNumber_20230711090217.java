import java.util.Scanner;
public class FactorialOfNumber {
    static long number,factorial;
    static long Factorial(long num){
        if (num<=1){
            return 1;
        }
        else{
            return num*Factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO FIND ITS FACTORIAL");
        number = in.nextLong();
        factorial = Factorial(number);
        System.out.println("The factorial of "+number+" is ")
    }
}

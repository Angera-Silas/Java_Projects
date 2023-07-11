import java.util.Scanner;
public class FactorialOfNumber {
    static long Factorial(long num){
        if (num<=1){
            return 1;
        }
        else{
            return num*FactorialOfNumber(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }
}

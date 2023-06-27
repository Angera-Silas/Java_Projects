import java.util.Scanner;

public class ReversingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int reversednums = 0;
        System.out.println("Enter an number to be displayed in reverse order");
        num = in.nextInt();
        while(num!=0){
            int digit = num%10;
            reversednums = reversednums*10 + digit
        }
    }
}

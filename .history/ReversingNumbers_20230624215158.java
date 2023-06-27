import java.util.Scanner;

public class ReversingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int reversednums = 0;
        System.out.println("Enter an number to be displayed in reverse order");
        num = in.nextInt();
        while(num!=0){
            int digit = num%10;/*we store the remainder of num/10 so that the digit contains 
            the last digit of the number which is added to reversednums*/
            reversednums = reversednums*10 + digit;/*we multiply by 10 so that if it was the one-th place
            it becomes the tenth and then it will move to hundredth ......then it moves up to the  */
            num/=10;
        }
        System.out.println("Reversed Number : "+reversednums);
    }
}

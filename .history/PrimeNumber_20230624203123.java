import java.util.*;
public class PrimeNumber {
    static int num;
    public static void main(String[] args){
        boolean nonPrime = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even");
        num = in.nextInt();
        for(int i=2;i<=num/2;++i){
            //check if it is a non prime
            if(num%i==0){
                nonPrime = true;
                break;
            }
        }
        if(!nonPrime){
            System.out.println(num +" Is a prime number")
        }else{
            System.out.print
        }
    }
}

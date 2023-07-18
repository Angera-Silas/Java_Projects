import java.util.*;
public class PrimeNumber {
    static int num;
    public static void main(String[] args){
        boolean nonPrime = false;//We set the value of nonPrime number to false
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even");
        num = in.nextInt();
        for(int i=2;i<=num/2;++i){
            //check if it is a non prime
            if(num%i==0){
                nonPrime = true;//if the number is divisible by any number then its a non prime number
                break;//so we move out of the loop
            }
        }
        if(!nonPrime){//if the number was found to be non prime above then we tell the user
            System.out.println(num +" Is a prime number");
        }else{
            System.out.println(num+" Is not a prime number");
        }
    }
}

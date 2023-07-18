import java.util.Scanner;
public class StoreInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        n = in.nextInt();
        int[] nums = new int[n];//we declare an array of a given size n
        double sum = 0;
        for(int i = 0;i<n;i++){//loop through the array using a for loop
            System.out.println("ENTER VALUE "+(i+1));
            nums[i] = in.nextInt();// Storing values in the array
        }
        System.out.println("The elements entered are: ");
        for (int j: nums){//using a for each loop to read though our array values
            System.out.println(j);
            sum+=j;
        }
        double average = sum/(nums.length);
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
    }
}

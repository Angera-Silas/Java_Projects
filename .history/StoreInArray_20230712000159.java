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
            System.out.println("Enter value "+(i+1));
            nums[i] = in.nextInt();
        }
        System.out.println("The array elements entered are: ");
        for (int j: nums){//using a for each loop to read though 
            System.out.println(j);
            sum+=j;
        }
        double average = sum/(nums.length);
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
    }
}

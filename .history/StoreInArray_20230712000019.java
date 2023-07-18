import java.util.Scanner;
public class StoreInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        n = in.nextInt();
        int[] nums = new int[n];//we
        double sum = 0;
        for(int i = 0;i<n;i++){
            System.out.println("Enter value "+(i+1));
            nums[i] = in.nextInt();
        }
        System.out.println("The array elements entered are: ");
        for (int j: nums){
            System.out.println(j);
            sum+=j;
        }
        double average = sum/(nums.length);
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
    }
}

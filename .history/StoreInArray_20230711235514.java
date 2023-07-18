import java.util.Scanner;
public class StoreInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        long sum = 0;
        for(int i = 0;i<10;i++){
            System.out.println("Enter value "+(i+1));
            nums[i] = in.nextInt();
        }
        System.out.println("The array elements entered are: ");
        for (int j: nums){
            System.out.println(j);
            sum+=j;
        }
        double average = sum/(nums.length);
        System.out.println("Sum is +sum");
        System.out.println(j);
    }
}

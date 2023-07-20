import java.util.Scanner;

public class TimeConverter {
    static double time,seconds;
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want want to convert to seconds".toUpperCase());
        System.out.println("1. Minutes \n2. Hours \n3. Days");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number of minutes".toUpperCase());
                time = in.nextDouble();
                seconds = time * 60;
                System.out.println(time +" Minutes = " +seconds + "Seconds");
                break;
            case 2:
                System.out.println("Enter the number of Hours".toUpperCase());
                time = in.nextDouble();
                seconds = time * 3600;
                System.out.println(time +" Hours = " +seconds + "Seconds");
                break;
            case 3:
                System.out.println("Enter the number of Days".toUpperCase());
                time = in.nextDouble();
                seconds = time * 24 * 3600;
                System.out.println(time +" Days = " +seconds + "Seconds");
                break;
            default:
                System.out.println("Kindly ");
                break;
        }
    }
    
}

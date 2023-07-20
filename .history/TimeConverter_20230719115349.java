import java.util.Scanner;

public class TimeConverter {
    static double time,seconds;
    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want want to convert to seconds");
        System.out.println("1. Minutes \n2. Hours \n3. Days");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number");
                break;
        
            default:
                break;
        }
    }
    
}

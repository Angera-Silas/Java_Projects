import java.util.Scanner;
public class StudentInfo {
    String name;
    int age;
    float fees;
    String regno;
    public void getinfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student name");
        name = in.nextLine();
        System.out.println("Enter the age");
        age = in.nextInt();
        System.out.println("What is the Scholl fees paid per year?");
        fees = in.nextFloat();
        System.out.println("Enter student registration number");
        regno = in.nextLine();
    }
    public void displayinfo(){
        System.out.println("Name:\t"+name);
        System.out.println("Age:\t"+age);
        System.out.println("Fees Paid:\t"+fees);
        System.out.println("Registration Number:\t"+regno);
    }
}
public void 
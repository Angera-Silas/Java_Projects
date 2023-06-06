import java.util.Scanner;
public class StudentInfo {
    public void getinfo(){
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        float fees;
        char regno;
        System.out.println("Enter the student name");
        name = in.nextLine();
        System.out.println("Enter the age");
        age = in.nextInt();
        System.out.println("What is the Scholl fees paid per year?");
        fees = in.nextFloat();
        System.out.println("Enter student registration number");
        regno = in.next();
    }
    public void displayinfo(){
        System.out.println("Name:\t"+name);
        System.out.println("Name:\t"+name);
        System.out.println("Fees :\t"+name);
        System.out.println("Registration Number:\t"+regno);
    }
}

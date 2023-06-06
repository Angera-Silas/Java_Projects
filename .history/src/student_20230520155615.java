import java.util.Scanner;
public class student {
    String name;
    int age;
    char rollno;
    public void getinfo(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student name");
        name = in.nextLine();
        System.out.println("Enter students age");
        age = in.nextInt();
    }
    public void displayinfo()
    
}

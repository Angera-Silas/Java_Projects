import java.util.Scanner;
public class student {
    char name;
    int age;
    char rollno;
    public void getinfo(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student name");
        name = in.nextLine();

    }
}

import java.util.Scanner;

public class student {
    String name;
    int age;
    char rollno;

    public void getinfo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student name");
        name = in.nextLine();
        System.out.println("Enter students age");
        age = in.nextInt();
    }

    public void displayinfo() {
        System.out.println("Name : "+name);
        System.out.println(2 age);
    }

    public static void main(String[] args) {
        student stud1 = new student();
        stud1.getinfo();
        stud1.displayinfo();
    }
}
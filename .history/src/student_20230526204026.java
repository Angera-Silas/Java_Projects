import java.util.Scanner;

public class student {
    static String school = "Kabarak University";
    String name;
    int age;
    String rollno;

    public void getinfo() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter student name");
            name = in.nextLine();
            System.out.println("Enter student registration number : ");
            rollno = in.nextLine();
            System.out.println("Enter students age");
            age = in.nextInt();
        }
    }

    public void displayinfo() {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollno);
        System.out.println("Age : " +age);
    }

    public static void main(String[] args) {
        student stud1 = new student();
        System.out.println(student.school);
        stud1.getinfo();
        stud1.displayinfo();
    }
}
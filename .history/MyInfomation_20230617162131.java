import java.util.Scanner;
public class MyInfomation {
    static String name;
    static int age = 16;
    static float salary=10000;

    public static void main(String[] args) {
        Scanner intake = new Scanner(System.intake);
        System.out.println("Whats your name ?");
        name = intake.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

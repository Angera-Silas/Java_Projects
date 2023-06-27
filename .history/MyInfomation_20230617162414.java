import java.util.Scanner;
public class MyInfomation {
    static String name;
    static int age = 16;
    static float salary=10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name ?");
        name = input.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

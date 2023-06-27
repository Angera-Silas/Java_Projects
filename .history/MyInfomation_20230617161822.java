import java.util.Scanner;
public class MyInfomation {
    static String name;
    static int age ;
    static float salary=10000;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.input);
        System.out.println("Whats your name");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

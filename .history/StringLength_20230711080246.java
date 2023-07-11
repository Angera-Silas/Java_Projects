import java.util.Scanner;
public class StringLength {
    static String name;
    static int number_of_letters;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name");
        name = in.nextLine();
        number_of_letters = name.length();
        System.out.println("The name "has " +number_of_letters+" Characters");
    }
}

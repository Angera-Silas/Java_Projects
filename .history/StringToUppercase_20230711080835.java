import java.util.Scanner;
public class StringToUppercase {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a name");
        name = in.nextLine();
        System.out.println("Name in uppercase" +name.toUpperCase());
        
    }
}

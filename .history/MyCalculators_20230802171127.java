import java.util.Scanner;

public class MyCalculators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String operation;
        int a,b,c;
        System.out.println("1. add\n2. subtract\n3. multiply\n4. divide");
        operation = in.nextLine();
        switch (operation) {
            case "add":
                System.out.println("Enter the first value");
                a = in.nextInt();
                System.out.println("Enter the second value");
                b = in.nextInt();
                c = a + b;
                System.out.println("Sum is: "+c);
                break;
            case "subtraction":
                System.out.println("Enter the first value");
                a = in.nextInt();
                System.out.println("Enter the second value");
                b = in.nextInt();
                c = a + b;
                System.out.println("Sum is: "+c);
            
            default:
                break;
        }
    }
}

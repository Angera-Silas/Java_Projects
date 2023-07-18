import java.util.*;
public class StringBufferAppend {
    public static void main(String[] args) {
        String name;
        StringBuffer sb = new StringBuffer("Your Name is ");
        Scanner in = new Scanner(System.in);
        System.out.println("Whats your name :");
        name = in.nextLine();
        sb.append(name);
        System.out.println(sb);
        
    }
}

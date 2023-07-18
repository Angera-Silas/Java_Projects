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
        /*We can also display in reverse order using the reverse method */
        System.out.println("The name in reverse: \n" +sb.reverse());
        /*if we want to delete some characters from the string we can use the delete method with
        *Parameters containing the start and end indexes respectively
         */
        sb.delete(4)
        System.out.println(sb);
    }
}

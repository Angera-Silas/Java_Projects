import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class AppendReplacement {
    private static String REGEX = "a";
    private static String INPUT = "The dog says meow. " + "All dogs say meow. ";
    private static String REPLACE = "cat";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //get a matcher object
        Matcher m = p.matcher(INPUT);
}

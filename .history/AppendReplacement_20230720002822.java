import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class AppendReplacement {
    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "_";
    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        //get a matcher object
        Matcher m = p.matcher(INPUT);
        String 
}

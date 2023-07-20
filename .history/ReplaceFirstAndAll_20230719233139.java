import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceFirstAndAll {
     private static final String REGEX = "dog";
    private static final String INPUT = "The dog says meow. " + "All dogs say meow";
    private static Pattern pattern;
    private static Matcher matcher;
    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
}

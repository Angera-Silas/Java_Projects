import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherAndLookat {
    private static final String REGEX = "foo";
    private static final String INPUT = "foooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.println("Current REGEX is: "+REGEX);
        
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexMatches {
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    public static void main(String[] args) {
        Pattern P = Pattern.compile(REGEX);
        Matcher m = P.matcher(INPUT);//get a matcher object
        int count = 0;
        while(m.find()){
            count++;
            System.out.println()
        }
    }
}

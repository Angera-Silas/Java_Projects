import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CapturingGroups {
    public static void main(String[] args) {
        //String To Be Scanned to find the pattern
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";
        //create a pattern object
        Pattern r = Pattern.compile(pattern);

        //Create matcher object
    }
}

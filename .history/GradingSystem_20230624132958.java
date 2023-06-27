import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GradingSystem {
    float score;
    private void getScore(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the scores of the student");
            score = reader.read();
        } catch (Exception e) {
            System.out.println("An internal error occured")
        }
    }
    public static void main(String[] args) {
        
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GradingSystem {
    String score;
    private void getScore(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the scores of the student");
            score = reader.readLine();
            score = (float)score;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        
    }
}

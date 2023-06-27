import java.util.*;
import java.io.*;
public class GradingSystem {
    int score;
    String name;
    private void getScore(){
        Bufferedreader reader= new BufferedReader(null, score)new BufferedInputStream(System.in);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the student name");
            name = reader.readLine();
            System.out.println("Enter the scores of the student");
            score = in.nextInt();
            if (score>=70) {
                System.out.println("A");
            }
            else if(score>=60){
                System.out.println("B");
            }
            else if(score>=50)
            {
                System.out.println("C");
            }
            else if(score>=40){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        } catch (Exception e) {
            System.out.println("An internal error occured");
        }
    }
    public static void main(String[] args) {
        GradingSystem obj1 = new GradingSystem();
        obj1.getScore();
    }
}

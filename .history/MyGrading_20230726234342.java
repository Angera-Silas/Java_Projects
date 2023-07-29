import java.util.Scanner;

class 
public class MyGrading {
    double mainexam;
    double cattotals = 0;
    public double GetMark(){
        int cats;
        int total;
        double catmark;
        double score;
        Scanner in = new Scanner(System.in);
        System.out.println("How many cats did the student do? \n1.");
        cats = in.nextInt();
        double[] cat = new double[cats];
        for(int i = 0;i<cats;i++){
            System.out.println("ENTER CAT "+(i+1)+" MARK");
            score = in.nextDouble();
            System.out.println("CAT "+(i+1)+"WAS MARKED OUT OF");
            total = in.nextInt();
            score = (score/total)*100;
            cat[i] = score;
            cattotals += i;
        }
        catmark = cattotals/cats;
        catmark = (catmark*30)/100;
        return catmark;
    }
}

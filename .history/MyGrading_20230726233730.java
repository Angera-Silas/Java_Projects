import java.util.Scanner;

public class MyGrading {
    double main_exam;
    double cat_totals = 0;
    public double GetCatMark(){
        int cats,total;
        double cat_mark,score;
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
            cat_totals += i;
        }
        cat_mark = cat_totals/cats;
        cat
        return cat_mark;
    }
}

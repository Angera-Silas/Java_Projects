import java.util.Scanner;

public class MyGrading {
    double main_exam;
    double cat_totals = 0;
    public double GetCatMark(){
        int cats;
        double cat
        Scanner in = new Scanner(System.in);
        System.out.println("How many cats did the student do? \n1.");
        cats = in.nextInt();
        double[] cat = new double[cats];
        for(int i = 0;i<cats;i++){
            System.out.println("ENTER CAT "+(i+1)+" MARK");
            cat[i] = in.nextDouble();
            cat_totals += i;
        }
        
    }
}

import java.util.Scanner;

public class MyGrading {
    double[] cat;
    double main_exam;
    public void GetCatMark(){
        int cats;
        Scanner in = new Scanner(System.in);
        System.out.println("How many cats did the student do? \n1.");
        cats = in.nextInt();
        for(int i = 0;i<cats;i++){
            System.out.println("ENTER CAT "+(i+1)+" MARK");
        }

    }
}

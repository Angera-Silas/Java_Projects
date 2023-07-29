import java.util.Scanner;

class MainExam {
    double mainexam;
    double examscore;

    public void getMark() {
        Scanner input = new Scanner(System.in);
        double score;
        int total;
        System.out.println("ENTER THE FINAL-EXAM MARKS");
        score = input.nextDouble();
        System.out.println("FINAL-EXAM WAS MARKED OUT OF");
        total = input.nextInt();
        score = (score / total) * 100;// converting the score to percentage
        mainexam = (score * 70) / 100;// removing from percentage to be out of 70
    }
}

public class MyGrading extends MainExam {
    double cattotals = 0;
    double catmark;

    @Override
    public void getMark() {
        int cats;
        int total;
        double score;
        Scanner in = new Scanner(System.in);
        System.out.println("How many cats did the student do? \n1.");
        cats = in.nextInt();
        double[] cat = new double[cats];
        for (int i = 0; i < cats; i++) {
            System.out.println("ENTER CAT " + (i + 1) + " MARK");
            score = in.nextDouble();
            System.out.println("CAT " + (i + 1) + "WAS MARKED OUT OF");
            total = in.nextInt();
            score = (score / total) * 100;//converting the cat marks into percentage
            cat[i] = score;//storing the percentages in an array
            super.getMark();// calling the super method to take in exam mark
        }
        for (double d : cat) {
            cattotals = cattotals+d;//finding the total cat marks
        }
        catmark = cattotals / cats;
        catmark = (catmark * 30) / 100;
    }

    public void displayGrade() {
        examscore = mainexam + catmark;
        if (examscore >= 70) {
            System.out.println("A");
        } else if (examscore >= 60) {
            System.out.println("B");
        } else if (examscore >= 50) {
            System.out.println("C");
        } else if (examscore >= 40) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
    public static void main(String[] args) {
        MyGrading stud1 = new MyGrading();
        stud1.getMark();
        stud1.displayGrade
    }
}

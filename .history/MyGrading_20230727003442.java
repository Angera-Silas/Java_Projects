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
class CatMark{
    
}
public class MyGrading extends MainExam {
    double cattotals = 0;
    double catmark;

    public void displayGrade() {
        System.out.println("Cat Marks: "+catmark+"\nMain Exam: "+mainexam);
        examscore = mainexam + catmark;// Final Exam Score
        if (examscore >= 70) {
            System.out.println("Average Mark: "+examscore+"\nGrade: "+"A");
        } else if (examscore >= 60) {
            System.out.println("Average Mark: "+examscore+"\nGrade: "+"B");
        } else if (examscore >= 50) {
            System.out.println("Average Mark: "+examscore+"\nGrade: "+"C");
        } else if (examscore >= 40) {
            System.out.println("Average Mark: "+examscore+"\nGrade: "+"D");
        } else {
            System.out.println("Average Mark: "+examscore+"\nGrade: "+"F");
        }
    }

    public static void main(String[] args) {
        MyGrading stud1 = new MyGrading();
        stud1.getMark();
        stud1.displayGrade();
    }
}

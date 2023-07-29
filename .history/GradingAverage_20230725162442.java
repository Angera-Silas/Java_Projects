import java.util.Scanner;

public class GradingAverage {
    public static void main(String[] args) {
        double cat1,cat2,exam,average;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Cat 1 mark out of 30");
        cat1 = in.nextDouble();
        System.out.println("Enter Cat 2 mark out of 30");
        cat2 = in.nextDouble();
        System.out.println("Enter Final exam mark out of 70");
        exam = in.nextDouble();
        average = exam + ((cat1+cat2)/2);
        if(average>70)
        {
            System.out.println("A");
        }
        else if (average>60)
        {
            System.out.println("B");
        }
        else if(average>50)
        {
            System.out.println("C");
        }
        else if(average>40){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}

import java.util.Scanner;

interface Employee{
    public void getGrossSalary();
    public double taxAmount();
}
class Taxation implements Employee{
    double gross_salary;
    double tax;
    public void getGrossSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE GROSS SALARY OF THE EMPLOYEE");
        gross_salary = in.nextDouble();
    }
    public double taxAmount(){
        return 0;
    }

}
public class NetSalary extends Taxation{
    double net_salary;
    public double netSalary(){
        return 0;
    }
}

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
        Syst
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

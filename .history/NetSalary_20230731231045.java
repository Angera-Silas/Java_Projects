import java.util.Scanner;

interface Employee{
    public void getGrossSalary();
    public double taxAmount();
}
class Taxation implements Employee{
    double gross_salary;
    public void getGrossSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE GROSS SALARY OF THE EMPLOYEE");
        gross_salary = in.nextDouble();
    }
    public double taxAmount(){
        double tax;
        if (gross_salary>50000) {
            tax = 0.25*gross_salary;
        }
        else if(gross_salary>20000){
            tax = 0.15*gross_salary;
        } else {
            tax = 0.1*gross_salary;
        }
        return tax;
    }

}
public class NetSalary extends Taxation{
    double net_salary;
    public double netSalary(){
        net_salary = gross_salary - taxAmount();
        return net_salary;
    }
    public void 
}

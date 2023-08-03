import java.util.Scanner;

interface Employee{
    public void getGrossSalary();
    public void taxAmount();
}
public class NetSalaries implements Employee{
    double gross_salary,tax;
    public void getGrossSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE GROSS SALARY OF THE EMPLOYEE");
        gross_salary = in.nextDouble();
    }
    public void taxAmount(){
        if (gross_salary>50000) {
            tax = 0.25*gross_salary;
        }
        else if(gross_salary>20000){
            tax = 0.15*gross_salary;
        } else {
            tax = 0.1*gross_salary;
        }
    }
    public void netSalary(){
        double net_salary;
        net_salary = gross_salary - tax;
        System.out.println("Net Salary: "+employee1.netSalary());
    }
    public static void main(String[] args) {
        NetSalaries employee1 = new NetSalaries();
        employee1.getGrossSalary();
        employee1.taxAmount();
    }
}

import java.util.Scanner;

interface Employee{
    public void getGrossSalary();
    public void taxAmount();
    public double netSalary()
}
public class NetSalaries implements Employee, NetSalaries{
    double gross_salary,tax;
    @Override
    public void getGrossSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE GROSS SALARY OF THE EMPLOYEE");
        gross_salary = in.nextDouble();
    }
    @Override
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
    @Override
    public void netSalary(){
        double net_salary;
        net_salary = gross_salary - tax;
        System.out.println("Net Salary: "+net_salary);
    }
    public static void main(String[] args) {
        NetSalaries employee1 = new NetSalaries();
        employee1.getGrossSalary();
        employee1.taxAmount();
    }
}

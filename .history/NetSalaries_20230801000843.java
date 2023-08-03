import java.util.Scanner;

interface Employe{
    public void getGrossSalary();
    public void taxAmount();
    public double netSalary();
}
public class NetSalaries implements Employe{
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
    public double netSalary(){
        double net_salary;
        net_salary = gross_salary - tax;
        return net_salary;
    }
    public void Display(){
        System.out.println("Gross Salary: "+gross_salary);
        System.out.println("Tax Amount: "+tax);
    }
    public static void main(String[] args) {
        NetSalaries employee1 = new NetSalaries();
        employee1.getGrossSalary();
        employee1.taxAmount();
        employee1.Display();
    }
}

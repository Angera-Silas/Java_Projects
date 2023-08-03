import java.util.Scanner;

interface Employee{
    public void getGrossSalary();
    public double taxAmount();
}
class Taxation implements Employee{
    double gross_salary;
    

}
public class NetSalary extends Taxation{
    
    private double netSalary(){
        double net_salary;
        net_salary = gross_salary - taxAmount();
        return net_salary;
    }
    public void Display(){
        System.out.println("Gross Payment: "+gross_salary);
        System.out.println("Tax Amount: "+taxAmount());
        System.out.println("Net Salary: "+netSalary());
    }
    public static void main(String[] args) {
        NetSalary employee1 = new NetSalary();
        employee1.netSalary();
        employee1.Display();
    }
}

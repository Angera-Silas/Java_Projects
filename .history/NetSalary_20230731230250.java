interface Employee{
    public void getGrossSalary();
    public double taxAmount();
    public double netSalary();
}
class Taxation implements Employee{
    double gross_salary;
    double tax;
    public void getGrossSalary(){

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

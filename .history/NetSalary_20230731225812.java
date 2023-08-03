interface Employee{
    public void getGrossSalary(){}
    public static double taxAmount(){
        return 0;
    }
    public static double netSalary(){
        return 0;
    }
}
class Taxation implements Employee{
    double gross_salary;
    double tax;
    public void getGrossSalary(){

    }
}
public class NetSalary extends Taxation{
    double net_salary;
}

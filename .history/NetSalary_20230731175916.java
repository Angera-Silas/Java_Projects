interface Employee{
    public static void getGrossSalary(){}
    public static double taxAmount(){
        return 0;
    }
    public static double netSalary(){
        return 0;
    }
}
class Taxation implements Employee{
    double gross_salary;
    double tax,net_salary;
    
}
public class NetSalary extends Taxation{
    
}

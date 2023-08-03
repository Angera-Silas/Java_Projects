interface Employee{
    public static void getGrossSalary(){}
    public static double taxAmount(){
        return 0;
    }
    public static double netSalary(){
        return0;
    }
}
class Taxation implements Employee{

}
public class NetSalary extends Taxation{
    
}

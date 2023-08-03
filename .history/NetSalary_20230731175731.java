interface Employee{
    public static void getGrossSalary(){}
    public static double taxAmount(){
        return 0;
    }
}
class Taxation implements Employee{

}
public class NetSalary extends Taxation{
    
}

interface Employee{
    public default void getGrossSalary(){
        
    }
}
class Taxation implements Employee{

}
public class NetSalary extends Taxation{
    
}

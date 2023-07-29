class Calculation{
    int z;
    public void addition(int x,int y){
        z = x+y;
        System.out.println("The sum of given numbers is "+z);
    }
    public void subtraction(int x,int y){
        z = x-y;
        System.out.println("The difference of given numbers is "+z);
    }
}
public class My_Calculation extends Calculation{
    public void multiplition(int x,int y){
        z = x*y;
        System.out.println("The product of given numbers is "+z);
    }
    public static void main(String[] args) {
        int 
        My_Calculation demo = new My_Calculation();
        demo.addition(a,b);
    }
}

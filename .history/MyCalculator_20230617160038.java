public class MyCalculator {
    int x=100;
    int y=7;
    int z;
    public void add(){
        z=x+y;
        System.out.println("sum is "+z);
    }
    public static void main(String[] args){
        MyCalculator obj1=new MyCalculator();
        obj1.add();
        obj1.subtract();
        obj1.multiplication();
        obj1.division();
    }
    public void subtract(){
        z=x-y;
        System.out.println("difference is "+z);
    }
    public void multiplication(){
        z=x*y;
        System.out.println("product is " +z);
    }
    public void division(){
        z=x/y;
        System.out.println("Quotient is "+z +"Remainder is" );

    }
}

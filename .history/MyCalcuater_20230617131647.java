public class MyCalcuater {
    int x=100;
    int y=7;
    int z;
    public void add(){
        z=x+y;
        System.out.println("sum is "+z);
    }
    public static void main(String[] args){
        MyCalcuater obj1=new MyCalcuater();
        obj1.add();
        obj1.subtract();
    }
    public void subtract(){
        z=x-y;
        System.out.println("difference is "+z);
        
    }
    
}

public class DoWhileLoopExample {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        float c;
        do {
            System.out.print(a+"\t");
            sum+=a;
            a++;
        } while (a<=20);
        c = sum; 
        System.out.println("Sum of the values is "+c);
    }
}

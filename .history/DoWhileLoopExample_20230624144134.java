public class DoWhileLoopExample {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        float c;
        int d;
        do {
            System.out.print(a+"\t");
            sum+=a;
            a++;
        } while (a<=20);
        c = sum; //implicitly converting an interger to a float(conversion)

        System.out.println("Sum of the values is "+c);
    }
}

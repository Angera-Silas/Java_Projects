public class DoWhileLoopExample {
    public static void main(String[] args) {
        int a = 10;
        int sum = 0;
        do {
            System.out.print(a+"\t");
            sum=+a;
            a++;
        } while (a<=20);
        System.out.println("Sum o"+sum);
    }
}

public class ContinueStatement {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50,60,70,80,90};
        for (int i : numbers) {
            if (i==50) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }
}

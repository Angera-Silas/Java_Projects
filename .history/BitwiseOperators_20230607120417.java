public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 60,b=13,c=0;
        c = a&b;
        System.out.println("a & b = "+c);
        c = a|b;
        System.out.println("a | b = "+c);
        c = a^b;
        System.out.println("a ^ b = "+c);
        c = ~a;
        System.out.println("~a  = "+c);
        c = a<<2;
        System.out.println("a <<2 = "+c);
        c = a>>2;
        System.out.println("a >>2= "+c);
        c = a;
        System.out.println("a & b = "+c);
    }
}

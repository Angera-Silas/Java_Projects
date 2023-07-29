interface Animal{}
class mammals implements Animal{}
public class Dog extends mammals{
    public static void main(String[] args) {
        mammals m = new mammals();
        Dog d = new Dog();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof mammals);
    }
}
